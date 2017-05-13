package beans;

/**
 *
 * @author Mai Radie
 */
public class Rate {

    private String sp_id, service_id, rate;

    public Rate(String sp_id, String service_id, String rate) {
        this.sp_id = sp_id;
        this.service_id = service_id;
        this.rate = rate;
    }

    public void setSp_id(String sp_id) {
        this.sp_id = sp_id;
    }

    public void setService_id(String service_id) {
        this.service_id = service_id;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getSp_id() {
        return sp_id;
    }

    public String getService_id() {
        return service_id;
    }

    public String getRate() {
        return rate;
    }

}
