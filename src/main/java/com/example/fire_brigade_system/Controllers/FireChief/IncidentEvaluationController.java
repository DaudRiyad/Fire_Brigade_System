package com.example.fire_brigade_system.Controllers.FireChief;

import com.example.fire_brigade_system.Models.Incident;
import com.example.fire_brigade_system.utils.IncidentStorageUtil;
import com.example.fire_brigade_system.utils.SceneUtil;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class IncidentEvaluationController {

    @FXML
    private ComboBox<Incident> incidentComboBox;

    @FXML
    private TextArea detailsArea;

    private final String INCIDENTS_FILE = "incidents.bin";

    @FXML
    public void initialize() {
        List<Incident> loadedIncidents = new ArrayList<>();


        File file = new File(INCIDENTS_FILE);
        if (file.exists()) {
            try {
                loadedIncidents = IncidentStorageUtil.loadIncidents(INCIDENTS_FILE);
            } catch (Exception e) {
                e.printStackTrace();

                showAlert("Error loading incidents", "Failed to load incidents. Showing empty list.");
            }
        }

        ObservableList<Incident> incidentsObservable = FXCollections.observableArrayList(loadedIncidents);
        incidentComboBox.setItems(incidentsObservable);


        incidentComboBox.setOnAction(event -> {
            Incident selected = incidentComboBox.getSelectionModel().getSelectedItem();
            if (selected != null) {
                detailsArea.setText(buildDetailsText(selected));
            } else {
                detailsArea.clear();
            }
        });
    }

    private String buildDetailsText(Incident incident) {
        StringBuilder sb = new StringBuilder();
        sb.append("Incident ID: ").append(incident.getId()).append("\n");
        sb.append("Location: ").append(incident.getLocation()).append("\n");
        sb.append("Status: ").append(incident.getStatus()).append("\n");
        sb.append("Description:\n").append(incident.getDescription()).append("\n");
        return sb.toString();
    }

    private void showAlert(String title, String content) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }

    @FXML
    public void handleReturn(ActionEvent actionEvent) {

        System.out.println("Returning to Fire Chief dashboard...");
        try {
            SceneUtil.switchScene(actionEvent, "/com/example/fire_brigade_system/fire_chief/dashboard.fxml");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
