package servlets;

import beans.ServiceProvider;
import java.io.IOException;
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
@WebServlet(name = "SearchCategoryServlet", urlPatterns = {"/SearchCategoryServlet"})
public class SearchCategoryServlet extends HttpServlet {

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

        String catName = request.getParameter("name");

        Database db = (Database) getServletContext().getAttribute("db");
        System.out.println(db);

        if (catName == "music") {

            String sql = "SELECT distinct * FROM rate NATURAL JOIN service NATURAL JOIN sp WHERE category = \"music\"";
            ResultSet rs;
            try {
                rs = db.runSql(sql);

                ServiceProvider sp = new ServiceProvider(
                        rs.getString("sp_id"), 
                        rs.getString("reg_status"), 
                        rs.getString("lastname"), 
                        rs.getString("firstname"), 
                        rs.getString("gender"), 
                        rs.getString("username"), 
                        rs.getString("password"), 
                        rs.getString("email"), 
                        rs.getString("contact"), 
                        rs.getString("address"), 
                        rs.getString("log_status"));

                while (rs.next()) {
                    out.println(rs.getString("user_name"));
                }
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

    }

}
