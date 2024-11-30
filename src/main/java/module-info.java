module com.example.houserentals {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.houserentals to javafx.fxml;
    exports com.example.houserentals;
}