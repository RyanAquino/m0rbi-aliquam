package classes;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connect {
	public static void connectDbase(){
		try{
        Class.forName("com.mysql.jdbc.Driver");
        String connUrl = "jdbc:mysql://localhost/tutorial?user=root&password=";
        Connection conn = DriverManager.getConnection(connUrl);
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
}
