package com.example.fire_brigade_system.Auth;

import com.example.fire_brigade_system.utils.SceneUtil;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {

    @FXML
    private TextField userIdField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Label messageLabel;

    @FXML
    private ComboBox<String> roleComboboxField;

    @FXML
    public void initialize() {
        roleComboboxField.getItems().addAll(
                "Firefighter",
                "Dispatcher",
                "Fire Chief",
                "Paramedic",
                "Inspector",
                "Public Safety Officer"
        );
    }

    @FXML
    public void handleLogin(ActionEvent actionEvent) {
        String userId = userIdField.getText();
        String password = passwordField.getText();
        String selectedRole = roleComboboxField.getValue();

        // Input validation
        if (userId == null || userId.isEmpty() ||
                password == null || password.isEmpty() ||
                selectedRole == null || selectedRole.isEmpty()) {
            messageLabel.setText("Fill all fields and select a role!");
            return;
        }

        if (!userId.matches("\\d{6}")) {
            messageLabel.setText("User ID must be 6 digits!");
            return;
        }

        if (password.length() < 6) {
            messageLabel.setText("Password must be at least 6 characters!");
            return;
        }


        String fxmlPath;
        switch (selectedRole) {
            case "Firefighter":
                fxmlPath = "/com/example/fire_brigade_system/fire_fighter/dashboard.fxml";
                break;
            case "Dispatcher":
                fxmlPath = "/com/example/fire_brigade_system/dispatcher/dashboard.fxml";
                break;
            case "Fire Chief":
                fxmlPath = "/com/example/fire_brigade_system/fire_chief/dashboard.fxml";
                break;
            case "Paramedic":
                fxmlPath = "/com/example/fire_brigade_system/paramedic/dashboard.fxml";
                break;
            case "Inspector":
                fxmlPath = "/com/example/fire_brigade_system/inspector/dashboard.fxml";
                break;
            case "Public Safety Officer":
                fxmlPath = "/com/example/fire_brigade_system/public_safety_officer/dashboard.fxml";
                break;
            default:
                messageLabel.setText("Unknown role!");
                return;
        }


        try {
            SceneUtil.switchScene(actionEvent, fxmlPath);
        } catch (Exception e) {
            messageLabel.setText("Can't load dashboard for " + selectedRole);
            e.printStackTrace();
        }
    }

    @FXML
    public void handleForgotPassword(ActionEvent actionEvent) {
        try {
            SceneUtil.switchScene(actionEvent, "/com/example/fire_brigade_system/Auth/forgot_password.fxml");
        } catch (Exception e) {
            e.printStackTrace();
            messageLabel.setText("Can't load forgot password page.");
        }
    }

    @FXML
    public void handleSignUp(ActionEvent actionEvent) {
        try {
            SceneUtil.switchScene(actionEvent, "/com/example/fire_brigade_system/Auth/signup.fxml");
        } catch (Exception e) {
            e.printStackTrace();
            messageLabel.setText("Can't load sign up page.");
        }
    }
}
