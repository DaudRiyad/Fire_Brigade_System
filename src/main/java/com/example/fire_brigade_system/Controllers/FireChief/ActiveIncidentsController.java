package com.example.fire_brigade_system.Controllers.FireChief;

import com.example.fire_brigade_system.Models.Incident;
import com.example.fire_brigade_system.utils.IncidentStorageUtil;
import com.example.fire_brigade_system.utils.SceneUtil;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ActiveIncidentsController {

    @FXML
    private ListView<Incident> incidentsListView;

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

            }
        } else {

            loadedIncidents.add(new Incident("001", "Elm Street", "House Fire", "Active"));
            loadedIncidents.add(new Incident("002", "Warehouse", "Chemical Fire", "Active"));
        }

        ObservableList<Incident> obsList = FXCollections.observableArrayList(loadedIncidents);
        incidentsListView.setItems(obsList);
        incidentsListView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
    }

    @FXML
    public void handleViewIncident(ActionEvent event) {
        Incident selected = incidentsListView.getSelectionModel().getSelectedItem();
        if (selected == null) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Warning");
            alert.setHeaderText(null);
            alert.setContentText("Please select an incident to view.");
            alert.showAndWait();
            return;
        }


        System.out.println("Viewing incident: " + selected);
    }

    @FXML
    public void handleReturn(ActionEvent event) {

        System.out.println("Returning to Fire Chief dashboard");
        try {
            SceneUtil.switchScene(event, "/com/example/fire_brigade_system/fire_chief/dashboard.fxml");
        } catch (Exception e) {

            e.printStackTrace();
        }
    }


//    private void saveIncidents() {
//        try {
//            IncidentStorageUtil.saveIncidents(new ArrayList<>(incidentsListView.getItems()), INCIDENTS_FILE);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
}
