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
import java.util.HashSet;
import java.util.List;
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
@WebServlet(urlPatterns = {"/Messages"})
public class MessageServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();

        HttpSession session = request.getSession(false);
        if (session != null && session.getAttribute("userName") != null) {
            
            response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1.
            response.setHeader("Pragma", "no-cache"); // HTTP 1.0.
            response.setDateHeader("Expires", 0);
       //     chain.doFilter(req, res);
            String client_id = (String) session.getAttribute("userName");

            Message m = null;
            ServiceProvider sp = null;

            response.setContentType("text/html");

//        if (session == null || session.getAttribute("userName") == null) {
//            String url = response.encodeRedirectURL("NoSession.jsp");
//            response.sendRedirect(url);
//        } else {
            try {
                Class.forName("com.mysql.jdbc.Driver");

                String connUrl = "jdbc:mysql://localhost:3306/tutorial?user=root&password=";
                Connection conn = DriverManager.getConnection(connUrl);

                // change bruh
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

                String sql = "SELECT * from MESSAGE where client_id =" + client_id + " order by \"sp_id\"";

                st = conn.createStatement();
                rs = st.executeQuery(sql);
                boolean empty = true;

                try {
                    ArrayList<Message> msgList = new ArrayList<Message>();

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

                        msgList.add(m);
                        empty = false;

                    }

                    if (empty) {

                        RequestDispatcher rd = request.getRequestDispatcher("NoMessages.jsp");
                        rd.forward(request, response);

                    } else {

//                SECOND QUERY
                        HashSet spList = new HashSet();

                        for (int x = 0; x < msgList.size(); x++) {
                            spList.add(msgList.get(x).getSp_id());
                        }

                        List<String> list = new ArrayList<String>(spList);

                        String sql2 = "";

                        ArrayList<ArrayList<Message>> outer = new ArrayList<ArrayList<Message>>();
                        ArrayList<Message> inner = null;
                        // get messages and put them in one list per sp
                        for (int x = 0; x < list.size(); x++) {
                            sql2 = "SELECT * FROM MESSAGE NATURAL JOIN SP WHERE (client_id =" + client_id + " AND sp_id =" + list.get(x) + ") ORDER BY date asc, time";
                            Statement st2 = conn.createStatement();
                            ResultSet rs2 = st2.executeQuery(sql2);
                            inner = new ArrayList<Message>();
                            while (rs2.next()) {

                                m = new Message();
                                m.setMsg_id(rs2.getString("msg_id"));
                                m.setSp_id(rs2.getString("sp_id"));
                                m.setClient_id(rs2.getString("client_id"));
                                m.setSender(rs2.getString("sender"));
                                m.setMsg(rs2.getString("msg"));
                                m.setTime(rs2.getString("time"));
                                m.setDate(rs2.getString("date"));
                                m.setStatus(rs2.getString("status"));

                                m.setFirstname(rs2.getString("firstname"));
                                m.setLastname(rs2.getString("lastname"));

                                inner.add(m);
//                   /     inner.add(sp);

                            }
                            outer.add(inner);
                        }

                        /**
                         * *************************
                         */
                        rs.close();
                        st.close();
                        conn.close();

                        /**
                         * *************************
                         */
                        // sort each list of outer by date :3
                        request.setAttribute("msgs", msgList);
                        request.setAttribute("outer", outer);
                        request.setAttribute("inner", inner);

                        RequestDispatcher rd = request.getRequestDispatcher("Messages.jsp");
                        rd.forward(request, response);

                    }
                } catch (SQLException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            } catch (Exception e) {
//            Logger.getLogger(ImageServlet.class.getName()).log(Level.SEVERE, null, e);
                response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
            }

        } else {

            response.sendRedirect("NoSession.jsp");

        }
    }

}
