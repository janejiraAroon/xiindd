package logic;

import input.InputUtility;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;

public class Astronaunt extends Sprite{
	
	public Astronaunt() {
		super();
		String image_path = ClassLoader.getSystemResource("astronaut.png").toString();
		setImage(new Image(image_path));
	}
	
	public void update(double x,double y) {
		positionX += x;
		positionY += y;
	}

	public void update() {
		if (InputUtility.getKeyPressed(KeyCode.SPACE)) {
			if(positionY > -20) {
				update(0,-5);
			}
		}
		else {
			if(positionY < 500)
				update(0,3);}
		if (InputUtility.getKeyPressed(KeyCode.LEFT)) {
			if(positionX > -30) {
				update(-5,0);
			}
		}
		if (InputUtility.getKeyPressed(KeyCode.RIGHT)) {
			if(positionX < 850) {
			update(5,0);
		}
			}
	}
	
}
