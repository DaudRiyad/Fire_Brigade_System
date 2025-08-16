package com.example.fire_brigade_system;


import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class PSOCoordinateUnitsController {

    @FXML private ComboBox<String> cmbUnit;
    @FXML private TextField txtMessage;

    @FXML private void handleSend() {
        System.out.println("Message to " + cmbUnit.getValue() + ": " + txtMessage.getText());
    }
    @FXML private void handleBack() { Main.switchScene("pso_dashboard.fxml"); }
}
