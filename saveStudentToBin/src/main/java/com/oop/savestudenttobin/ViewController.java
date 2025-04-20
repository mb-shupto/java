package com.oop.savestudenttobin;

import javafx.scene.control.Label;

public class ViewController
{
    @javafx.fxml.FXML
    private Label outputLabel;

    @javafx.fxml.FXML
    public void initialize() {

    }

    public void dataPassing(Student s){
        outputLabel.setText(s.toString());
    }
}