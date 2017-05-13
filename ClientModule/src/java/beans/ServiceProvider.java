package beans;

/**
 *
 * @author Mai Radie
 */
public class ServiceProvider {

    private String spId, reg_status, lastname, firstname, gender, username, password, email, contact, address, log_status;

    public ServiceProvider(String spId, String reg_status, String lastname, String firstname, String gender, String username, String password, String email, String contact, String address, String log_status) {
        this.spId = spId;
        this.reg_status = reg_status;
        this.lastname = lastname;
        this.firstname = firstname;
        this.gender = gender;
        this.username = username;
        this.password = password;
        this.email = email;
        this.contact = contact;
        this.address = address;
        this.log_status = log_status;
    }

    public ServiceProvider() {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getSpId() {
        return spId;
    }

    public String getReg_status() {
        return reg_status;
    }

    public String getLastname() {
        return lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getGender() {
        return gender;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getContact() {
        return contact;
    }

    public String getAddress() {
        return address;
    }

    public String getLog_status() {
        return log_status;
    }

    public void setSpId(String spId) {
        this.spId = spId;
    }

    public void setReg_status(String reg_status) {
        this.reg_status = reg_status;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setLog_status(String log_status) {
        this.log_status = log_status;
    }

   
}
