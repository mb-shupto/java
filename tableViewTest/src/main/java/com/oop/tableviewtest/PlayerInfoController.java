package com.oop.tableviewtest;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class PlayerInfoController {

    @javafx.fxml.FXML
    private ComboBox<String> nameComboBox;
    @javafx.fxml.FXML
    private TextField jerseyTextField;

    @javafx.fxml.FXML
    private TableView<Player> playerTableView;

    @javafx.fxml.FXML
    private TableColumn<Player, Integer> jerseyColumn;
    @javafx.fxml.FXML
    private TableColumn<Player, String> nameColumn;

    @javafx.fxml.FXML
    private Label outputLabel;

    @javafx.fxml.FXML
    public void initialize() {
        nameComboBox.getItems().addAll("Chris Gayle", "Sunil Narine", "Virat Kohli", "MS Dhoni", "David Warner", "Mike Hussey");
        jerseyColumn.setCellValueFactory(new PropertyValueFactory<>("jerseyNo"));
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
    }


    @javafx.fxml.FXML
    public void saveOnAction(ActionEvent actionEvent) {
        try {
            // Retrieve values from combo box and text field
            String selectedName = nameComboBox.getValue();
            int jerseyNumber = Integer.parseInt(jerseyTextField.getText());

            // Create a new Player object
            Player player = new Player(selectedName, jerseyNumber);

            // Add Player object to TableView
            playerTableView.getItems().add(player);

            // Display success message
            outputLabel.setText(player.toString() + "added to the player list.");
            jerseyTextField.clear(); // Clear text field for next input
        } catch (NumberFormatException e) {
            // Handle invalid number input in jerseyTextField
            outputLabel.setText("Please enter a valid jersey number.");
        } catch (NullPointerException e) {
            // Handle case where no combo box selection is made
            outputLabel.setText("Please select a player name.");
        }
    }
}