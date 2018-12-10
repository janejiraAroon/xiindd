package logic;

import SharedObject.RenderableHolder;
import javafx.scene.image.Image;

public class Heart extends Sprite{
	
	Heart(){
		super() ;
		addHeart() ;
	}

	public void addHeart(){
		setImage(RenderableHolder.heart);
		
	}
	
	@Override
	public void update() {
		// TODO Auto-generated method stub
		addHeart() ;
		
	}

}
