package com.example.fire_brigade_system;


import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PSONewIncidentController {

    @FXML private TextField txtLocation;
    @FXML private TextArea txtDescription;

    @FXML private void handleSubmit() { System.out.println("Incident: " + txtLocation.getText()); }
    @FXML private void handleBack() { Main.switchScene("pso_dashboard.fxml"); }
}

