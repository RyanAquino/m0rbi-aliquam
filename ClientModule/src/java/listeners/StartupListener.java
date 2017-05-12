package listeners;

import beans.ServiceProvider;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import org.apache.tomcat.dbcp.dbcp2.BasicDataSource;

/**
 *
 * @author Mai Radie
 */
public class StartupListener {

    public void contextInitialized(ServletContextEvent sce) throws SQLException {
        try {
            ServletContext context = sce.getServletContext();

            String driver = context.getInitParameter("driver");
            String connstr = context.getInitParameter("connstr");
            String username = context.getInitParameter("username");
            String password = context.getInitParameter("password");

            BasicDataSource ds = new BasicDataSource();
            ds.setDriverClassName(driver);
            ds.setUrl(connstr);
            ds.setUsername(username);
            ds.setPassword(password);

            Connection conn = ds.getConnection();
            Statement st = conn.createStatement();
            String sql = "SELECT * from sp";
            ResultSet rs = st.executeQuery(sql);

            HashMap<String, ServiceProvider> spList = new HashMap<>();

            if (rs.first()) {
                do {
                    ServiceProvider sp = new ServiceProvider(
                            rs.getString("spId"),
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
                    spList.put(sp.getSpId(), sp);
                } while (rs.next());
            }

            rs.close();
            st.close();
            conn.close();

            context.setAttribute("spList", spList);

        } catch (Exception e) {
            throw new RuntimeException("Cannot start application. Database access error.");
        }
    }

    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("Application shutdown.");
    }

}
