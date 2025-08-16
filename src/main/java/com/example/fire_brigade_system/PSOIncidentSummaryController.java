package com.example.fire_brigade_system;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class PSOIncidentSummaryController {

    @FXML private TextArea txtSummary;

    @FXML private void handleSubmit() { System.out.println("Summary: " + txtSummary.getText()); }
    @FXML private void handleBack() { Main.switchScene("pso_dashboard.fxml"); }
}

