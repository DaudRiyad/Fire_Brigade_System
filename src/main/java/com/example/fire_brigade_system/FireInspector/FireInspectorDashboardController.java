package com.example.fire_brigade_system.FireInspector;

import com.example.fire_brigade_system.HelloApplication;

import com.example.fire_brigade_system.Incident;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class FireInspectorDashboardController
{
    @javafx.fxml.FXML
    private BorderPane fireInspectorDashboardBP;
    @javafx.fxml.FXML
    private TextArea fIInfoTextArea;


    FireInspector fireInspector;


    public void setter(FireInspector fireInspector) {
        this.fireInspector = fireInspector;
        fIInfoTextArea.setText(fireInspector.toString());
    }
    Incident Incident;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void logOutOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader= new FXMLLoader(HelloApplication.class.getResource("login.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow() ;
        stage.setScene(scene);
        stage.setTitle("Login Page");
        stage.show();
    }

    @javafx.fxml.FXML
    public void iFireCodeViolationOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader= new FXMLLoader(HelloApplication.class.getResource("FireInspector/Identify_Fire_Code_Violations.fxml"));
        fireInspectorDashboardBP.setCenter(fxmlLoader.load());
    }

    @javafx.fxml.FXML
    public void safetyImprovementsOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader= new FXMLLoader(HelloApplication.class.getResource("FireInspector/Recommend_Safety_Improvements.fxml"));
        fireInspectorDashboardBP.setCenter(fxmlLoader.load());
    }

    @javafx.fxml.FXML
    public void closedInvestigationOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader= new FXMLLoader(HelloApplication.class.getResource("FireInspector/Archive_Closed_Investigations.fxml"));
        fireInspectorDashboardBP.setCenter(fxmlLoader.load());
    }

    @javafx.fxml.FXML
    public void interviewWithnessOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader= new FXMLLoader(HelloApplication.class.getResource("FireInspector/Interview_Witnesses.fxml"));
        fireInspectorDashboardBP.setCenter(fxmlLoader.load());
    }

    @javafx.fxml.FXML
    public void inspectFireSceneOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader= new FXMLLoader(HelloApplication.class.getResource("FireInspector/Inspect_Fire_Scene_Post_Incident.fxml"));
        fireInspectorDashboardBP.setCenter(fxmlLoader.load());
    }

    @javafx.fxml.FXML
    public void trainSstaffOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader= new FXMLLoader(HelloApplication.class.getResource("FireInspector/Train_Staff on_Fire_Prevention.fxml"));
        fireInspectorDashboardBP.setCenter(fxmlLoader.load());
    }

    @javafx.fxml.FXML
    public void sFinalInvestigationReportOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader= new FXMLLoader(HelloApplication.class.getResource("FireInspector/Submit_Final_Investigation_Report.fxml"));
        fireInspectorDashboardBP.setCenter(fxmlLoader.load());
    }

    @javafx.fxml.FXML
    public void followUpIbspectionOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader= new FXMLLoader(HelloApplication.class.getResource("FireInspector/Conduct_Follow_Up_Inspections.fxml"));
        fireInspectorDashboardBP.setCenter(fxmlLoader.load());
    }
}