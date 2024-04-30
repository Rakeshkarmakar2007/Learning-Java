module org.example.animal {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.animal to javafx.fxml;
    exports org.example.animal;
}