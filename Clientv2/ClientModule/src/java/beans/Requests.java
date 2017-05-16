package beans;

/**
 *
 * @author Mai Radie
 */
public class Requests {

    private String request_id, sp_id, client_id, status, date, time, sched_id;

    public Requests(String request_id, String sp_id, String client_id, String status, String date, String time, String sched_id) {
        this.request_id = request_id;
        this.sp_id = sp_id;
        this.client_id = client_id;
        this.status = status;
        this.date = date;
        this.time = time;
        this.sched_id = sched_id;
    }

    public Requests() {
        
    }

    public String getRequest_id() {
        return request_id;
    }

    public String getSp_id() {
        return sp_id;
    }

    public String getClient_id() {
        return client_id;
    }

    public String getStatus() {
        return status;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public String getSched_id() {
        return sched_id;
    }

    public void setRequest_id(String request_id) {
        this.request_id = request_id;
    }

    public void setSp_id(String sp_id) {
        this.sp_id = sp_id;
    }

    public void setClient_id(String client_id) {
        this.client_id = client_id;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setSched_id(String sched_id) {
        this.sched_id = sched_id;
    }

}
