package application;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class NameException extends Exception{
	public NameException() {
		Alert alert = new Alert(AlertType.WARNING);
		alert.setTitle("Warning");
		alert.setHeaderText("OH NO!");
		alert.setContentText("Please enter your name!");
		alert.showAndWait();
	}
}
