package com.example.fire_brigade_system;

import javafx.fxml.FXML;

public class DispatcherDashboardController {

    @FXML private void openIncidentList() { Main.switchScene("dispatcher_incident_list.fxml"); }
    @FXML private void openDispatchUnits() { Main.switchScene("dispatcher_dispatch_units.fxml"); }
    @FXML private void openMonitorMap() { Main.switchScene("dispatcher_monitor_map.fxml"); }
    @FXML private void openUpdateStatus() { Main.switchScene("dispatcher_update_status.fxml"); }
    @FXML private void openArchive() { Main.switchScene("dispatcher_archive.fxml"); }
    @FXML private void logout() { Main.switchScene("dispatcher_login.fxml"); }
}

