package com.example.fire_brigade_system.Controllers.FireChief;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MutualAidController {

    @FXML
    private TextField noteField;

    @FXML
    private ComboBox<String> stationComboBox;

    @FXML
    private Label messageLabel;

    @FXML
    public void initialize() {
        ObservableList<String> stations = FXCollections.observableArrayList(
                "Station A",
                "Station B",
                "Station C",
                "Station D"
        );
        stationComboBox.setItems(stations);
        stationComboBox.setPromptText("Select a station");
    }

    @FXML
    public void handleSendRequest(ActionEvent actionEvent) {
        String selectedStation = stationComboBox.getSelectionModel().getSelectedItem();
        String note = noteField.getText();

        if (selectedStation == null || selectedStation.isEmpty()) {
            messageLabel.setText("Please select a station.");
            return;
        }
        if (note == null || note.isBlank()) {
            messageLabel.setText("Please enter a note explaining the situation.");
            return;
        }
        messageLabel.setText("Mutual aid request sent to " + selectedStation + ".");
        noteField.clear();
        stationComboBox.getSelectionModel().clearSelection();

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Request Sent");
        alert.setHeaderText(null);
        alert.setContentText("Mutual aid request successfully sent to " + selectedStation + ".");
        alert.showAndWait();
    }
}
