package servlets;

import beans.Message;
import classes.ServiceProvider;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
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
@WebServlet(urlPatterns = {"/WriteMessage"})
public class WriteMessageServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        HttpSession session = request.getSession(false);

        if (session != null && session.getAttribute("userName") != null) {

            // code to handle session / checks whether the user is logged in
            response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1.
            response.setHeader("Pragma", "no-cache"); // HTTP 1.0.
            response.setDateHeader("Expires", 0);
            response.setContentType("text/html");

            String spid = request.getParameter("id");
            String client_id = (String) session.getAttribute("userName");
            Message m = null;
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

                
                // ******************************************* //
                
                // OPTIONS OF THE CLIENT //
                
                // queries all service providers that appoved the client's request
                String sql = "select * from sp natural join request where client_id = "+client_id +" and reg_status LIKE 'approve'";

                st = conn.createStatement();
                rs = st.executeQuery(sql);
                
                request.setAttribute("rs",rs);
                ArrayList<Message> msgList = new ArrayList<Message>();
                try {

                    rs.close();
                    st.close();
                    conn.close();
                    
                    request.setAttribute("spid", spid);

                    RequestDispatcher rd = request.getRequestDispatcher("WriteMessage.jsp");

                    rd.forward(request, response);

                } catch (SQLException e) {
                    // TODO Auto-generated catch block

                }
            } catch (Exception e) {

                response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
            }
        } else {
            response.sendRedirect("NoSession.jsp");
        }

    }

}
