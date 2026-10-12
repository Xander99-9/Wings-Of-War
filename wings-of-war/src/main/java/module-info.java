module com.wingsofwar {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.wingsofwar to javafx.fxml;
    exports com.wingsofwar;
}
