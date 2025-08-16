package com.example.fire_brigade_system;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;

public class DispatcherStatusController {

    @FXML private ComboBox<String> cmbIncident, cmbStatus;

    @FXML private void handleSave() {
        System.out.println("Status updated: " + cmbStatus.getValue());
    }
    @FXML private void handleBack() { Main.switchScene("dispatcher_dashboard.fxml"); }
}

