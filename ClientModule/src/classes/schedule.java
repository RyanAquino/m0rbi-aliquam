package classes;


public class schedule {
	int schedId;
	int spId;
	String time;
	String day;
	String status;

	public schedule(){	
	}

	public void setTime(String time) {
		this.time = time;
	}
	public void setSchedId(int schedId) {
		this.schedId = schedId;
	}
	public void spId(int spId) {
		this.spId = spId;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getTime(){
		return this.time;
	}
	
	public String getDay(){
		return this.day;
	}
	
	public String getStatus(){
		return this.status;
	}
	
	public int getSpId(){
		return this.spId;
	}
	
	public int getSchedId(){
		return this.schedId;
	}
	

}
