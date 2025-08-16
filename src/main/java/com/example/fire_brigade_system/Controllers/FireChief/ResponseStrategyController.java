package com.example.fire_brigade_system.Controllers.FireChief;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ResponseStrategyController {

    @FXML
    private ComboBox<String> equipComboBox;

    @FXML
    private TextField numTeamsField;

    @FXML
    private Label messageLabel;

    @FXML
    private TextField numTrucksField;

    @FXML
    public void initialize() {
        ObservableList<String> equipmentList = FXCollections.observableArrayList(
                "Ladder Truck", "Rescue Tools", "HazMat Unit", "Water Tanker"
        );
        equipComboBox.setItems(equipmentList);
        equipComboBox.setPromptText("Select Special Equipment");
        messageLabel.setText("");
    }

    @FXML
    public void handleConfirmPlan(ActionEvent actionEvent) {
        String selectedEquip = equipComboBox.getSelectionModel().getSelectedItem();
        String numTeamsText = numTeamsField.getText();
        String numTrucksText = numTrucksField.getText();

        if (selectedEquip == null || selectedEquip.isEmpty()) {
            messageLabel.setText("Please select special equipment.");
            return;
        }

        int numTeams;
        int numTrucks;
        try {
            numTeams = Integer.parseInt(numTeamsText);
            if (numTeams < 0) throw new NumberFormatException();
        } catch (NumberFormatException e) {
            messageLabel.setText("Please enter a valid non-negative number of teams.");
            return;
        }

        try {
            numTrucks = Integer.parseInt(numTrucksText);
            if (numTrucks < 0) throw new NumberFormatException();
        } catch (NumberFormatException e) {
            messageLabel.setText("Please enter a valid non-negative number of trucks.");
            return;
        }
        messageLabel.setText("Response plan confirmed:\n" +
                numTeams + " teams, " +
                numTrucks + " trucks, Equipment: " + selectedEquip + ".");
    }
}
