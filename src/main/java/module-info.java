module com.example.houserentalpos {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.houserentalpos to javafx.fxml;
    exports com.example.houserentalpos;
}