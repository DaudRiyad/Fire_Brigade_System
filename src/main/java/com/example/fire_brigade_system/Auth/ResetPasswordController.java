package com.example.fire_brigade_system.Auth;

import com.example.fire_brigade_system.utils.SceneUtil;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;


public class ResetPasswordController {
    @FXML
    private PasswordField newPasswordField;
    @FXML
    private PasswordField confirmPasswordField;
    @FXML
    private Label messageLabel;

    @FXML
    public void handleConfirm(ActionEvent actionEvent) {
        String newPassword = newPasswordField.getText();
        String confirmPassword = confirmPasswordField.getText();

        // Check both fields are filled
        if (newPassword.isEmpty() || confirmPassword.isEmpty()) {
            messageLabel.setText("Please fill both fields!");
            return;
        }

        // Check password length
        if (newPassword.length() < 6) {
            messageLabel.setText("Password must be at least 6 characters!");
            return;
        }

        // Check passwords match
        if (!newPassword.equals(confirmPassword)) {
            messageLabel.setText("Passwords do not match!");
            return;
        }

        // Imagine we save the new password here (not implemented)

        messageLabel.setText("Password changed! Returning to login...");

        // Wait 1 second, then load login screen
        new Thread(() -> {
            try {
                Thread.sleep(1000);
                javafx.application.Platform.runLater(() -> goToLogin(actionEvent));
            } catch (InterruptedException e) {
                // Ignore
            }
        }).start();
    }

    // Helper to load login.fxml and return to the login screen
    private void goToLogin(ActionEvent actionEvent) {
        try {
            SceneUtil.switchScene(actionEvent, "/com/example/fire_brigade_system/Auth/login.fxml");
        } catch (Exception e) {
            e.printStackTrace();
            messageLabel.setText("Can't load forgot password page.");
        }
    }
}
