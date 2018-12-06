package logic;

import SharedObject.RenderableHolder;
import javafx.scene.image.Image;

public class Carrot extends Sprite{

	public Carrot() {
		super();
		setImageByScore();
		
	}
	
	private void setImageByScore() {
		if (GameLogic.score < 500) {
			setImage(RenderableHolder.cPurple);
		}else if (GameLogic.score < 1100) {
			setImage(RenderableHolder.cBlue);
		}else if (GameLogic.score < 1800) {
			setImage(RenderableHolder.cGreen);
		}else if (GameLogic.score < 2400) {
			setImage(RenderableHolder.cYellow);
		}else if (GameLogic.score < 3300) {
			setImage(RenderableHolder.cOrange);
		}else {
			setImage(RenderableHolder.cRed);
		}
	}
	
	private void updateByScore() {
		if (GameLogic.score < 500) {
			positionX -= 4;
		}else if (GameLogic.score < 1100) {
			positionX -= 6;
		}else if (GameLogic.score < 1800) {
			positionX -= 8;
		}else if (GameLogic.score < 2400) {
			positionX -= 10;
		}else if (GameLogic.score < 3300) {
			positionX -= 12;
		}else {
			positionX -= 14;
		}
	}
	
	@Override
	public void update() {
		// TODO Auto-generated method stub
		updateByScore();
		
	}

}
