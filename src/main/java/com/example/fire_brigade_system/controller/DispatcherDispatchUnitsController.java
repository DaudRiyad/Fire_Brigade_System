package com.example.fire_brigade_system.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;

import java.io.IOException;

public class DispatcherDispatchUnitsController
{

    @javafx.fxml.FXML
    private ComboBox TrucksCB;
    @javafx.fxml.FXML
    private ComboBox TeamsCB;
    @javafx.fxml.FXML
    private ComboBox ToolsCB;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void handleDispatchOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backOA(ActionEvent actionEvent) throws IOException {
        Parent root = null ;
        FXMLLoader fxmlLoader = new FXMLLoader(com.example.demo.HelloApplication.class.getResource("dispatcher_Dashboardfxml"));
        root = fxmlLoader.load();

        Scene scene = new Scene(root) ;
        Stage stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Dashboard");
        stage.show();
    }
}
