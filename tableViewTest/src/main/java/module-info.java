module com.oop.tableviewtest {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.oop.tableviewtest to javafx.fxml;
    exports com.oop.tableviewtest;
}