package com.example.fire_brigade_system.FireInspector;


import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.time.LocalDate;

public class ConductFollowUpInspectionsController
{
    @javafx.fxml.FXML
    private TextArea notesTextArea;
    @javafx.fxml.FXML
    private DatePicker scheduleDatePicker;
    @javafx.fxml.FXML
    private RadioButton noRB;
    @javafx.fxml.FXML
    private TextField ViolationTF;
    @javafx.fxml.FXML
    private RadioButton yesRB;
    @javafx.fxml.FXML
    private ToggleGroup tg;

    @javafx.fxml.FXML
    public void initialize() {
    }
    String compilance;
    @javafx.fxml.FXML
    public void logInspectionRsltOnAction(ActionEvent actionEvent) {
        String unsolvedViolation = ViolationTF.getText();
        String note = notesTextArea.getText();
        LocalDate followupDate = scheduleDatePicker.getValue();
        if (yesRB.isSelected()){
            compilance = "Yes";
        } else if (noRB.isSelected()) {
            compilance = "No";

        }
        else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error ");
            alert.setContentText("Please select a Radio button");
            alert.showAndWait();
        }
        String followupInsp= ("Follow up Date :"+followupDate+"\nUnsolved Violation : "+unsolvedViolation +"\nCompilance : " + compilance + "\nNote : "+note);
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Follow Up Details ");
        alert.setContentText(followupInsp);
        alert.showAndWait();

    }
}