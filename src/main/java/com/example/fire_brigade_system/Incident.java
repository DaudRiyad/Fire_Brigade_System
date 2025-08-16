public class Incident {
    private int id;
    private String location;
    private String description;
    private String status;

    public Incident(int id, String location, String description, String status) {
        this.id = id;
        this.location = location;
        this.description = description;
        this.status = status;
    }

    public int getId() { return id; }
    public String getLocation() { return location; }
    public String getDescription() { return description; }
    public String getStatus() { return status; }

    public void setStatus(String status) { this.status = status; }

    @Override
    public String toString() {
        return "Incident #" + id + " (" + status + ") - " + location;
    }
}
