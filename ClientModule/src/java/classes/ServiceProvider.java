package classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class ServiceProvider {
	int clientId;
	String reqStatus;
	String firstName;
	String lastName;
	String address;
	String gender;
	String birthday;
	String username;
	String password;
	String email;
	String contact;
	ArrayList<String> subjList;
	
	//default constructor
	public ServiceProvider(){	
	}
	
	public void setId(int clientId){
		this.clientId = clientId;
	}
	public void setReauest(String reqStatus){
		this.reqStatus = reqStatus;
	}
	
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	
	public void setGender(String gender){
		this.gender = gender;
	}
	public void setAddress(String address){
		this.address = address;
	}
	
	public void setBirthDay(String birthday){
		this.birthday = birthday;
	}
	
	public void setUsername(String username){
		this.username = username;
	}
	
	public void setContact(String contact){
		this.contact = contact;
	}
	
	public void setEmail(String email){
		this.birthday = password;
	}
	
	public int getId(){
		return this.clientId; 
	}
	
	public String setReqStatus(String reqStatus){
		return this.reqStatus;
	}
	
	public String getFirstName(){
		return this.firstName;
	}

	public String getLastName(){
		return this.lastName;
	}	
	
	public String getAddress(){
		return this.address;
	}

	public String getGender(){
		return this.gender;
	}

	public String getBirthDay(){
		return this.birthday;
	}

	public String getUsername(){
		return this.username;
	}
	public String getBdirthDay(){
		return this.birthday;
	}

    public ArrayList<String> getSubjList(){
    	return this.subjList;
    }
    public void setServList(){
    	ArrayList<String> servOut = new ArrayList<String>();
    	String outServ = null;
		 try {
	            Class.forName("com.mysql.jdbc.Driver");

	            String connUrl = "jdbc:mysql://localhost/tutorial?user=root&password=";
	            Connection conn = DriverManager.getConnection(connUrl);

	            String sql = "SELECT description FROM service JOIN rate using(service_id) where sp_id = '" + this.clientId + "'";
	            Statement st = conn.createStatement();
	            ResultSet rs = st.executeQuery(sql);

	            while(rs.next()){
	            	outServ = rs.getString(1);
	            	servOut.add(outServ);
	            }
	            
	        } catch (Exception e){
	        	e.printStackTrace();
	        }
		 this.subjList = servOut;
		 
    }

//SELECT service_id FROM rate WHERE sp_id = this.id;
}
