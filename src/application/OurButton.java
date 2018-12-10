package application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class OurButton extends Button {
	private String text;

	public OurButton(String text) {
		this.text = text;

		this.setText(text);
		setPrefSize(100, 50);
		this.setOnMouseEntered(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				setFont(Font.loadFont("file:res/PressStart2P.ttf", 20));
			}
		});
		this.setOnMouseExited(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				setPrefSize(100, 50);
			}
		});
	}

}