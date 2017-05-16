package beans;

/**
 *
 * @author Mai Radie
 */
public class Client {

    private String client_id, lastname, firstname, address, gender, birthday, username, password, email, logstat;
    
    public Client(String client_id, String lastname, String firstname, String address, String gender, String birthday, String username, String password, String email, String logstat) {
        this.client_id = client_id;
        this.lastname = lastname;
        this.firstname = firstname;
        this.address = address;
        this.gender = gender;
        this.birthday = birthday;
        this.username = username;
        this.password = password;
        this.email = email;
        this.logstat = logstat;
    }

    public void setClient_id(String client_id) {
        this.client_id = client_id;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
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

    public void setLogstat(String logstat) {
        this.logstat = logstat;
    }

    public String getClient_id() {
        return client_id;
    }

    public String getLastname() {
        return lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getAddress() {
        return address;
    }

    public String getGender() {
        return gender;
    }

    public String getBirthday() {
        return birthday;
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

    public String getLogstat() {
        return logstat;
    }

    
    
}