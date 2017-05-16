package servlets;

import beans.Transactions;
import classes.ServiceProvider;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
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
import listeners.Database;

/**
 *
 * @author Mai Radie
 */
@WebServlet(name = "Transactions", urlPatterns = {"/Transactions"})
public class TransactionsServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            Transactions transactions = null;

            HttpSession session = request.getSession(false);

            // change this pag may cookies na
//        if (session == null || session.getAttribute("user") == null) {
//            String url = response.encodeRedirectURL("NoSession.jsp");
//            response.sendRedirect(url);
//        } else {\\\\\\]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]
            response.setContentType("text/html");

            Class.forName("com.mysql.jdbc.Driver");

            String connUrl = "jdbc:mysql://localhost/tutorial?user=root&password=";
            Connection conn = DriverManager.getConnection(connUrl);

            PrintWriter out = response.getWriter();

            
            String client_id = "1";
            
            String sql = "SELECT * FROM TRANSACTION t JOIN request r on t.request_id = r.request_id where client_id =" +client_id;
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            try {
                ArrayList<Transactions> transactionsList = new ArrayList<Transactions>();
                while (rs.next()) {
                    transactions = new Transactions();
                    transactions.setTransaction_id(rs.getString("transaction_id"));
                    transactions.setStatus(rs.getString("status"));
                    transactions.setPaid(rs.getString("paid"));
                    transactions.setDate(rs.getString("date"));
                    transactions.setAmount(rs.getInt("amount"));
                    transactions.setRequest_id(rs.getString("request_id"));
                    transactionsList.add(transactions);
                }


                rs.close();
                st.close();
                conn.close();

                request.setAttribute("transactions", transactionsList);

                RequestDispatcher rd = request.getRequestDispatcher("Transactions.jsp");
                rd.forward(request, response);

            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        } catch (SQLException ex) {
            Logger.getLogger(TransactionsServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TransactionsServlet.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
