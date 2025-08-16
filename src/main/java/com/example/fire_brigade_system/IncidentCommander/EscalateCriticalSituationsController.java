package com.example.fire_brigade_system.IncidentCommander;

import com.example.fire_brigade_system.Incident;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;

public class EscalateCriticalSituationsController
{
    @javafx.fxml.FXML
    private ComboBox<String> backupTypeCB;
    @javafx.fxml.FXML
    private ComboBox<String> incidentID;
    @javafx.fxml.FXML
    private TextArea justificationTA;
    Incident incident;
    public void setter(Incident incident){
        this.incident = incident;
    }

    @javafx.fxml.FXML
    public void initialize() {
        incidentID.getItems().add(incident.getId());
        backupTypeCB.getItems().addAll("FireFighter","Trucks","Equipments");

    }

    @javafx.fxml.FXML
    public void submitEscalationOA(ActionEvent actionEvent) {
        String iD = incidentID.getValue();
        String backuptype = backupTypeCB.getValue();
        String justifiction = justificationTA.getText();

        String escalationRqst = "Incident ID: "+ iD + "\nBackupType :"+ backuptype +"\nJustification : "+justifiction;
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Findings ");
        alert.setContentText(escalationRqst);
        alert.showAndWait();


    }
}