module com.example.optshell {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.optshell to javafx.fxml;
    exports com.example.optshell;
}