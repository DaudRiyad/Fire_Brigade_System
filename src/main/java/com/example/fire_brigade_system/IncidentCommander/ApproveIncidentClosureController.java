package com.example.fire_brigade_system.IncidentCommander;


import javafx.event.ActionEvent;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleGroup;

public class ApproveIncidentClosureController
{
    @javafx.fxml.FXML
    private TextArea finalRemarksTextArea;
    @javafx.fxml.FXML
    private RadioButton tmClearedYesRB;
    @javafx.fxml.FXML
    private RadioButton tmClearedNoRB;
    @javafx.fxml.FXML
    private ToggleGroup grB;
    @javafx.fxml.FXML
    private ToggleGroup grA;
    @javafx.fxml.FXML
    private ToggleGroup grC;
    @javafx.fxml.FXML
    private RadioButton safetyNoRB;
    @javafx.fxml.FXML
    private RadioButton safetyYesRB;
    @javafx.fxml.FXML
    private RadioButton equipmentYesRB;
    @javafx.fxml.FXML
    private RadioButton equipmentNoRB;

    @javafx.fxml.FXML
    public void initialize() {
    }
    String safetyChecklist;
    String equipmentReturn;
    String alltmCleared;
    @javafx.fxml.FXML
    public void closeOnAction(ActionEvent actionEvent) {
        if(safetyYesRB.isSelected()){
            safetyChecklist= "Yes";
        }
        else if (safetyNoRB.isSelected()) {
            safetyChecklist= "No";
        }
        if (equipmentYesRB.isSelected()){
            equipmentReturn = "Yes";
        } else if (equipmentNoRB.isSelected()) {
            equipmentReturn = "No";


        }
        if (tmClearedYesRB.isSelected()){
            alltmCleared= "Yes";

        } else if (tmClearedNoRB.isSelected()) {
            alltmCleared= "No";

        }
        if(safetyChecklist.equals("Yes")&& equipmentReturn.equals("Yes") && alltmCleared.equals("Yes")){
            finalRemarksTextArea.setText("Incident Closer Approved");
        }

    }

}