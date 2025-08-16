package com.example.fire_brigade_system.IncidentCommander;
import com.example.fire_brigade_system.Incident;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class UpdateIncidentDocumentationController
{
    @javafx.fxml.FXML
    private ComboBox<String> IncidentComboBox;
    @javafx.fxml.FXML
    private ComboBox<String> severtyLevelComboBox;
    @javafx.fxml.FXML
    private Button incidentReportTextArea;
    Incident incident;

    public void setter(Incident incident) {
        this.incident = incident;
    }
    @javafx.fxml.FXML
    public void initialize() {
        severtyLevelComboBox.getItems().addAll("low","medium","High", "Critical");
        IncidentComboBox.getItems().add(incident.getId());

    }

    @javafx.fxml.FXML
    public void submitDocumantationOnAction(ActionEvent actionEvent) {
        String resourcesused = ResourcesTF.getText();
        String casualities = casualitiesTF.getText();
        String id = IncidentComboBox.getValue();
        String severtyLabel = severtyLevelComboBox.getValue();

        String document = "Incident Id :" + id + "\nSeverty Label : "+ severtyLabel + "\nCasualities :" + casualities +"\nResources Used : "+ resourcesused ;
        incidentReportTextArea.setText(document);
    }
}