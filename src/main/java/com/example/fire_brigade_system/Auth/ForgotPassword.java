package com.example.fire_brigade_system.Auth;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;

public class ForgotPassword
{
    @javafx.fxml.FXML
    private PasswordField confirmNewPassword;
    @javafx.fxml.FXML
    private VBox step3Pane;
    @javafx.fxml.FXML
    private Button sendCodeButton;
    @javafx.fxml.FXML
    private Button resetPasswordButton;
    @javafx.fxml.FXML
    private ProgressBar progressBar;
    @javafx.fxml.FXML
    private TextField recoveryUserId;
    @javafx.fxml.FXML
    private PasswordField newPassword;
    @javafx.fxml.FXML
    private Label stepLabel;
    @javafx.fxml.FXML
    private Label statusLabel;
    @javafx.fxml.FXML
    private VBox step1Pane;
    @javafx.fxml.FXML
    private TextField phoneField;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void resetPassword(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void sendVerificationCode(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void showLogin(ActionEvent actionEvent) {
    }
}