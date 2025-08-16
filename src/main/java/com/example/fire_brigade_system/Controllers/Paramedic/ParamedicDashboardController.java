package com.example.fire_brigade_system.Controllers.Paramedic;

import com.example.fire_brigade_system.Models.Incident;
import com.example.fire_brigade_system.utils.IncidentStorageUtil;
import com.example.fire_brigade_system.utils.SceneUtil;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ParamedicDashboardController {

    private final String INCIDENTS_FILE = "incidents.bin";
    @FXML
    private Label statusMessage;
    @FXML
    private ListView<Incident> assignedIncidentsList;

    @FXML
    public void initialize() {
        List<Incident> loadedIncidents = new ArrayList<>();


        File file = new File(INCIDENTS_FILE);
        if (file.exists()) {
            try {
                loadedIncidents = IncidentStorageUtil.loadIncidents(INCIDENTS_FILE);
            } catch (Exception e) {
                e.printStackTrace();

                showAlert("Error", "Failed to load incidents data.");
            }
        } else {

            loadedIncidents.add(new Incident("001", "123 Elm Street", "House Fire", "Active"));
            loadedIncidents.add(new Incident("002", "456 Warehouse Ave", "Chemical Fire", "Active"));
        }

        ObservableList<Incident> obsList = FXCollections.observableArrayList(loadedIncidents);
        assignedIncidentsList.setItems(obsList);
        assignedIncidentsList.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
    }

    @FXML
    public void handleRespond(ActionEvent event) {
        Incident selected = assignedIncidentsList.getSelectionModel().getSelectedItem();
        if (selected == null) {
            showAlert("Warning", "Please select an incident to respond.");
            return;
        }

        // Here you can add logic to mark paramedic as responding to selected incident
        showAlert("Responding", "You are responding to incident:\n" + selected.toString());
    }

    @Deprecated
    public void handleReturn(ActionEvent event) {
        try {
            SceneUtil.switchScene(event, "/com/example/fire_brigade_system/paramedic/dashboard.fxml");
        } catch (Exception e) {
            e.printStackTrace();
            showAlert("Error", "Failed to return to dashboard.");
        }
    }

    private void showAlert(String title, String content) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }

    @FXML
    public void handleLogout(ActionEvent actionEvent) {
        try {
            SceneUtil.switchScene(actionEvent, "/com/example/fire_brigade_system/Auth/login.fxml");
        } catch (Exception e) {
            e.printStackTrace();
            showAlert("Logout","Can't load forgot password page.");
        }
    }

    @FXML
    public void switchToTimeLog(ActionEvent actionEvent) {
        try {
            SceneUtil.switchScene(actionEvent, "/com/example/fire_brigade_system/paramedic/time_log.fxml");
        } catch (Exception e) {
            e.printStackTrace();
            showAlert("Error","Can't load the page.");
        }

    }

    @FXML
    public void switchToTreatment(ActionEvent actionEvent) {
        try {
        SceneUtil.switchScene(actionEvent, "/com/example/fire_brigade_system/paramedic/treatment_form.fxml");
        } catch (Exception e) {
        e.printStackTrace();
        showAlert("Error","Can't load the page.");
        }
    }

    @FXML
    public void switchToAmbulanceRequest(ActionEvent actionEvent) {
        try {
            SceneUtil.switchScene(actionEvent, "/com/example/fire_brigade_system/paramedic/request_ambulance.fxml");
        } catch (Exception e) {
            e.printStackTrace();
            showAlert("Error","Can't load the page.");
        }
    }

    @FXML
    public void switchToTriageTransport(ActionEvent actionEvent) {
        try {
            SceneUtil.switchScene(actionEvent, "/com/example/fire_brigade_system/paramedic/triageTransport_form.fxml");
        } catch (Exception e) {
            e.printStackTrace();
            showAlert("Error","Can't load the page.");
        }
    }
}
