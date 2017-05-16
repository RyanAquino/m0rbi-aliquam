package classes;

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
	
	//default constructor
	public ServiceProvider(){	
	}
	
	public void setId(int clientId){
		this.clientId = clientId;
	}
	public void setId(String reqStatus){
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

}
