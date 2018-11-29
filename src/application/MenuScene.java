package application;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

class MButton extends Button{
	private Button btn ;
	private String label;
	
	public MButton(String label) {
		this.label = label;
		System.out.println(label);
		btn = new Button("Hello");
		btn.setPrefWidth(100);
		btn.setOnMouseEntered(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				btn.setPrefSize(150, 70);
			}
		});
		btn.setOnMouseExited(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
			btn.setPrefSize(100, 50);
			}
		});
		
	}
	
	
}

public class MenuScene extends Application{

	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		VBox root = new VBox(50);
		root.setPadding(new Insets(10,5,10,5));
		root.setAlignment(Pos.CENTER);
		
		Label gameName = new Label("PROG METH GAME");
		gameName.setPadding(new Insets(10,0,50,0));
		
		Button startBtn = new MButton("START");
		startBtn.setPrefWidth(100);
		
		
		MButton howtoBtn = new MButton("HOW TO PLAY");
		
		Button highscoreBtn = new Button("HIGHSCORES");
		highscoreBtn.setPrefWidth(100);
		highscoreBtn.setOnMouseEntered(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				highscoreBtn.setPrefSize(150, 70);
			}
		});
		highscoreBtn.setOnMouseExited(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				highscoreBtn.setPrefSize(100, 50);
			}
		});
		
		
		root.getChildren().addAll(gameName,startBtn,howtoBtn,highscoreBtn);
		
		Scene scene = new Scene(root,500,500);
		stage.setTitle("I love Prog Meth");
		stage.setScene(scene);
		stage.show();
	}
	
	public static void main(String [] args) {
		launch(args);
	}

}
