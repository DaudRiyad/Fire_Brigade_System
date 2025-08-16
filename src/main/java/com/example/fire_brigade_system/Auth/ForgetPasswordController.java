package com.example.fire_brigade_system.Auth;

import com.example.fire_brigade_system.utils.SceneUtil;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.util.Random;

public class ForgetPasswordController {
    @FXML
    private TextField codeField;
    @FXML
    private TextField userIdField;
    @FXML
    private TextField phoneField;
    @FXML
    private Label messageLabel;


    private String generatedCode = null;

    @FXML
    public void handleGetCode(ActionEvent actionEvent) {
        String userId = userIdField.getText();
        String phone = phoneField.getText();


        if (userId.isEmpty() || phone.isEmpty()) {
            messageLabel.setText("Enter User ID and Phone!");
            return;
        }


        Random random = new Random();
        int generatedCode = 1000 + random.nextInt(9000);
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


        try {
            SceneUtil.switchScene(actionEvent, "/com/example/fire_brigade_system/Auth/reset_password.fxml");
        } catch (Exception e) {
            e.printStackTrace();
            messageLabel.setText("Can't load forgot password page.");
        }
    }
}
