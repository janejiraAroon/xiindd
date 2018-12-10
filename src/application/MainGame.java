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
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import logic.GameLogic;
import javafx.scene.input.KeyCode;

public class MainGame extends Application {

	private Scene sceneMenu;
	private MenuScene menu;

	@Override
	public void start(Stage stage) throws Exception {

		menu = new MenuScene();
		sceneMenu = new Scene(menu, 900, 600);
		RenderableHolder.menuSound.play();
		((Button) menu.getStartBtn()).setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				try {
					checkNameInput(menu.getTextName());
					System.out.println("start");
					RenderableHolder.menuSound.stop();
					VBox root = new VBox();
					Scene scene = new Scene(root);
					GameLogic logic = new GameLogic();
					GameScene gameScene = new GameScene(900, 600, menu.getTextName().getText());
					root.getChildren().add(gameScene);
					stage.setScene(scene);
					gameScene.requestFocus();
					AnimationTimer animation = new AnimationTimer() {
						@Override
						public void handle(long now) {
							gameScene.updateBg();
							gameScene.paintComponent();
							logic.logicUpdate();
							RenderableHolder.getInstance().update();
						}

					};
					animation.start();
				} catch (NameException e) {
					System.out.println();
				}

			}
		});

		stage.setResizable(false);
		stage.setTitle("Little Bunny");
		stage.setScene(sceneMenu);
		stage.show();

	}

	public void checkNameInput(TextField textName) throws NameException {
		String name = textName.getText();
		if (name.equals("")) {
			throw new NameException();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}

}
