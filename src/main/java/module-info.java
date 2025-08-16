module Fire.Brigade.System {
    requires javafx.base;
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    opens com.example.fire_brigade_system.Auth to javafx.fxml;
    exports com.example.fire_brigade_system.Auth;
    exports com.example.fire_brigade_system;
    opens com.example.fire_brigade_system.Controllers.FireChief to javafx.fxml;
    exports com.example.fire_brigade_system.Controllers.FireChief;
    opens com.example.fire_brigade_system.Controllers.Paramedic to javafx.fxml;
    exports com.example.fire_brigade_system.Controllers.Paramedic;
}