package com.example.fire_brigade_system.IncidentCommander;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class AllocateResourcesController {
    @FXML
    private TableColumn<Rechorces, String> trucksCol;
    @FXML
    private TableColumn<Rechorces, String> fireFighterCol;
    @FXML
    private TableColumn<Rechorces, String> equipmentCol;
    @FXML
    private ComboBox<String> trucksComboBox;
    @FXML
    private ComboBox<String> equipmentComboBox;
    @FXML
    private Label outputLabel;
    @FXML
    private TableView<Rechorces> allocateResourcesTableView;
    @FXML
    private ComboBox<String> firefighterComboBox;


    public static class Rechorces {
        String fireFighter, trucks,equipment;

        public Rechorces(String fireFighter, String trucks, String equipment) {
            this.fireFighter = fireFighter;
            this.trucks = trucks;
            this.equipment = equipment;
        }

        public String getFireFighter() {
            return fireFighter;
        }

        public void setFireFighter(String fireFighter) {
            this.fireFighter = fireFighter;
        }

        public String getTrucks() {
            return trucks;
        }

        public void setTrucks(String trucks) {
            this.trucks = trucks;
        }

        public String getEquipment() {
            return equipment;
        }

        public void setEquipment(String equipment) {
            this.equipment = equipment;
        }

        @Override
        public String toString() {
            return "Rechorces{" +
                    "fireFighter='" + fireFighter + '\'' +
                    ", trucks='" + trucks + '\'' +
                    ", equipment='" + equipment + '\'' +
                    '}';
        }
    }
    ObservableList<Rechorces> rechorces = FXCollections.observableArrayList();

    public void initialize() {

        fireFighterCol.setCellValueFactory(new PropertyValueFactory<>("fireFighter"));
        trucksCol.setCellValueFactory(new PropertyValueFactory<>("trucks"));
        equipmentCol.setCellValueFactory(new PropertyValueFactory<>("equipment"));

        firefighterComboBox.getItems().addAll("fireFighter1", "fireFighter2", "fireFighter3");
        trucksComboBox.getItems().addAll("truck1", "truck2", "truck3", "truck4", "truck5");
        equipmentComboBox.getItems().addAll("WaterPipe", "Stracher", "FireSuit", "FireBall");

    }

    @FXML
    public void addButtonOA(ActionEvent actionEvent) {
        String fireFighter = firefighterComboBox.getValue();
        String trucks = trucksComboBox.getValue();
        String equipment = equipmentComboBox.getValue();
        Rechorces rc = new Rechorces(fireFighter, trucks, equipment);


        allocateResourcesTableView.getItems().addAll(rc);


    }

    @FXML
    public void confirmResourcesOA(ActionEvent actionEvent) {

        //fireFighteroutputLabel.setText("Rechorces confirm");
    }



}