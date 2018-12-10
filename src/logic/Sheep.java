package logic;

import SharedObject.RenderableHolder;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public class Sheep extends Sprite{

	private int countPic;
	
	public Sheep() {
		super();
		countPic = 1;
		setImage(RenderableHolder.sheep1);
		
	}
	
	private void updateByScore() {
		if (GameLogic.score < 500) {
			positionX -= 4;
		}else if (GameLogic.score < 1100) {
			positionX -= 6;
		}else if (GameLogic.score < 1800) {
			positionX -= 8;
		}else if (GameLogic.score < 2400) {
			positionX -= 12;
		}else if (GameLogic.score < 3300) {
			positionX -= 14;
		}else {
			positionX -= 16;
		}
	}
	
	private void animationpic() {
		if (countPic == 1) {
			setImage(RenderableHolder.sheep2);
		} else if (countPic == 2) {
			setImage(RenderableHolder.sheep3);
		} else if (countPic == 3) {
			setImage(RenderableHolder.sheep4);
		} else if (countPic == 4) {
			setImage(RenderableHolder.sheep5);
		}else if (countPic == 5) {
			setImage(RenderableHolder.sheep6);
		}else if (countPic == 6) {
			setImage(RenderableHolder.sheep7);
		}else if (countPic == 7) {
			setImage(RenderableHolder.sheep8);
		}else if (countPic == 8) {
			setImage(RenderableHolder.sheep9);
		}else if (countPic == 9) {
			setImage(RenderableHolder.sheep1);
		}
		if (countPic == 9) {
			countPic = 1;
		} else {
			countPic++;
		}
	}
	
	@Override
	public void update() {
		// TODO Auto-generated method stub
		updateByScore();
		animationpic();
	}
	
	
}
