package logic;

import SharedObject.IRenderable;
import javafx.geometry.Rectangle2D;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public abstract class Sprite implements IRenderable{
	protected Image image;
	protected double positionX;
	protected double positionY;
	protected double velocityX;
	protected double velocityY;
	protected double width;
	protected double height;
	protected boolean destroyed;
	
	public Sprite() {
		this.positionX = 0;
		this.positionY = 0;
		this.velocityX = 0;
		this.velocityY = 0;
		this.destroyed = false;
	}
	
	public void setImage(Image image) {
		this.image = image;
		this.width = image.getWidth();
		this.height = image.getHeight();
		
	}
	
	
	public double getPositionX() {
		return positionX;
	}

	public double getPositionY() {
		return positionY;
	}

	public double getVelocityX() {
		return velocityX;
	}

	public double getVelocityY() {
		return velocityY;
	}

	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}
	
	public void setPosition(double x, double y) {
		this.positionX = x;
		this.positionY = y;
	}

	@Override
	public boolean isDestroyed() {
		return destroyed;
	}
	
	@Override
	public void draw(GraphicsContext gc) {
		gc.drawImage(image, positionX, positionY);
	}
	
	public Rectangle2D getBoundary() {
		return new Rectangle2D(positionX, positionY, width, height);
	}
	
	public boolean interscetsSprite(Sprite s) {
		return s.getBoundary().intersects(this.getBoundary());
	}
	
	abstract public void update() ;
	
}
