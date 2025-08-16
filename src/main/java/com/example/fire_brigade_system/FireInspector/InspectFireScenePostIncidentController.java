package com.example.fire_brigade_system.FireInspector;
import com.example.fire_brigade_system.Incident;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class InspectFireScenePostIncidentController
{
    @javafx.fxml.FXML
    private TextField burnpatternsTF;
    @javafx.fxml.FXML
    private TextArea findinfTA;
    @javafx.fxml.FXML
    private TextField ignitionSourcesTF;
    @javafx.fxml.FXML
    private TextArea obserbationTF;
    @javafx.fxml.FXML
    private ComboBox<String> incidentIdCB;

    Incident incident;
    public void setter(Incident incident){
        this.incident = incident;
    }

    @javafx.fxml.FXML
    public void initialize() {
        incidentIdCB.getItems().add(incident.getId());
    }

    @javafx.fxml.FXML
    public void submitfindingsOA(ActionEvent actionEvent) {
        String incidentID = incidentIdCB.getValue();
        String ignitionSource = ignitionSourcesTF.getText();
        String burnpatterns = burnpatternsTF.getText();
        String obserbation = obserbationTF.getText();

        String findings = "IncidentID :"+ incidentID + "\nBurnPatterns: "+ burnpatterns + "\nObservation :"+ obserbation;
        findinfTA.setText(findings);
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Findings ");
        alert.setContentText(findings);
        alert.showAndWait();
    }
}