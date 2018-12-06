package drawing;

import SharedObject.IRenderable;
import SharedObject.RenderableHolder;
import input.InputUtility;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import logic.GameLogic;

public class GameScene extends Canvas{
	
	public GameScene(double width, double height) {
		super(width, height);
		this.setVisible(true);
		addListener();
	}
	public void addListener() {
		this.setOnKeyPressed((KeyEvent event) -> {
			InputUtility.setKeyPressed(event.getCode(), true);
		});
		
		this.setOnKeyReleased((KeyEvent event) -> {
			InputUtility.setKeyPressed(event.getCode(), false);
		});
		

	}
	
	public void paintComponent() {
		//TODO draw a background and decorate
		GraphicsContext gc = this.getGraphicsContext2D();
		gc.setFill(Color.ANTIQUEWHITE);
		gc.fillRect(0, 0, 900, 600);
		for (IRenderable sprite : RenderableHolder.getInstance().getAllSprite()) {
			// System.out.println(entity.getZ());
				sprite.draw(gc);
		}
		gc.setFill(Color.DARKSLATEBLUE);
		String pscore = "SCORE : "+(GameLogic.score);
		gc.fillText(pscore, 800, 20);
		
		if (InputUtility.isDie) {
			gc.setFill(Color.BLACK);
			gc.fillText("GAME OVER", 400, 300);
		}
	
	}
	
}

