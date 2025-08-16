package com.example.fire_brigade_system.Controllers.FireChief;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;

public class ParamedicApprovalController {

    @FXML
    private CheckBox approveBox;

    @FXML
    private Label messageLabel;

    @FXML
    public void initialize() {
        // Initialization logic if needed
        messageLabel.setText("");
    }

    @FXML
    public void handleApprove(ActionEvent actionEvent) {
        if (approveBox.isSelected()) {
            messageLabel.setText("Paramedic deployment approved.");
        } else {
            messageLabel.setText("Please check the box to approve paramedic deployment.");
        }
    }
}
