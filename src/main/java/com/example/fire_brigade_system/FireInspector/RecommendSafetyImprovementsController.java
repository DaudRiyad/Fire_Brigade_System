package com.example.fire_brigade_system.FireInspector;

import com.example.fire_brigade_system.Incident;
import com.example.fire_brigade_system.Incident;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import java.io.IOException;
import java.util.Objects;

public class RecommendSafetyImprovementsController
{
    @javafx.fxml.FXML
    private TextArea recomandationTA;
    @javafx.fxml.FXML
    private ComboBox<String> improvementListCB;
    @javafx.fxml.FXML
    private ComboBox<String> severtyLabelCB;
    @javafx.fxml.FXML
    private Label locationlabel;
    @javafx.fxml.FXML
    private Label typeLabel;
    @FXML
    private ComboBox<String> idComboBox;
    @FXML
    private Label safetyOutputLabel;
    Report report;
    Incident incident;

    public void setter(Incident incident) {
        this.incident = incident;

    }

    ObservableList<Incident> incidentObservableList = FXCollections.observableArrayList();
    @FXML
    public void initialize() throws IOException {
        Incident incident1= new Incident("1", "School", "Bashabo","","");
        Incident incident2= new Incident("2", "Mall", "Gulshan","","");
        Incident incident3 = new Incident("3", "College", "Dhaka","","");
        //incidentObservableList.addAll(incident1,incident2,incident3);
        incidentObservableList.addAll(incident);
        //incidentObservableList.addAll(incident2);
        //incidentObservableList.addAll(incident3);



        severtyLabelCB.getItems().addAll("Low","Medium","High","Critical");
        improvementListCB.getItems().addAll("Increase Fire exit","Buy safety equipments","Fix Fire Alarm","Change Date over Equipments");
        for (Incident incident: incidentObservableList){
            idComboBox.getItems().add(incident.getId());
        }


    }

    @javafx.fxml.FXML
    public void submitRecommaendation(ActionEvent actionEvent) {
        String incidentid = idComboBox.getValue();
        typeLabel.setText(incident.getType());
        locationlabel.setText(incident.getLocation());
        String severtylabel = severtyLabelCB.getValue();
        String improvementList = improvementListCB.getValue();
        String recommendation = "IncidentID : "+incidentid + "\nSevertyLabel :"+ severtylabel+ "\nType : "+typeLabel +"\nLocation :"+ locationlabel + "\nImprovementList :"+ improvementList;
        recomandationTA.setText(recommendation);
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Recomandation ");
        alert.setContentText(recommendation);
        alert.showAndWait();


    }

    @FXML
    public void incidentIdOA(ActionEvent actionEvent) {
        String incidentid = idComboBox.getValue();
        typeLabel.setText(incident.getType());
        locationlabel.setText(incident.getLocation());
        String severtylabel = severtyLabelCB.getValue();
        String improvementList = improvementListCB.getValue();



        for (Incident incident: incidentObservableList){
            if(Objects.equals(incident.getId(), incidentid)){
                typeLabel.setText(incident.getType());
                locationlabel.setText(incident.getLocation());
                safetyOutputLabel.setText(incident.toString());
                severtyLabelCB.getValue();
                improvementListCB.getValue();


            }
        }
    }
}