package com.example.fire_brigade_system;


import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;

public class PSOSafetyChecklistController {

    @FXML private CheckBox chkCrowdControl, chkGasLeak;

    @FXML private void handleSubmit() {
        System.out.println("Safety check: Crowd=" + chkCrowdControl.isSelected() + ", Gas=" + chkGasLeak.isSelected());
    }
    @FXML private void handleBack() { Main.switchScene("pso_dashboard.fxml"); }
}

