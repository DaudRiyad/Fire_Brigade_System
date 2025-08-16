package com.example.fire_brigade_system.IncidentCommander;

import com.example.fire_brigade_system.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class IncidentCommanderDashboardController
{
    @javafx.fxml.FXML
    private BorderPane incidentCommanderDashboardBP;
    @javafx.fxml.FXML
    private TextArea icInfoTextArea;

    IncidentCommander incidentCommander;

    public void setter(IncidentCommander incidentCommander) {
        this.incidentCommander = incidentCommander;
        icInfoTextArea.setText(incidentCommander.toString());
    }
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void updateIncidentDocumentationOA(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader= new FXMLLoader(HelloApplication.class.getResource("IncidentCommander/Update_Incident_Documentation.fxml"));
        incidentCommanderDashboardBP.setCenter(fxmlLoader.load());
    }

    @javafx.fxml.FXML
    public void coordinateOnSceneOperationOA(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader= new FXMLLoader(HelloApplication.class.getResource("IncidentCommander/CoordinateOnSceneOperations.fxml"));
        incidentCommanderDashboardBP.setCenter(fxmlLoader.load());
    }

    @javafx.fxml.FXML
    public void allocateResourcesOA(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader= new FXMLLoader(HelloApplication.class.getResource("IncidentCommander/Allocate_Resources .fxml"));
        incidentCommanderDashboardBP.setCenter(fxmlLoader.load());
    }

    @javafx.fxml.FXML
    public void signOutOA(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader= new FXMLLoader(HelloApplication.class.getResource("login.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow() ;
        stage.setScene(scene);
        stage.setTitle("Login Page");
        stage.show();
    }

    @javafx.fxml.FXML
    public void escalateCriticalSituationsOA(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader= new FXMLLoader(HelloApplication.class.getResource("IncidentCommander/EscalateCriticalSituations.fxml"));
        incidentCommanderDashboardBP.setCenter(fxmlLoader.load());
    }

    @javafx.fxml.FXML
    public void approveIncidentClosureOA(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader= new FXMLLoader(HelloApplication.class.getResource("IncidentCommander/ApproveIncidentClosure.fxml"));
        incidentCommanderDashboardBP.setCenter(fxmlLoader.load());
    }

    @javafx.fxml.FXML
    public void debriefTeamPostIncidentOA(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader= new FXMLLoader(HelloApplication.class.getResource("IncidentCommander/Debrief_Team_Post_Incident.fxml"));
        incidentCommanderDashboardBP.setCenter(fxmlLoader.load());
    }

    @javafx.fxml.FXML
    public void monitorWeatherHazardsAlertsOA(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader= new FXMLLoader(HelloApplication.class.getResource("IncidentCommander/Monitor_Weather_Hazard_Alerts.fxml"));
        incidentCommanderDashboardBP.setCenter(fxmlLoader.load());
    }

    @javafx.fxml.FXML
    public void assessIncidentSevertyOA(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader= new FXMLLoader(HelloApplication.class.getResource("IncidentCommander/Assess_Incident_Severity.fxml"));
        incidentCommanderDashboardBP.setCenter(fxmlLoader.load());
    }
}