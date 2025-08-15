package com.example.fire_brigade_system.Controllers.FireChief;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CommandCenterController
{
    @javafx.fxml.FXML
    private ComboBox priorityComboBox;
    @javafx.fxml.FXML
    private TextField instructionField;
    @javafx.fxml.FXML
    private Label messageLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void handleSendOrder(ActionEvent actionEvent) {
    }
}