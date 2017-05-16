package listeners;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author Mai Radie
 */
public class Database {

    private Connection conn = null;

    public Database(String url, String user_name, String password) {
        try {
            Class.forName("com.mysql.jdbc.Driver");

            this.conn = DriverManager.getConnection(url, user_name, password);

        } catch (ClassNotFoundException | SQLException e) {
            // TODO Auto-generated catch block

            showMessageDialog(null, "Could not connect to database");

        }

    }

    public Connection getConnection() {
        return this.conn;
    }

    public ResultSet runSql(String sql) throws SQLException {
        Statement sta = conn.createStatement();
        return sta.executeQuery(sql);
    }
}
