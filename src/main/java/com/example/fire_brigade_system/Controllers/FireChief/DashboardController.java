package com.example.fire_brigade_system.Controllers.FireChief;


import com.example.fire_brigade_system.utils.SceneUtil;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class DashboardController {

    @FXML
    public void initialize() {
        // Initialization code if needed
    }

    @FXML
    public void handleMutualAid(ActionEvent actionEvent) {
        loadScene(actionEvent, "/com/example/fire_brigade_system/fire_chief/mutual_aid.fxml");
    }

    @FXML
    public void handleParamedicApproval(ActionEvent actionEvent) {
        loadScene(actionEvent, "/com/example/fire_brigade_system/fire_chief/paramedic_approval.fxml");
    }

    @FXML
    public void handleActiveIncidents(ActionEvent actionEvent) {
        loadScene(actionEvent, "/com/example/fire_brigade_system/fire_chief/active_incidents.fxml");
    }

    @FXML
    public void handleIncidentLogs(ActionEvent actionEvent) {
        loadScene(actionEvent, "/com/example/fire_brigade_system/fire_chief/incident_logs.fxml");
    }

    @FXML
    public void handleCommandCenter(ActionEvent actionEvent) {
        loadScene(actionEvent, "/com/example/fire_brigade_system/fire_chief/command_center.fxml");
    }

    @FXML
    public void handleResponseStrategy(ActionEvent actionEvent) {
        loadScene(actionEvent, "/com/example/fire_brigade_system/fire_chief/response_strategy.fxml");
    }

    @FXML
    public void handleIncidentEvaluation(ActionEvent actionEvent) {
        loadScene(actionEvent, "/com/example/fire_brigade_system/fire_chief/incident_evaluation.fxml");
    }

    private void loadScene(ActionEvent event, String fxmlFilePath) {
        try {
            SceneUtil.switchScene(event, fxmlFilePath);
        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}
