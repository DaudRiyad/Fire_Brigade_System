package com.example.fire_brigade_system;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Incident {
    private String incidentid, type, location, severtylevel, improvementList;

    public Incident(String incidentid, String type, String location, String severtylevel, String improvementList) {
        this.incidentid = incidentid;
        this.type = type;
        this.location = location;
        this.severtylevel = severtylevel;
        this.improvementList = improvementList;

    }

    public String getId() {
        return incidentid;
    }

    public void setId(String id) {
        this.incidentid = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getSevertylevel() {
        return severtylevel;
    }

    public void setSevertylevel(String severtylevel) {
        this.severtylevel = severtylevel;
    }

    public String getImprovementList() {
        return improvementList;
    }

    public void setImprovementList(String improvementList) {
        this.improvementList = improvementList;
    }

    @Override
    public String toString() {
        return "Incident" +
                "incidentid='" + incidentid + '\n' +
                "type='" + type + '\n' +
                "location='" + location + '\n' +
                "severtylevel='" + severtylevel + '\n' +
                "improvementList='" + improvementList + '\n'
                ;
    }

    ObservableList<Incident> incidentObservableList = FXCollections.observableArrayList();


    public void initialize() {
        Incident incident1 = new Incident("1", "School", "Bashabo","","");
        Incident incident2 = new Incident("2", "Mall", "Gulshan","","");
        Incident incident3 = new Incident("3", "College", "Dhaka","","");
        incidentObservableList.addAll(incident1,incident2,incident3);

    }
}