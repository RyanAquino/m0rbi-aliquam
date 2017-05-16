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

/**
 *
 * @author Mai Radie
 */
@WebServlet(name = "RequestServlet", urlPatterns = {"/RequestServlet"})
public class RequestServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();

        //   HttpSession session = request.getSession(false);
        response.setContentType("text/html");

        try {
            Class.forName("com.mysql.jdbc.Driver");

            String connUrl = "jdbc:mysql://localhost:3306/tutorial?user=root&password=";
            Connection conn = DriverManager.getConnection(connUrl);

            String sql = "SELECT DISTINCT * FROM request NATURAL JOIN sp WHERE client_id = 1 and status = 'accepted';";
            Statement st = conn.createStatement();

            ResultSet rs = st.executeQuery(sql);
            ArrayList<Requests> requests = new ArrayList<Requests>();
            while (rs.next()) {

                Requests req = new Requests();
                req.setRequest_id(rs.getString("request_id"));
                req.setSp_id(rs.getString("sp_id"));
                req.setClient_id(rs.getString("client_id"));
                req.setStatus(rs.getString("status"));
                req.setDate(rs.getString("date"));
                req.setTime(rs.getString("time"));
                req.setSched_id(rs.getString("sched_id"));

                requests.add(req);

                ServiceProvider sp = new ServiceProvider();
                //  sp.setSpId(rs.getString("sp_id"));

            }
            rs.close();
            st.close();
            conn.close();
            out.println("ajajajajajajaj");
            request.setAttribute("requests", requests);
            RequestDispatcher view = request.getRequestDispatcher("Notification.jsp");

            view.forward(request, response);

        } catch (ClassNotFoundException ex) {
            response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
        } catch (SQLException ex) {
            Logger.getLogger(NotificationServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
