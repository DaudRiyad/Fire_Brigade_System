package com.example.fire_brigade_system.Controllers.FireChief;

import com.example.fire_brigade_system.Models.Incident;
import com.example.fire_brigade_system.utils.IncidentStorageUtil;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class IncidentLogsController {

    @FXML
    private ComboBox<Incident> logsComboBox;

    @FXML
    private Label messageLabel;

    private final String INCIDENTS_FILE = "incidents.bin";
    private final String ARCHIVE_FILE = "archived_incidents.bin";

    private List<Incident> archivedIncidents = new ArrayList<>();

    @FXML
    public void initialize() {
        List<Incident> loadedLogs = new ArrayList<>();
        File file = new File(INCIDENTS_FILE);
        if (file.exists()) {
            try {
                loadedLogs = IncidentStorageUtil.loadIncidents(INCIDENTS_FILE);
            } catch (Exception e) {
                e.printStackTrace();
                showAlert("Error", "Could not load incident logs.");
            }
        }
        ObservableList<Incident> obsList = FXCollections.observableArrayList(loadedLogs);
        logsComboBox.setItems(obsList);
        logsComboBox.setPromptText("Select an incident log");
    }

    @FXML
    public void handleViewLog(ActionEvent actionEvent) {
        Incident selected = logsComboBox.getSelectionModel().getSelectedItem();
        if (selected == null) {
            messageLabel.setText("Please select an incident to view.");
            return;
        }
        messageLabel.setText("Incident ID: " + selected.getId() +
                "\nLocation: " + selected.getLocation() +
                "\nStatus: " + selected.getStatus() +
                "\nDescription: " + selected.getDescription());
    }

    @FXML
    public void handleArchiveLog(ActionEvent actionEvent) {
        Incident selected = logsComboBox.getSelectionModel().getSelectedItem();
        if (selected == null) {
            messageLabel.setText("Please select an incident to archive.");
            return;
        }
        try {
            File archiveFile = new File(ARCHIVE_FILE);
            if (archiveFile.exists()) {
                archivedIncidents = IncidentStorageUtil.loadIncidents(ARCHIVE_FILE);
            }
            archivedIncidents.add(selected);

            IncidentStorageUtil.saveIncidents(archivedIncidents, ARCHIVE_FILE);
            logsComboBox.getItems().remove(selected);
            IncidentStorageUtil.saveIncidents(new ArrayList<>(logsComboBox.getItems()), INCIDENTS_FILE);

            messageLabel.setText("Incident ID " + selected.getId() + " archived successfully.");
        } catch (Exception e) {
            e.printStackTrace();
            showAlert("Error", "Failed to archive the incident.");
        }
    }

    private void showAlert(String title, String msg) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(msg);
        alert.showAndWait();
    }
}
