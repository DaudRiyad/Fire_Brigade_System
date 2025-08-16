package com.example.fire_brigade_system.Controllers.FireChief;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CommandCenterController {

    @FXML
    private ComboBox<String> priorityComboBox;

    @FXML
    private TextField instructionField;

    @FXML
    private Label messageLabel;

    @FXML
    public void initialize() {
        // Initialize priority options — example
        priorityComboBox.getItems().addAll("Low", "Medium", "High", "Critical");
    }

    @FXML
    public void handleSendOrder(ActionEvent actionEvent) {
        String selectedPriority = priorityComboBox.getValue();
        String instruction = instructionField.getText();

        if (selectedPriority == null || selectedPriority.isBlank()) {
            messageLabel.setText("Please select a priority level.");
            return;
        }
        if (instruction == null || instruction.isBlank()) {
            messageLabel.setText("Please enter an instruction.");
            return;
        }

        messageLabel.setText("Order sent with priority: " + selectedPriority);

    }
}
