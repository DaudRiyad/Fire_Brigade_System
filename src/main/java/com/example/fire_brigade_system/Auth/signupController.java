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

public class signupController {
    @FXML
    private TextField userIdField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private PasswordField confirmPasswordField;
    @FXML
    private TextField phoneField;
    @FXML
    private Label messageLabel;
    @FXML
    private ComboBox<String> roleCombobox;
    @javafx.fxml.FXML
    public void initialize() {
        roleCombobox.getItems().addAll(
                "Firefighter",
                "Dispatcher",
                "Fire Chief",
                "Paramedic",
                "Inspector",
                "Public Safety Officer");

    }

    @FXML
    public void handleRegister(ActionEvent actionEvent) {
        String userId = userIdField.getText();
        String password = passwordField.getText();
        String confirmPassword = confirmPasswordField.getText();
        String phone = phoneField.getText();

        // BEGINNER-LEVEL: Step-by-step validation

        // Check all fields filled
        if (userId.isEmpty() || password.isEmpty() || confirmPassword.isEmpty() || phone.isEmpty()) {
            messageLabel.setText("Please fill all fields!");
            return;
        }

        // Check user ID is 6 digits
        if (!userId.matches("\\d{6}")) {
            messageLabel.setText("User ID must be 6 digits!");
            return;
        }

        // Check password at least 6 chars
        if (password.length() < 6) {
            messageLabel.setText("Password must be at least 6 characters!");
            return;
        }

        // Check passwords match
        if (!password.equals(confirmPassword)) {
            messageLabel.setText("Passwords do not match!");
            return;
        }

        // For phone number, you can check length or numeric if you want (optional)

        // Imagine we save the new user here... (not implemented)
        messageLabel.setText("Registration successful! Returning to login...");

        // Wait a second, then go to login screen
        new Thread(() -> {
            try {
                Thread.sleep(1000); // 1 second pause
                javafx.application.Platform.runLater(() -> goToLogin(actionEvent));
            } catch (InterruptedException e) {
                // ignore
            }
        }).start();
    }

    @FXML
    public void handleBackToLogin(ActionEvent actionEvent) {
        goToLogin(actionEvent);
    }

    // Helper method to load login.fxml
    private void goToLogin(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/com/example/fire_brigade_system/auth/login.fxml"));
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (Exception e) {
            messageLabel.setText("Can't load login page.");
            e.printStackTrace();
        }
    }
}
