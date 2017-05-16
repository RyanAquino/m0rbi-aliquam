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
@WebServlet(urlPatterns = {"/ViewMessages"})
public class ViewMessageServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        HttpSession session = request.getSession(false);

        String spid = request.getParameter("id");

        String client_id = "2";
        Message m = null;
        ServiceProvider sp = null;

        response.setContentType("text/html");

//        if (session == null || session.getAttribute("user") == null) {
//            String url = response.encodeRedirectURL("NoSession.jsp");
//            response.sendRedirect(url);
//        }
        try {
            Class.forName("com.mysql.jdbc.Driver");

            String connUrl = "jdbc:mysql://localhost:3306/tutorial?user=root&password=";
            Connection conn = DriverManager.getConnection(connUrl);

            // change bruh
            String sql = "SELECT msg_id, m.sp_id, m.client_id,sender,msg,time,date,status, c.firstname as clientFN, c.lastname as clientLN, s.firstname as spFN, s.lastname as spLN from client c join MESSAGE m on c.client_id = m.client_id join sp s on s.sp_id = m.sp_id where c.client_id =" + client_id + " and m.sp_id=" + spid + " order by date desc";

            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            ArrayList<Message> msgList = new ArrayList<Message>();
            try {

                while (rs.next()) {
                    m = new Message();
                    m.setMsg_id(rs.getString("msg_id"));
                    m.setSp_id(rs.getString("sp_id"));
                    m.setClient_id(rs.getString("client_id"));
                    m.setSender(rs.getString("sender"));
                    m.setMsg(rs.getString("msg"));
                    m.setTime(rs.getString("time"));
                    m.setDate(rs.getString("date"));
                    m.setStatus(rs.getString("status"));

                    String x = rs.getString("sender");
                    String y = rs.getString("sp_id");
                    String z = rs.getString("client_id");

                    // client
                    if (rs.getString("sender").equals(rs.getString("client"))) {

                        m.setFirstname(rs.getString("clientFN"));
                        m.setLastname(rs.getString("clientLN"));

                    } else if (rs.getString("sender").equals(rs.getString("sp"))) {

                        m.setFirstname(rs.getString("spFN"));
                        m.setLastname(rs.getString("spLN"));

                    }

                    msgList.add(m);

                }

                rs.close();
                st.close();
                conn.close();

                request.setAttribute("msgs", msgList);

//                request.setAttribute("outer", outer);
//                request.setAttribute("inner", inner);
                RequestDispatcher rd = request.getRequestDispatcher("ViewMessages.jsp");
                rd.forward(request, response);

            } catch (SQLException e) {
                // TODO Auto-generated catch block

            }
        } catch (Exception e) {

            response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
        }

    }

}
