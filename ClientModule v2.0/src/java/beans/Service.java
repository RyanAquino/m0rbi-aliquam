package beans;

/**
 *
 * @author Mai Radie
 */
public class Service {
    
    private String service_id, description, category;

    public Service(String service_id, String description, String category) {
        this.service_id = service_id;
        this.description = description;
        this.category = category;
    }

    public String getService_id() {
        return service_id;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public void setService_id(String service_id) {
        this.service_id = service_id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    
    
    
}
