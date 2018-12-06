package logic;

import input.InputUtility;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;

public class Astronaunt extends Sprite{
	
	public Astronaunt() {
		super();
		//TODO change the name of pic
		String image_path = ClassLoader.getSystemResource("sheep1.png").toString();
		setImage(new Image(image_path));
	}
	
	public void update(double x,double y) {
		positionX += x;
		positionY += y;
	}

	public void update() {
		if (InputUtility.getKeyPressed(KeyCode.UP)) {
			update(0,-5);
		}
		if (InputUtility.getKeyPressed(KeyCode.LEFT)) {
			update(-5,0);
		}
		if (InputUtility.getKeyPressed(KeyCode.RIGHT)) {
			update(5,0);
		}
		if (InputUtility.getKeyPressed(KeyCode.DOWN)) {
			update(0,5);
		}
	}
	
}
