/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import beans.Requests;
import classes.ServiceProvider;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
        if (session != null && session.getAttribute("userName") != null) {
            
            response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1.
            response.setHeader("Pragma", "no-cache"); // HTTP 1.0.
            response.setDateHeader("Expires", 0);

            PrintWriter out = response.getWriter();

            String client_id = (String) session.getAttribute("userName");

            String spid = request.getParameter("id");
            //   HttpSession session = request.getSession(false);
            response.setContentType("text/html");
            Requests req = null;
            ServiceProvider sp = null;
            try {
                Class.forName("com.mysql.jdbc.Driver");

                String connUrl = "jdbc:mysql://localhost:3306/tutorial?user=root&password=";
                Connection conn = DriverManager.getConnection(connUrl);

                String sql3 = "SELECT * FROM client where client_id = " + client_id;
                Statement st = conn.createStatement();
                ResultSet rs = st.executeQuery(sql3);
                String name = null;
                String lastname = null;
                if (rs.next()) {
                    name = rs.getString("firstname");
                    lastname = rs.getString("lastname");
                }

                request.setAttribute("name", name);
                request.setAttribute("lastname", lastname);

                String sql = "SELECT DISTINCT * FROM request NATURAL JOIN sp WHERE client_id =" + client_id;
                st = conn.createStatement();

                rs = st.executeQuery(sql);
                ArrayList<Requests> requests = new ArrayList<Requests>();
                ArrayList<ServiceProvider> spList = new ArrayList<ServiceProvider>();
                while (rs.next()) {

                    req = new Requests();
                    req.setRequest_id(rs.getString("request_id"));
                    req.setSp_id(rs.getString("sp_id"));
                    req.setClient_id(rs.getString("client_id"));
                    req.setStatus(rs.getString("status"));
                    req.setDate(rs.getString("date"));
                    req.setTime(rs.getString("time"));
                    req.setSched_id(rs.getString("sched_id"));

                    sp = new ServiceProvider();
                    sp.setFirstName(rs.getString("firstname"));
                    sp.setLastName(rs.getString("lastname"));
                    requests.add(req);
                    spList.add(sp);
                }

                rs.close();
                st.close();
                conn.close();

                request.setAttribute("reqs", requests);
                request.setAttribute("sp", spList);
                RequestDispatcher view = request.getRequestDispatcher("Notification.jsp");
                view.forward(request, response);

            } catch (ClassNotFoundException ex) {
                response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
            } catch (SQLException ex) {
                Logger.getLogger(NotificationServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {

            response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1.
            response.setHeader("Pragma", "no-cache"); // HTTP 1.0.
            response.setDateHeader("Expires", 0);
            response.sendRedirect("NoSession.jsp");
        }

        //   rs = db.runSql(sql);
//        ArrayList<Requests> requests = new ArrayList<Requests>();
//            Requests req = new Requests(
//                    rs.getString("request_id"),
//                    rs.getString("sp_id"),
//                    rs.getString("client_id"),
//                    rs.getString("status"),
//                    rs.getString("date"),
//                    rs.getString("time"),
//                    rs.getString("sched_id"));
//            while (rs.next()) {
//
//                Requests req = new Requests();
//                    req.setRequest_id(rs.getString("request_id"));
//                    req.setSp_id(rs.getString("sp_id"));
//                    req.setClient_id(rs.getString("client_id"));
//                    req.setStatus(rs.getString("status"));
//                    req.setDate(rs.getString("date"));
//                    req.setTime(rs.getString("time"));
//                    req.setSched_id(rs.getString("sched_id"));
//
//                    ServiceProvider sp = new ServiceProvider();
//                    sp.setSpId(rs.getString("sp_id"));
//
//                }
//            request.setAttribute("requests", requests);
//            RequestDispatcher view = request.getRequestDispatcher("Notification.jsp");
//            view.forward(request, response);
//            response.sendRedirect(request.)
    }

//    }
}
