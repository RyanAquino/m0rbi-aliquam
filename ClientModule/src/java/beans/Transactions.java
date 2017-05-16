package beans;

/**
 *
 * @author Mai Radie
 */
public class Transactions {

    private String transaction_id, status, paid, request_id, date;
    private int amount;

    public Transactions(String transaction_id, String status, String paid, int amount, String request_id) {
        this.transaction_id = transaction_id;
        this.status = status;
        this.paid = paid;
        this.amount = amount;
        this.request_id = request_id;
    }

    public Transactions() {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getTransaction_id() {
        return transaction_id;
    }

    public String getStatus() {
        return status;
    }

    public String getPaid() {
        return paid;
    }

    public int getAmount() {
        return amount;
    }

    public String getRequest_id() {
        return request_id;
    }

    public void setTransaction_id(String transaction_id) {
        this.transaction_id = transaction_id;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setPaid(String paid) {
        this.paid = paid;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setRequest_id(String request_id) {
        this.request_id = request_id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
}
