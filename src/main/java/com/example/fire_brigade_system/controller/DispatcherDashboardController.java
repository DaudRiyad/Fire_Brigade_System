package com.example.fire_brigade_system.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class DispatcherDashboardController {
    @javafx.fxml.FXML
    public void dispatchUnitsOA(ActionEvent actionEvent) throws IOException {
        Parent root = null ;
        FXMLLoader fxmlLoader = new FXMLLoader(com.example.demo.HelloApplication.class.getResource("dispatcher_dispatch_units.fxml"));
        root = fxmlLoader.load();

        Scene scene = new Scene(root) ;
        Stage stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Distpatch");
        stage.show();
    }

    @javafx.fxml.FXML
    public void incidentListOA(ActionEvent actionEvent) throws IOException {Parent root = null ;
        FXMLLoader fxmlLoader = new FXMLLoader(com.example.demo.HelloApplication.class.getResource("dispatcher_incident_list.fxml"));
        root = fxmlLoader.load();

        Scene scene = new Scene(root) ;
        Stage stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle(" incident list");
        stage.show();
    }

    @javafx.fxml.FXML
    public void logReportsOA(ActionEvent actionEvent) throws IOException {
        Parent root = null ;
        FXMLLoader fxmlLoader = new FXMLLoader(com.example.demo.HelloApplication.class.getResource("dispatcher_log_report.fxml"));
        root = fxmlLoader.load();

        Scene scene = new Scene(root) ;
        Stage stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("log report");
        stage.show();
    }

    @javafx.fxml.FXML
    public void archiveOA(ActionEvent actionEvent) throws IOException {
        Parent root = null ;
        FXMLLoader fxmlLoader = new FXMLLoader(com.example.demo.HelloApplication.class.getResource("dispatcher_archive.fxml"));
        root = fxmlLoader.load();

        Scene scene = new Scene(root) ;
        Stage stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("archive");
        stage.show();
    }

    @javafx.fxml.FXML
    public void updateStatusOA(ActionEvent actionEvent) throws IOException {
        Parent root = null ;
        FXMLLoader fxmlLoader = new FXMLLoader(com.example.demo.HelloApplication.class.getResource("dispatcher_update_status.fxml"));
        root = fxmlLoader.load();

        Scene scene = new Scene(root) ;
        Stage stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Update Status");
        stage.show();
    }
}
