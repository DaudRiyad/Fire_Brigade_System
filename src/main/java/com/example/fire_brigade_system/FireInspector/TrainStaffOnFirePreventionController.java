package com.example.fire_brigade_system.FireInspector;
import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.time.LocalDate;

public class TrainStaffOnFirePreventionController
{
    @javafx.fxml.FXML
    private ComboBox<String> topicCB;
    @javafx.fxml.FXML
    private ComboBox<String> assignCB;
    @javafx.fxml.FXML
    private RadioButton slot1RB;
    @javafx.fxml.FXML
    private DatePicker datepicker;
    @javafx.fxml.FXML
    private RadioButton slot3RB;
    @javafx.fxml.FXML
    private RadioButton slot2RB;
    @javafx.fxml.FXML
    private ToggleGroup groupA;
    @javafx.fxml.FXML
    private RadioButton slot4RB;

    @javafx.fxml.FXML
    public void initialize() {
        topicCB.getItems().addAll("Emergency medical services","Fire Suppression","Hazardous Materials","Fire Service Management");
        assignCB.getItems().addAll("Team A","Team B","Team C","Team D");

    }
    String trainingTime;
    @javafx.fxml.FXML
    public void scheduleTrainingOA(ActionEvent actionEvent) {
        String topic = topicCB.getValue();
        String assignedTeam = assignCB.getValue();
        LocalDate trainingDate = datepicker.getValue();
        if (slot1RB.isSelected()){
            trainingTime = "8 AM";
        } else if (slot2RB.isSelected()) {
            String trainingTime = "10 AM";

        } else if (slot3RB.isSelected()) {
            trainingTime = "12 PM";

        } else if (slot4RB.isSelected()) {
            trainingTime = "3 PM";

        }
        else{
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error ");
            alert.setContentText("Please select a slot");
            alert.showAndWait();
        }
        String TrainingScedule= ("Training Topic:"+topic+"\nAssigned Team : "+assignedTeam +"\nTraining Date : " + trainingDate+"\nTraining Time: "+trainingTime);

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Violation Report ");
        alert.setContentText(TrainingScedule);
        alert.showAndWait();

    }
}