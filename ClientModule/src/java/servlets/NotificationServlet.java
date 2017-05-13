/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import beans.Requests;
import beans.ServiceProvider;
import beans.Transactions;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import listeners.Database;

/**
 *
 * @author Mai Radie
 */
@WebServlet(name = "NotificationServlet", urlPatterns = {"/NotificationServlet"})
public class NotificationServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession(false);

        // uncomment this pag may cookies na
//        if (session == null || session.getAttribute("user") == null) {
//            String url = response.encodeRedirectURL("NoSession.jsp");
//            response.sendRedirect(url);
//        } else {
            response.setContentType("text/html");

            Database db = (Database) getServletContext().getAttribute("db");
            System.out.println(db);

            // change client id = 1
            String sql = "SELECT DISTINCT * FROM request NATURAL JOIN sp WHERE client_id = 1 and status = 'accepted';";
            ResultSet rs;
            try {
                out.println(sql);
                rs = db.runSql(sql);

                ArrayList<Requests> requests = new ArrayList<Requests>();

//            Requests req = new Requests(
//                    rs.getString("request_id"),
//                    rs.getString("sp_id"),
//                    rs.getString("client_id"),
//                    rs.getString("status"),
//                    rs.getString("date"),
//                    rs.getString("time"),
//                    rs.getString("sched_id"));
                while (rs.next()) {

                    Requests req = new Requests();
                    req.setRequest_id(rs.getString("request_id"));
                    req.setSp_id(rs.getString("sp_id"));
                    req.setClient_id(rs.getString("client_id"));
                    req.setStatus(rs.getString("status"));
                    req.setDate(rs.getString("date"));
                    req.setTime(rs.getString("time"));
                    req.setSched_id(rs.getString("sched_id"));

                    ServiceProvider sp = new ServiceProvider();
                    sp.setSpId(rs.getString("sp_id"));

                }

                request.setAttribute("requests", requests);
                RequestDispatcher view = request.getRequestDispatcher("Notification.jsp");
                view.forward(request, response);
//            response.sendRedirect(request.)

            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

//    }

}
