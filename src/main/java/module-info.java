module com.example.fire_brigade_system {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.fire_brigade_system to javafx.fxml;
    exports com.example.fire_brigade_system;
    exports com.example.fire_brigade_system.Auth;
    opens com.example.fire_brigade_system.Auth to javafx.fxml;
    exports com.example.fire_brigade_system.Controllers;
    opens com.example.fire_brigade_system.Controllers to javafx.fxml;
}