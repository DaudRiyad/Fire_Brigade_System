package com.example.fire_brigade_system.Controllers.Paramedic;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class TreatmentController {
    @FXML
    private TextArea injuryDetailsField;
    @FXML
    private TextField numVictimsField;
    @FXML
    private Label statusMessage;

    @FXML
    public void initialize() {
        statusMessage.setText("");
    }

    @FXML
    public void handleSubmitReport(ActionEvent actionEvent) {
        String numVictimsText = numVictimsField.getText().trim();
        String injuryDetails = injuryDetailsField.getText().trim();

        if (numVictimsText.isEmpty()) {
            statusMessage.setText("Please enter the number of victims.");
            return;
        }

        int numVictims;
        try {
            numVictims = Integer.parseInt(numVictimsText);
            if (numVictims < 0) {
                statusMessage.setText("Number of victims cannot be negative.");
                return;
            }
        } catch (NumberFormatException e) {
            statusMessage.setText("Invalid number format for victims.");
            return;
        }

        if (injuryDetails.isEmpty()) {
            statusMessage.setText("Please enter injury details.");
            return;
        }

        statusMessage.setText("");
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Submit Report");
        alert.setHeaderText(null);
        alert.setContentText("Report submitted:\nNumber of victims: " + numVictims +
                "\nInjury details: " + injuryDetails);
        alert.showAndWait();
        numVictimsField.clear();
        injuryDetailsField.clear();
    }
}
