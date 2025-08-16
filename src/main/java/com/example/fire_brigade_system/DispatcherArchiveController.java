package com.example.fire_brigade_system;


import javafx.fxml.FXML;
import javafx.scene.control.ListView;

public class DispatcherArchiveController {

    @FXML private ListView<String> listResolved;

    @FXML private void handleArchive() { System.out.println("Incident archived"); }
    @FXML private void handleBack() { Main.switchScene("dispatcher_dashboard.fxml"); }
}

