package com.example.fire_brigade_system;


import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;

public class DispatcherDispatchUnitsController {

    @FXML private ComboBox<String> cmbTrucks, cmbTeams, cmbTools;

    @FXML private void handleDispatch() {
        System.out.println("Dispatching: " + cmbTrucks.getValue() + ", " + cmbTeams.getValue());
    }
    @FXML private void handleBack() { Main.switchScene("dispatcher_dashboard.fxml"); }
}

