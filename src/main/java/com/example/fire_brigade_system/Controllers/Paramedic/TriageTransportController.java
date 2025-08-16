package com.example.fire_brigade_system.Controllers.Paramedic;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class TriageTransportController {
    @FXML
    private ComboBox<String> triageLevelComboBox;
    @FXML
    private TextField etaField;
    @FXML
    private ComboBox<String> patientComboBox;
    @FXML
    private TextField hospitalField;
    @FXML
    private Label statusMessage;

    @FXML
    public void initialize() {
        triageLevelComboBox.getItems().addAll("Green", "Yellow", "Red");
        triageLevelComboBox.getSelectionModel().selectFirst();

        patientComboBox.getItems().addAll("Patient A", "Patient B", "Patient C");
        patientComboBox.getSelectionModel().selectFirst();

        statusMessage.setText("");
    }

    @FXML
    public void handleSaveTriage(ActionEvent actionEvent) {
        String selectedPatient = patientComboBox.getSelectionModel().getSelectedItem();
        String selectedTriage = triageLevelComboBox.getSelectionModel().getSelectedItem();

        if (selectedPatient == null) {
            statusMessage.setText("Please select a patient.");
            return;
        }
        if (selectedTriage == null) {
            statusMessage.setText("Please select a triage level.");
            return;
        }
        statusMessage.setText("");

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Triage Saved");
        alert.setHeaderText(null);
        alert.setContentText("Triage for " + selectedPatient + " saved as: " + selectedTriage);
        alert.showAndWait();
    }

    @FXML
    public void handleConfirmTransport(ActionEvent actionEvent) {
        String hospital = hospitalField.getText().trim();
        String eta = etaField.getText().trim();

        if (hospital.isEmpty()) {
            statusMessage.setText("Please enter the destination hospital.");
            return;
        }
        if (eta.isEmpty()) {
            statusMessage.setText("Please enter estimated time of arrival (ETA).");
            return;
        }
        statusMessage.setText("");

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Transport Confirmed");
        alert.setHeaderText(null);
        alert.setContentText("Transport to " + hospital + " confirmed with ETA: " + eta);
        alert.showAndWait();

        hospitalField.clear();
        etaField.clear();
    }
}
