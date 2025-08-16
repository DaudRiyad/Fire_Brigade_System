package com.example.fire_brigade_system.IncidentCommander;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.io.IOException;


public class MonitorWeatherHazardAlertsController
{
    @javafx.fxml.FXML
    private TextArea strategyTextArea;
    @javafx.fxml.FXML
    private ComboBox<String> alertComboBox;
    @javafx.fxml.FXML
    private Label hazartOutputLabel;
    IncidentCommander incidentCommander;
    public void setter(IncidentCommander incidentCommander){
        this.incidentCommander = incidentCommander;
    }

    @javafx.fxml.FXML
    public void initialize() {
        alertComboBox.getItems().addAll("Storms", "Gas leaks");

    }

    @javafx.fxml.FXML
    public void notifyTemsOnAction(ActionEvent actionEvent) throws IOException {
        String halert = alertComboBox.getValue();
        String strtagy = strategyTextArea.getText();
        String hazardalert = "alert : "+ halert +"\nStratagy :"+ strtagy;
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Findings ");
        alert.setContentText(hazardalert);
        alert.showAndWait();

    }
}