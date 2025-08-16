package com.example.fire_brigade_system.FireInspector;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;

public class IdentifyFireCodeViolationsController
{
    @javafx.fxml.FXML
    private ComboBox<String> severtyRatingCB;
    @javafx.fxml.FXML
    private TextArea recomandetationTA;
    @javafx.fxml.FXML
    private TextArea violationTA;
    @javafx.fxml.FXML
    private CheckBox violation1CkB;
    @javafx.fxml.FXML
    private CheckBox violation2CkB;
    @javafx.fxml.FXML
    private CheckBox violation3CkB;

    @javafx.fxml.FXML
    public void initialize() {
        severtyRatingCB.getItems().addAll("0","1","2", "3","4","5","6","7","8","9","10");

    }
    String violation = null;
    @javafx.fxml.FXML
    public void generateVReportOA(ActionEvent actionEvent) {
        String severtyRating = severtyRatingCB.getValue();
        String recomandetion = recomandetationTA.getText();
        String violation1 = "blocked exits";
        String violation2 = "faulty alarms";
        String violation3 = "Expired Extinguish";

        if(violation1CkB.isSelected()){
            violation = violation1;
        }
        else if (violation2CkB.isSelected()) {
            violation = violation2;

        }
        else if (violation3CkB.isSelected()){
            violation = violation3;
        }
        else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Please select a checkbox");

        }
        String violationReport = ("Violation:"+violation+"\nSevertyRating: "+severtyRating +"\nRecomendation: " + recomandetationTA);
        violationTA.setText(violationReport);
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Violation Report ");
        alert.setContentText(violationReport);
        alert.showAndWait();

    }

}