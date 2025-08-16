package com.example.fire_brigade_system.Controllers.Paramedic;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;

public class AmbulanceRequestController {
    @FXML
    private Label statusMessage;

    @FXML
    public void initialize() {
        statusMessage.setText("");
    }

    @FXML
    public void handleSubmitRequest(ActionEvent actionEvent) {


        statusMessage.setText("");
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Ambulance Request");
        alert.setHeaderText(null);
        alert.setContentText("Ambulance request submitted successfully.");
        alert.showAndWait();

        statusMessage.setText("Request submitted.");
    }

    @FXML
    public void handleCancel(ActionEvent actionEvent) {
        statusMessage.setText("");
    }
}
