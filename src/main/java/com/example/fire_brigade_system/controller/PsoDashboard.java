package com.example.fire_brigade_system.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class PsoDashboard
{
    @javafx.fxml.FXML
    public void initialize() {

    }

    @javafx.fxml.FXML
    public void unitCoordinationOA(ActionEvent actionEvent) throws IOException {
        Parent root = null ;
        FXMLLoader fxmlLoader = new FXMLLoader(com.example.demo.HelloApplication.class.getResource("pso_coordinate_units.fxml"));
        root = fxmlLoader.load();

        Scene scene = new Scene(root) ;
        Stage stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Coordinate units");
        stage.show();
    }

    @javafx.fxml.FXML
    public void newIncidentOA(ActionEvent actionEvent) throws IOException {
        Parent root = null ;
        FXMLLoader fxmlLoader = new FXMLLoader(com.example.demo.HelloApplication.class.getResource("pso_new_incident.fxml"));
        root = fxmlLoader.load();

        Scene scene = new Scene(root) ;
        Stage stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("new incident");
        stage.show();
    }

    @javafx.fxml.FXML
    public void reportValidationOA(ActionEvent actionEvent) throws IOException {
        Parent root = null ;
        FXMLLoader fxmlLoader = new FXMLLoader(com.example.demo.HelloApplication.class.getResource("pso_validate_reports.fxml"));
        root = fxmlLoader.load();

        Scene scene = new Scene(root) ;
        Stage stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Report Validation");
        stage.show();
    }

    @javafx.fxml.FXML
    public void incidentSummeryOA(ActionEvent actionEvent) throws IOException {
        Parent root = null ;
        FXMLLoader fxmlLoader = new FXMLLoader(com.example.demo.HelloApplication.class.getResource("pso_incident_summery.fxml"));
        root = fxmlLoader.load();

        Scene scene = new Scene(root) ;
        Stage stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("incident summery");
        stage.show();
    }
}