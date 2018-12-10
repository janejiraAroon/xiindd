package logic;

import SharedObject.RenderableHolder;
import javafx.scene.image.Image;

public class Heart extends Sprite{
	
	Heart(){
		super() ;
		addHeart() ;
	}

	public void addHeart(){
		setImage(RenderableHolder.addHeart);
		
	}
	
	public void updateHeart() {
		positionX -= 4;

	}
	
	@Override
	public void update() {
		updateHeart() ;
		// TODO Auto-generated method stub
		
	}

}
