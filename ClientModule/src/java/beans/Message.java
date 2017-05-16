package beans;

/**
 *
 * @author Mai Radie
 */
public class Message {

    private String msg_id, sp_id, client_id, sender, msg, time, date, status;

    public Message(String msg_id, String sp_id, String client_id, String sender, String msg, String time, String date, String status) {
        this.msg_id = msg_id;
        this.sp_id = sp_id;
        this.client_id = client_id;
        this.sender = sender;
        this.msg = msg;
        this.time = time;
        this.date = date;
        this.status = status;
    }

    public Message() {
       
    }

    public String getMsg_id() {
        return msg_id;
    }

    public String getSp_id() {
        return sp_id;
    }

    public String getClient_id() {
        return client_id;
    }

    public String getSender() {
        return sender;
    }

    public String getMsg() {
        return msg;
    }

    public String getTime() {
        return time;
    }

    public String getDate() {
        return date;
    }

    public String getStatus() {
        return status;
    }

    public void setMsg_id(String msg_id) {
        this.msg_id = msg_id;
    }

    public void setSp_id(String sp_id) {
        this.sp_id = sp_id;
    }

    public void setClient_id(String client_id) {
        this.client_id = client_id;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
