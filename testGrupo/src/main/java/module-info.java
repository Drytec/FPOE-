module com.example.testgrupo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.testgrupo to javafx.fxml;
    exports com.example.testgrupo;
}