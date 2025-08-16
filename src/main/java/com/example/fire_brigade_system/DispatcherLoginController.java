package com.example.fire_brigade_system;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class DispatcherLoginController {

    @FXML private TextField txtUserId;
    @FXML private PasswordField txtPassword;

    @FXML
    private void handleLogin() {
        System.out.println("Dispatcher login: " + txtUserId.getText());
        Main.switchScene("dispatcher_dashboard.fxml");
    }
}

