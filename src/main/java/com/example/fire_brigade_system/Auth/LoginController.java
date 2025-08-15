package com.example.fire_brigade_system.Auth;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.Node;

public class LoginController
{
    @javafx.fxml.FXML
    private TextField userIdField;
    @javafx.fxml.FXML
    private PasswordField passwordField;
    @javafx.fxml.FXML
    private Label messageLabel;
    @FXML
    private ComboBox<String> roleComboboxField;

    public void initialize() {
        roleComboboxField.getItems().addAll(
                "Firefighter",
                "Dispatcher",
                "Fire Chief",
                "Paramedic",
                "Inspector",
                "Public Safety Officer");

    }
    @FXML
    public void handleLogin(ActionEvent actionEvent) {
        String userId = userIdField.getText();
        String password = passwordField.getText();
        String selectedRole = roleComboboxField.getValue();

        // Validation
        if (userId.isEmpty() || password.isEmpty() || selectedRole == null || selectedRole.isEmpty()) {
            messageLabel.setText("Fill all fields and select a role!");
            return;
        }

        // Simple user/pass check for the example, add your real logic here!
        if (!userId.matches("\\d{6}")) {
            messageLabel.setText("User ID must be 6 digits!");
            return;
        }
        if (password.length() < 6) {
            messageLabel.setText("Password must be at least 6 characters!");
            return;
        }

        // Now switch based on the role
        String fxmlPath = null;
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

        // Try to load the selected dashboard
        try {
            Parent root = javafx.fxml.FXMLLoader.load(getClass().getResource(fxmlPath));
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (Exception e) {
            messageLabel.setText("Can't load dashboard for " + selectedRole);
            e.printStackTrace();
        }
    }


    @javafx.fxml.FXML
    public void handleForgotPassword(ActionEvent actionEvent) {
        try {
            // CHANGE this path if your forgot password FXML is somewhere else!
            Parent root = FXMLLoader.load(getClass().getResource("/com/example/fire_brigade_system/auth/forgot_password.fxml"));
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
            messageLabel.setText("Can't load forgot password page.");
        }
    }


    @javafx.fxml.FXML
    public void handleSignUp(ActionEvent actionEvent) {
        try {
            // CHANGE this path if your sign up FXML is somewhere else!
            Parent root = FXMLLoader.load(getClass().getResource("/com/example/fire_brigade_system/auth/signup.fxml"));
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
            messageLabel.setText("Can't load sign up page.");
        }
    }
}