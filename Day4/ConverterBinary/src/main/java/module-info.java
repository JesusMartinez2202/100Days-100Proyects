module com.converter.converterbinary {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.converter.converterbinary to javafx.fxml;
    exports com.converter.converterbinary;
}