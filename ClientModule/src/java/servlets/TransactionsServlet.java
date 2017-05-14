/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import beans.Transactions;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.sql.ResultSet;
import java.sql.SQLException;
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

        HttpSession session = request.getSession(false);

        // change this pag may cookies na
//        if (session == null || session.getAttribute("user") == null) {
//            String url = response.encodeRedirectURL("NoSession.jsp");
//            response.sendRedirect(url);
//        } 
        response.setContentType("text/html");

      

        Database db = (Database) getServletContext().getAttribute("db");
        System.out.println(db);

        String sql = "SELECT distinct * FROM rate NATURAL JOIN service NATURAL JOIN sp WHERE category = \"music\"";
        ResultSet rs;
        try {
            rs = db.runSql(sql);

            Transactions transactions = new Transactions(
                    rs.getString("transaction_id"),
                    rs.getString("status"),
                    rs.getString("paid"),
                    rs.getInt("amount"),
                    rs.getString("request_id"));

            while (rs.next()) {
                out.println(rs.getString("user_name"));
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}
