package com.example.fire_brigade_system;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;

public class DispatcherIncidentListController {

    @FXML private ListView<String> listIncidents;

    @FXML private void handleViewReport() { System.out.println("Viewing incident report"); }
    @FXML private void handleBack() { Main.switchScene("dispatcher_dashboard.fxml"); }
}

