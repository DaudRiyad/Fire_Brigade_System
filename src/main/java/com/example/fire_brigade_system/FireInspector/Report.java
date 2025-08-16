package com.example.fire_brigade_system.FireInspector;

public class Report {
    private String incidentid,location,type,severtylevel,improvementList;

    public Report(String incidentid, String location, String type, String severtylevel, String improvementList) {
        this.incidentid = incidentid;
        this.location = location;
        this.type = type;
        this.severtylevel = severtylevel;
        this.improvementList = improvementList;
    }

    public String getIncidentid() {
        return incidentid;
    }

    public void setIncidentid(String incidentid) {
        this.incidentid = incidentid;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
        return
                "Report" +

                        "'\n'Incidentid='" + incidentid + '\n' +
                        "'\n'Location='" + location + '\n' +
                        "'\n'Type='" + type + '\n' +
                        "'\n'Severtylevel='" + severtylevel + '\n' +
                        "'\n'ImprovementList='" + improvementList + '\n'
                ;
    }
    public Report createReport(String incidentid ,String type,String location,String severtyLabel,String improvementList){
        Report report = new Report(incidentid,type,location,severtyLabel,improvementList);
        return report;
    }
}