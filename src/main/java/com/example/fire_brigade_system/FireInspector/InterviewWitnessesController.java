package com.example.fire_brigade_system.FireInspector;


import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;

public class InterviewWitnessesController
{
    @javafx.fxml.FXML
    private ComboBox<String> witnessCB;
    @javafx.fxml.FXML
    private CheckBox checkbox1;
    @javafx.fxml.FXML
    private CheckBox checkbox2;
    @javafx.fxml.FXML
    private TextArea summaryTA;
    @javafx.fxml.FXML
    private CheckBox checkbox3;
    @javafx.fxml.FXML
    private TextArea interviewLabel;

    @javafx.fxml.FXML
    public void initialize() {
        witnessCB.getItems().addAll("Withness1","Withness2","Withness3","Withness4");
    }
    String statement = null;
    @javafx.fxml.FXML
    public void generateReportOA(ActionEvent actionEvent) {
        String withness = witnessCB.getValue();
        String summary = summaryTA.getText();
        String statement1 = " I saw flames near the kitchen.";
        String statement2 = " The alarm didn’t ring..";
        String statement3 = " There was a spark before the fire.";
        String statement12 = " I saw flames near the kitchen.\nThe alarm didn’t ring.";
        String statement13 = " I saw flames near the kitchen.\nThere was a spark before the fire";
        String statement23 = " The alarm didn’t ring.\nThere was a spark before the fire.";
        String statement123 = " I saw flames near the kitchen.\nThe alarm didn’t ring.\nThere was a spark before the fire.";

        if(checkbox1.isSelected() && checkbox2.isSelected() &&checkbox3.isSelected() ){
            statement= statement123;

        } else if (checkbox1.isSelected() && checkbox2.isSelected()) {
            statement= statement12;

        } else if (checkbox2.isSelected() &&checkbox3.isSelected()) {
            statement = statement23;


        }
        else if (checkbox1.isSelected() && checkbox3.isSelected()) {
            statement = statement13;


        } else if (checkbox1.isSelected()) {
            statement = statement1;

        }

        else if( checkbox2.isSelected()) {
            statement = statement2;
        }

        else if(checkbox3.isSelected() ) {
            statement = statement3;

        }

        else {
            statement= "Nothing Suspicious";
        }
        String interview = "Withness Name :"+ withness + "\nSummary: "+ summary + "\nStatement :"+ statement;

        interviewLabel.setText(interview);
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Investigation Report ");
        alert.setContentText(interview);
        alert.showAndWait();

    }
}