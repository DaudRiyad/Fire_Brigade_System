package com.example.fire_brigade_system;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class PSOActivityLogController {

    @FXML private TextArea txtActivity;

    @FXML private void handleSave() { System.out.println("Log: " + txtActivity.getText()); }
    @FXML private void handleBack() { Main.switchScene("pso_dashboard.fxml"); }
}
