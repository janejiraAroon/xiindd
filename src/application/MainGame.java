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
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import logic.GameLogic;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.paint.ImagePattern;
import javafx.stage.Stage;



public class MainGame extends Application {
	
	private Scene sceneMenu, sceneSelect, sceneLevel;
	private MenuScene menu;

	@Override
	public void start(Stage stage) throws Exception {
		menu = new MenuScene(); sceneMenu = new Scene(menu,900,600);
		//sceneSelect = new SelectMode(); sceneSelect = new Scene(sceneSelect,900,600);
		
		VBox root = new	VBox();
		Scene scene = new Scene(root);
		GameLogic logic = new GameLogic();
		GameScene gameScene = new GameScene(900,600);
		root.getChildren().add(gameScene);		
		
			
		
		((Button)menu.getStartBtn()).setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				System.out.println("start");
				stage.setScene(scene);
				gameScene.requestFocus();
				AnimationTimer animation = new AnimationTimer() {
					public void handle(long now) {
						gameScene.updateBg();
						gameScene.paintComponent();
						logic.logicUpdate();
						RenderableHolder.getInstance().update();
						if (InputUtility.getKeyPressed(KeyCode.E)) {
							stage.setScene(sceneMenu);
							menu.requestFocus();
						}
					}
				};
				animation.start();
			}
		});
//		
//		((Button)sceneSelect.getStMode()).setOnAction(new EventHandler<ActionEvent>() {
//			@Override
//			public void handle(ActionEvent event) {
//				stage.setScene(sceneLevel);
//			}
//		});
//		
//		((Button)sceneSelect.getBack()).setOnAction(new EventHandler<ActionEvent>() {
//			@Override
//			public void handle(ActionEvent event) {
//				stage.setScene(sceneMenu);
//			}
//		});
//		
		
		stage.setResizable(false);
		stage.setTitle("Little Bunny");
//		stage.setScene(scene);
		stage.setScene(sceneMenu);
		stage.show();
		
	}
		
	public static void main(String[] args) {
		launch(args);
	}

}


