package com.example.fire_brigade_system.IncidentCommander;
import javafx.event.ActionEvent;
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
        //liveupdate = liveUPFieldsTextArea.setText();
    }

    @javafx.fxml.FXML
    public void sendCommandOnAction(ActionEvent actionEvent) {
        String command = sendCommandTextArea.getText();
        //fireFighterOPLabel.settex(command);
    }
}