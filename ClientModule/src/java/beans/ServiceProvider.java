package beans;

/**
 *
 * @author Mai Radie
 */
public class ServiceProvider {

    private String spId, reg_status, lastname, firstname, gender, username, password, email, address;

    public ServiceProvider(String spId, String reg_status, String lastname, String firstname, String gender, String username, String password, String email, String address) {
        this.spId = spId;
        this.reg_status = reg_status;
        this.lastname = lastname;
        this.firstname = firstname;
        this.gender = gender;
        this.username = username;
        this.password = password;
        this.email = email;
        this.address = address;
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

    public String getAddress() {
        return address;
    }           
}
