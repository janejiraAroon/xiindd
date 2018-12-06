package logic;

import javafx.scene.image.Image;

public class Sheep extends Sprite{

	public Sheep() {
		super();
		String image_path = ClassLoader.getSystemResource("Rpurple2.png").toString();
		setImage(new Image(image_path));
	}
	
	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}
	
}
