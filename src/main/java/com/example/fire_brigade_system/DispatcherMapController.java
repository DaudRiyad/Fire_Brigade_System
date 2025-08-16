package com.example.fire_brigade_system;


import javafx.fxml.FXML;

public class DispatcherMapController {

    @FXML private void handleRefresh() { System.out.println("Map refreshed"); }
    @FXML private void handleBack() { Main.switchScene("dispatcher_dashboard.fxml"); }
}

