package com.example.fire_brigade_system.Models;

import java.io.Serializable;

public class Incident implements Serializable {

    private String id;
    private String location;
    private String description;
    private String status;

    public Incident(String id, String location, String description, String status) {
        this.id = id;
        this.location = location;
        this.description = description;
        this.status = status;
    }

    public String getId() { return id; }
    public String getLocation() { return location; }
    public String getDescription() { return description; }
    public String getStatus() { return status; }

    public void setStatus(String status) { this.status = status; }

    @Override
    public String toString() {
        return id + " - " + location + " (" + status + ")";
    }
}
