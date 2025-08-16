package com.example.fire_brigade_system.IncidentCommander;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;

public class CoordinateOnSceneOperationsController
{
    @javafx.fxml.FXML
    private TextArea liveUPFieldsTextArea;
    @javafx.fxml.FXML
    private TextArea sendCommandTextArea;


    String liveupdate;
    @javafx.fxml.FXML
    public void initialize() {
        liveUPFieldsTextArea.setText("Need BackUp");
    }

    @javafx.fxml.FXML
    public void sendCommandOnAction(ActionEvent actionEvent) {
        String command = sendCommandTextArea.getText();
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Debrief ");
        alert.setContentText(command);
        alert.showAndWait();
    }
}