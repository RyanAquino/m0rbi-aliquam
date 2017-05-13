package classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


public class Category {
	String category;
	String description;
	ArrayList<String> servList;
	int numService;	
	
	public Category(){
	}
	public Category(String category, String description){
		this.category = category;

	}
    public String getCategory(){
        return this.category;
    }
    public String getDescription(){
        return this.description;
    }
    public int getNumService(){
    	return this.numService;
    }
    public ArrayList<String> getServList(){
    	return this.servList;
    }
    public void setServList(){
    	ArrayList<String> serv = new ArrayList<String>();
    	String out = null;
		 try {
	            Class.forName("com.mysql.jdbc.Driver");

	            String connUrl = "jdbc:mysql://localhost/tutorial?user=root&password=12krishnan!";
	            Connection conn = DriverManager.getConnection(connUrl);

	            String sql = "SELECT description FROM service where category = '" + this.category + "'";
	            Statement st = conn.createStatement();
	            ResultSet rs = st.executeQuery(sql);

	            while(rs.next()){
	            	out = rs.getString(1);
	            	serv.add(out);
	            }
	            
	        } catch (Exception e){
	        	e.printStackTrace();
	        }
		 this.servList = serv;
		 
    }
    public void setNumService(){
    	int count = 0;
		 try {
	            Class.forName("com.mysql.jdbc.Driver");

	            String connUrl = "jdbc:mysql://localhost/tutorial?user=root&password=12krishnan!";
	            Connection conn = DriverManager.getConnection(connUrl);

	            String sql = "SELECT count(category) AS 'Number of Services Offered' from service where category = '" + this.category + "'";
	            Statement st = conn.createStatement();
	            ResultSet rs = st.executeQuery(sql);

	            if(rs.next()){
	            	count =  rs.getInt(1);
	            }
	            
	        } catch (Exception e){
	        	e.printStackTrace();
	        }
		 
		 this.numService =  count;
    }
    
    public void setCategory(String category){
    	this.category = category;
    }
    public void setDescription(String description){
    	this.description = description;
    }
}
