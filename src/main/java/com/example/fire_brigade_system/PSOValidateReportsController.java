package com.example.fire_brigade_system;


import javafx.fxml.FXML;
import javafx.scene.control.ListView;

public class PSOValidateReportsController {

    @FXML private ListView<String> listReports;

    @FXML private void handleValid() { System.out.println("Marked VALID"); }
    @FXML private void handleFalse() { System.out.println("Marked FALSE"); }
    @FXML private void handleBack() { Main.switchScene("pso_dashboard.fxml"); }
}

