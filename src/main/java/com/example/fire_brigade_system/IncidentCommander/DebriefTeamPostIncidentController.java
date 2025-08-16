package com.example.fire_brigade_system.IncidentCommander;

import com.example.fire_brigade_system.Incident;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class DebriefTeamPostIncidentController
{
    @javafx.fxml.FXML
    private TextField challengesTF;
    @javafx.fxml.FXML
    private ComboBox<String> incidentIDCB;
    @javafx.fxml.FXML
    private TextField takewaysTF;
    @javafx.fxml.FXML
    private TextArea suggestionTA;
    Incident incident;
    public void setter(Incident incident) {
        this.incident = incident;
    }

    @javafx.fxml.FXML
    public void initialize() {
        incidentIDCB.getItems().add(incident.getId());
    }

    @javafx.fxml.FXML
    public void submitDebrifeOnAction(ActionEvent actionEvent) {
        String takeways = takewaysTF.getText();
        String challenges = challengesTF.getText();
        String id = incidentIDCB.getValue();
        String suggestion = suggestionTA.getText();

        String debrief = "Incident Id :" + id + "\nTakeways : "+ takeways + "\nchallenges  :" + challenges  +"\nSuggestion : "+ suggestion;
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Debrief ");
        alert.setContentText(debrief);
        alert.showAndWait();
    }
}