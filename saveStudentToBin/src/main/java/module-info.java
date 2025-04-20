module com.oop.savestudenttobin {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.oop.savestudenttobin to javafx.fxml;
    exports com.oop.savestudenttobin;
}