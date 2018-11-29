package application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class OurButton extends Button{
	private String text;
	private Scene sceneNext;
	private Stage stageOwner;
	
	public OurButton(String text/*, Scene sceneNext, Stage StageOwner*/) {
//		System.out.println(label);
		this.text = text;
		this.sceneNext = sceneNext;
		this.stageOwner = stageOwner;
		
		this.setText(text);
		setPrefSize(100, 50);
		this.setOnMouseEntered(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				setPrefSize(150, 70);
			}
		});
		this.setOnMouseExited(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				setPrefSize(100, 50);
			}
		});
		/*this.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				stageOwner.setScene(sceneNext);
			}
		});*/
	}
	
	
	
}
