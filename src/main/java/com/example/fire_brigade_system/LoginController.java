package com.example.fire_brigade_system;


import com.example.fire_brigade_system.FireInspector.FireInspector;
import com.example.fire_brigade_system.FireInspector.FireInspectorDashboardController;
import com.example.fire_brigade_system.IncidentCommander.IncidentCommander;
import com.example.fire_brigade_system.IncidentCommander.IncidentCommanderDashboardController;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;

public class LoginController
{
    @javafx.fxml.FXML
    private PasswordField passwordTextField;
    @javafx.fxml.FXML
    private Label loginOutputLabel;
    @javafx.fxml.FXML
    private ComboBox<String> accountTypeComboBox;
    @javafx.fxml.FXML
    private TextField userIDTextField;

    ObservableList<FireInspector> fireInspectorObservableList = FXCollections.observableArrayList();
    ObservableList<IncidentCommander> incidentCommanderObservableList =FXCollections.observableArrayList();



    @javafx.fxml.FXML
    public void initialize() {
        FireInspector fireInspector= new FireInspector("Inspector","123456789","inspector@gmail.com","Dhaka","Male","1234", LocalDate.of(1990,05,05));
        System.out.println(fireInspector.getId());
        System.out.println(fireInspector.getPassword());
        fireInspectorObservableList.add(fireInspector);


        IncidentCommander incidentCommander= new IncidentCommander("Commandar","123456789","commander@gmail.com","Dhaka","Male","12345", LocalDate.of(1990,05,05));
        System.out.println(incidentCommander.getId());
        incidentCommanderObservableList.add(incidentCommander);
    }

    @javafx.fxml.FXML
    public void logInButtonOnAction(ActionEvent actionEvent) throws IOException {
        String id,password;
        boolean flag = true;

        Alert erroralert = new Alert(Alert.AlertType.ERROR);

        id = userIDTextField.getText();
        password = passwordTextField.getText();

        if (id.isBlank()){
            flag = false;
            erroralert.setTitle("User ID Error");
            erroralert.setContentText("User ID can not be blank");
            erroralert.showAndWait();
        }
        if (password.isBlank()){
            flag = false;
            erroralert.setTitle("Password Error");
            erroralert.setContentText("Password can not be blank");
            erroralert.showAndWait();
        }
        System.out.println(flag);
        if(flag){
            if (id.length()== 4) {
                System.out.println("length is 10");
                for (FireInspector fireInspector : fireInspectorObservableList) {
                    System.out.println("Id:"+fireInspector.getId());
                    System.out.println("pass:"+fireInspector.getPassword());
                    if (fireInspector.login(id,password) ){
                        Parent root = null;
                        FXMLLoader fxmlLoader= new FXMLLoader(HelloApplication.class.getResource("FireInspector/FireInspectorDashboard.fxml"));
                        root= fxmlLoader.load();

                        FireInspectorDashboardController fireInspectorDashboardController =fxmlLoader.getController();
                        fireInspectorDashboardController.setter(fireInspector);
                        Scene scene= new Scene(root);
                        Stage stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow() ;
                        stage.setScene(scene);
                        stage.setTitle("Fire Inspector");
                        stage.show();

                    }

                }

            } else if ( id.length()==5) {
                for (IncidentCommander incidentCommander: incidentCommanderObservableList){
                    if (incidentCommander.login(id,password)  ){
                        Parent root = null;
                        FXMLLoader fxmlLoader= new FXMLLoader(HelloApplication.class.getResource("IncidentCommander/IncidentCommanderDashboard.fxml"));
                        root= fxmlLoader.load();

                        IncidentCommanderDashboardController incidentCommanderDashboardController =fxmlLoader.getController();
                        incidentCommanderDashboardController.setter(incidentCommander);

                        Scene scene= new Scene(root);
                        Stage stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow() ;
                        stage.setScene(scene);
                        stage.setTitle("Incident Commander");
                        stage.show();

                    }
                }

            }



        }

    }

    @javafx.fxml.FXML
    public void createAccountOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader= new FXMLLoader(HelloApplication.class.getResource("CreateAccountPage.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow() ;
        stage.setScene(scene);
        stage.setTitle("Create Account");
        stage.show();

    }
}