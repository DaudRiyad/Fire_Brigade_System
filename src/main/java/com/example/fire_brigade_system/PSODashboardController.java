package com.example.fire_brigade_system;

import javafx.fxml.FXML;

public class PSODashboardController {

    @FXML private void openNewIncident() { Main.switchScene("pso_new_incident.fxml"); }
    @FXML private void openValidateReports() { Main.switchScene("pso_validate_reports.fxml"); }
    @FXML private void openSafetyChecklist() { Main.switchScene("pso_safety_checklist.fxml"); }
    @FXML private void openCoordinateUnits() { Main.switchScene("pso_coordinate_units.fxml"); }
    @FXML private void openActivityLog() { Main.switchScene("pso_activity_log.fxml"); }
    @FXML private void openIncidentSummary() { Main.switchScene("pso_incident_summary.fxml"); }
    @FXML private void logout() { Main.switchScene("dispatcher_login.fxml"); }
}

