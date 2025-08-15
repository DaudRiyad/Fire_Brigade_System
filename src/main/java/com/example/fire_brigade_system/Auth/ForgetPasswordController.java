package com.example.fire_brigade_system.Auth;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.Node;

public class ForgetPasswordController {
    @FXML
    private TextField codeField;
    @FXML
    private TextField userIdField;
    @FXML
    private TextField phoneField;
    @FXML
    private Label messageLabel;

    // Store the code "sent" to the user (for demo, always 1234)
    private String generatedCode = null;

    @FXML
    public void handleGetCode(ActionEvent actionEvent) {
        String userId = userIdField.getText();
        String phone = phoneField.getText();

        // Basic validation
        if (userId.isEmpty() || phone.isEmpty()) {
            messageLabel.setText("Enter User ID and Phone!");
            return;
        }

        // In a real app, check if user ID and phone match a real user.
        // Here, we just send code="1234"
        generatedCode = "1234";
        messageLabel.setText("Verification code: 1234");
    }

    @FXML
    public void handleNext(ActionEvent actionEvent) {
        String enteredCode = codeField.getText();

        if (generatedCode == null) {
            messageLabel.setText("Get code first!");
            return;
        }
        if (!"1234".equals(enteredCode)) {
            messageLabel.setText("Incorrect Code!");
            return;
        }

        // Code correct, go to reset password screen!
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/com/example/fire_brigade_system/auth/reset_password.fxml"));
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (Exception e) {
            messageLabel.setText("Can't load reset password page.");
            e.printStackTrace();
        }
    }
}
