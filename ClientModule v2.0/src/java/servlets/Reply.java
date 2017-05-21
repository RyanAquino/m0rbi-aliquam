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
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
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
@WebServlet(urlPatterns = {"/Reply"})
public class Reply extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        HttpSession session = request.getSession(false);
        if (session != null && session.getAttribute("userName") != null) {

            String spid = request.getParameter("spid");

            String reply = request.getParameter("rep");

            String client_id = (String) session.getAttribute("userName");

            long time = System.currentTimeMillis();
            java.sql.Date date = new java.sql.Date(time);
            java.sql.Time timeIn = new java.sql.Time(new java.util.Date().getTime());
            System.out.println(timeIn);
            //(String) session.getAttribute("userName");
            Message m = null;
            ServiceProvider sp = null;

            response.setContentType("text/html");

//        if (session == null || session.getAttribute("user") == null) {
//            String url = response.encodeRedirectURL("NoSession.jsp");
//            response.sendRedirect(url);
//        }
            Calendar cal = Calendar.getInstance();
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");

            int year = cal.get(Calendar.YEAR);
            System.out.println(sdf.format(cal.getTime()));
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

                // change bruh
                String sql = "insert into message(sp_id, client_id, msg, time, date) values (" + spid + "," + client_id + ",\"" + reply + "\",\"" + sdf.format(cal.getTime()) + "\", DATE_FORMAT('" + cal.get(Calendar.YEAR) + "-" + cal.get(Calendar.MONTH) + "-" + cal.get(Calendar.DAY_OF_MONTH) + "', '%d,%m,%d'))";

                 st = conn.createStatement();

                st.executeUpdate(sql);

                String sql2 = "SELECT msg_id, m.sp_id, m.client_id,sender,msg,time,date,status, c.firstname as clientFN, c.lastname as clientLN, s.firstname as spFN, s.lastname as spLN from client c join MESSAGE m on c.client_id = m.client_id join sp s on s.sp_id = m.sp_id where c.client_id =" + client_id + " and m.sp_id=" + spid + " order by date asc";

                st = conn.createStatement();
                 rs = st.executeQuery(sql2);
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
                        if (rs.getString("sender").equals("client")) {

                            m.setFirstname(rs.getString("clientFN"));
                            m.setLastname(rs.getString("clientLN"));

                        } else if (rs.getString("sender").equals("sp")) {

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
//                    RequestDispatcher rd = request.getRequestDispatcher("ViewMessages.jsp");
//                    rd.forward(request, response);
                    response.sendRedirect("ViewMessages?id=" +spid);

                } catch (SQLException e) {
                    // TODO Auto-generated catch block

                }

            } catch (Exception e) {

                response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
            }
        } else {
            response.sendRedirect("NoSession.jsp");
        }

//        protected void doP(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
    }

}
