package com.example.fire_brigade_system.FireInspector;

import com.example.fire_brigade_system.Incident;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;


import java.util.Objects;

public class SubmitFinalInvestigationReportController
{
    @javafx.fxml.FXML
    private ComboBox<String> severtyLabelCB;
    @javafx.fxml.FXML
    private Label reportoutputLabel;
    @javafx.fxml.FXML
    private ComboBox<String> incidentICB;
    @javafx.fxml.FXML
    private ComboBox<String> improvementListCB;
    @javafx.fxml.FXML
    private Label locationlabel1;
    @javafx.fxml.FXML
    private Label typeLabel1;

    Report report;
    public void setter(Report report) {
        this.report = report;
    }
    Incident incident;
    public void setter(Incident incident){
        this.incident = incident;
    }
    ObservableList<Incident> incidentObservableList = FXCollections.observableArrayList();
    @javafx.fxml.FXML
    public void initialize() {
        Incident incident1= new Incident("1", "School", "Bashabo","","");
        Incident incident2= new Incident("2", "Mall", "Gulshan","","");
        Incident incident3 = new Incident("3", "College", "Dhaka","","");
        incidentObservableList.addAll(incident);
        //incidentObservableList.addAll(incident2);
        //incidentObservableList.addAll(incident3);

//        incidentICB.getItems().add(incident.getId());
//        locationlabel1.setText(incident.getLocation());
//        typeLabel1.setText(incident.getType());

        severtyLabelCB.getItems().addAll("Low","Medium","High","Critical");
        improvementListCB.getItems().addAll("Increase Fire exit","Buy safety equipments","Fix Fire Alarm","Change Date over Equipments");
        for (Incident incident: incidentObservableList){
            incidentICB.getItems().add(incident.getId());
        }
    }
    @javafx.fxml.FXML
    public void incidentIdOA(ActionEvent actionEvent) {
        String incidentid = incidentICB.getValue();
        for (Incident incident: incidentObservableList) {
            if (Objects.equals(incident.getId(), incidentid)) {
                typeLabel1.setText(incident.getType());
                locationlabel1.setText(incident.getLocation());
                reportoutputLabel.setText(incident.toString());
            }
        }
        String type = typeLabel1.getText();
        String location = locationlabel1.getText();
        String severtylabel = severtyLabelCB.getValue();
        String improvementList = improvementListCB.getValue();
    }
    @Deprecated
    public void submitFirechiefOnaction(ActionEvent actionEvent) {
    }
    private Report createReport(String incidentid, String type, String location, String severtyLabel, String improvementList) {
        Report report = new Report(incidentid,type,location,severtyLabel,improvementList);
        return report;
    }
    @javafx.fxml.FXML
    public void createReportOnaction(ActionEvent actionEvent) {
        String incidentid ,type,location,severtyLabel,improvementList;
        incidentid = this.incidentICB.getValue();
        type= typeLabel1.getText();
        location = locationlabel1.getText();
        severtyLabel = severtyLabelCB.getValue();
        improvementList= improvementListCB.getValue();
        Report report = this.createReport(incidentid,type,location,severtyLabel,improvementList);
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Investigation Report ");
        alert.setContentText(report.toString());
        alert.showAndWait();
        reportoutputLabel.setText(report.toString());
    }


}