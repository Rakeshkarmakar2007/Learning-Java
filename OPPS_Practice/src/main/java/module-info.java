module org.example.opps_practice {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.opps_practice to javafx.fxml;
    exports org.example.opps_practice;
}