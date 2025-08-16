package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class PSOCoordinateUnitsController {
    PSOCoordinateUnitsController is String location, time;
    @javafx.fxml.FXML
    private TextField messageTF;
    @javafx.fxml.FXML
    private ComboBox unitCB;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public PSOCoordinateUnitsController(String location, String time) {
        this.location = location;
        this.time = time;
    }

    @Override
    public String toString() {
        return "PSOCoordinateUnitsController{" +
                "location='" + location + '\'' +
                ", time='" + time + '\'' +
                '}';
    }

    @javafx.fxml.FXML
    public void handleSendOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backOA(ActionEvent actionEvent) throws IOException {
        Parent root = null ;
        FXMLLoader fxmlLoader = new FXMLLoader(com.example.demo.HelloApplication.class.getResource("pso_Dashboardfxml"));
        root = fxmlLoader.load();

        Scene scene = new Scene(root) ;
        Stage stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Dashboard");
        stage.show();
    }
}

