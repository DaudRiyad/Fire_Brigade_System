package com.example.fire_brigade_system.IncidentCommander;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;

public class UpdateIncidentDocumentationController
{
    @javafx.fxml.FXML
    private ComboBox<String> IncidentComboBox;
    @javafx.fxml.FXML
    private ComboBox<String> severtyLevelComboBox;
    @javafx.fxml.FXML
    private Button incidentReportTextArea;

    @javafx.fxml.FXML
    public void initialize() {

    }

    @javafx.fxml.FXML
    public void submitDocumantationOnAction(ActionEvent actionEvent) {
    }
}