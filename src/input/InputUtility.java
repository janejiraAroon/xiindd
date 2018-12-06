package input;

import java.util.ArrayList;

import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.stage.Stage;

public class InputUtility {
	
	public static boolean isGamePaused= false;
	public static boolean isDie = false;
	public static ArrayList<KeyCode> keyPressed = new ArrayList<>();
	
	public static void backToMenu(Scene menuScene, Stage stage) {
		stage.setScene(menuScene);
	}
	
	public static void pauseGame() {
		isGamePaused = !isGamePaused;
	}
	
		
	public static void setKeyPressed(KeyCode keyCode, boolean pressed) {
		// TODO Auto-generated method stub
		if (!isGamePaused && !isDie) {
			if (pressed) {
				if(!keyPressed.contains(keyCode)) {
					keyPressed.add(keyCode);
				}
			}else {
				keyPressed.remove(keyCode);
			}
		}
	}

	public static ArrayList<KeyCode> getKeyPressed() {
		return keyPressed;
	}
	
	public static boolean getKeyPressed(KeyCode keycode) {
		return keyPressed.contains(keycode);
	}

}
