package application;

import SharedObject.RenderableHolder;
import drawing.GameScene;
import input.InputUtility;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import logic.GameLogic;


public class MainGame extends Application {
	
	private Scene sceneMenu, sceneSelect, sceneLevel;
	private MenuScene menu;
	private LevelScene level;
	private SelectMode select;
	
	private Scene menuScene;

	@Override
	public void start(Stage stage) throws Exception {
		/*menu = new MenuScene(); sceneMenu = new Scene(menu,900,600);
		select = new SelectMode(); sceneSelect = new Scene(select,900,600);
		level = new LevelScene(); sceneLevel = new Scene(level,900,600);
		
		
		
		((Button)menu.getStartBtn()).setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				stage.setScene(sceneSelect);
			}
		});
		
		((Button)select.getStMode()).setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				stage.setScene(sceneLevel);
			}
		});
		
		((Button)select.getBack()).setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				stage.setScene(sceneMenu);
			}
		});
		
		((Button)level.getBack()).setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				stage.setScene(sceneSelect);
			}
		});
		
		stage.setTitle("I Love Prog Meth");
		stage.setScene(sceneMenu);
		stage.show();
		*/
		try {
		StackPane root = new StackPane();
		Scene scene = new Scene(root);
		stage.setTitle("Little Bunny");
		stage.setScene(scene);
		
		GameLogic logic = new GameLogic();
		GameScene gameScene = new GameScene(900,600);
		root.getChildren().add(gameScene);
		gameScene.requestFocus();
		
		stage.show();
		
		AnimationTimer animation = new AnimationTimer() {
			public void handle(long now) {
				gameScene.paintComponent();
				logic.logicUpdate();
				RenderableHolder.getInstance().update();
			}
		};
		animation.start();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
		
	public static void main(String[] args) {
		launch(args);

	}

}


