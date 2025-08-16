package com.example.fire_brigade_system.Controllers.Paramedic;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class TimeLogController {
    @FXML
    private TextField arrivalTimeField;
    @FXML
    private TextField departureTimeField;
    @FXML
    private Label statusMessage;

    @FXML
    public void initialize() {
        statusMessage.setText("");
    }

    @FXML
    public void handleSubmitTimeLog(ActionEvent actionEvent) {
        String arrivalTime = arrivalTimeField.getText().trim();
        String departureTime = departureTimeField.getText().trim();

        if (arrivalTime.isEmpty()) {
            statusMessage.setText("Please enter arrival time.");
            return;
        }
        if (departureTime.isEmpty()) {
            statusMessage.setText("Please enter departure time.");
            return;
        }

        statusMessage.setText("");

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Time Log Submitted");
        alert.setHeaderText(null);
        alert.setContentText("Arrival Time: " + arrivalTime + "\nDeparture Time: " + departureTime);
        alert.showAndWait();
        arrivalTimeField.clear();
        departureTimeField.clear();
    }

    @FXML
    public void handleCancel(ActionEvent actionEvent) {
        arrivalTimeField.clear();
        departureTimeField.clear();
        statusMessage.setText("");
    }
}
