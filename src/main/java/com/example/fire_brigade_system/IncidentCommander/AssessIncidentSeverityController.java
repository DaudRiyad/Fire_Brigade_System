package com.example.fire_brigade_system.IncidentCommander;
import com.example.fire_brigade_system.Incident;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

import java.util.Objects;


public class AssessIncidentSeverityController
{
    @javafx.fxml.FXML
    private Label updatemessageOutLabel;
    @javafx.fxml.FXML
    private Label typeLable;
    @javafx.fxml.FXML
    private ComboBox<String> severtyLableComboBox;
    @javafx.fxml.FXML
    private Label locationLabel;
    @javafx.fxml.FXML
    private ComboBox<String> idComboBox;
    Incident incident;
    ObservableList<Incident> incidentObservableList = FXCollections.observableArrayList();
    public void setter(Incident incident){
        this.incident = incident;
    }


    @javafx.fxml.FXML
    public void initialize() {
        Incident incident1= new Incident("1", "School", "Bashabo","","");
        Incident incident2= new Incident("2", "Mall", "Gulshan","","");
        Incident incident3 = new Incident("3", "College", "Dhaka","","");
        incidentObservableList.addAll(incident1);
        incidentObservableList.addAll(incident2);
        incidentObservableList.addAll(incident3);

        severtyLableComboBox.getItems().addAll("Low","Medium","High","Critical");

        for (Incident incident: incidentObservableList){
            idComboBox.getItems().add(incident.getId());
        }

    }


    @javafx.fxml.FXML
    public void incidentComboBoxOA(ActionEvent actionEvent) {
        String incidentid = idComboBox.getValue();
        //typeLable.setText(incident.getType());
        //locationLabel.setText(incident.getLocation());
        String severtylabel = severtyLableComboBox.getValue();



        for (Incident incident: incidentObservableList){
            if(Objects.equals(incident.getId(), incidentid)){
                typeLable.setText(incident.getType());
                locationLabel.setText(incident.getLocation());
                updatemessageOutLabel.setText(incident.toString());

            }
        }

    }

    @javafx.fxml.FXML
    public void incidentSevertyOA(ActionEvent actionEvent) {
        updatemessageOutLabel.setText(incident.toString());
    }
}