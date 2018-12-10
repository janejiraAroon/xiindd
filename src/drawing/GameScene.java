package drawing;

import SharedObject.IRenderable;
import SharedObject.RenderableHolder;
import input.InputUtility;
import javafx.animation.AnimationTimer;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import logic.GameLogic;

public class GameScene extends Canvas{
	
	private String playerName;
	
	public GameScene(double width, double height, String playerName) {
		super(width, height);
		this.playerName = playerName;
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

		//gc.setFill(Color.AQUA);		
		//gc.fillRect(0, 0, 900, 600);
		
		for (IRenderable sprite : RenderableHolder.getInstance().getAllSprite()) {
			// System.out.println(entity.getZ());
				sprite.draw(gc);
		}
		gc.setFill(Color.DARKSLATEBLUE);
		String pscore = "SCORE : "+(GameLogic.score);
		gc.fillText(pscore, 800, 20);
		
		//TODO when game is over
		if (InputUtility.isDie) {
			System.out.println("input die");
			gc.setFill(Color.BLACK);
			gc.fillText("GAME OVER", 400, 300);
			gc.setFill(Color.LIGHTSEAGREEN);
			String s = "Try again next time, " + playerName + "!";
			gc.fillText(s, 200, 300);
		}
		
		//TODO when game is win
		if (InputUtility.isWin) {
			System.out.println("input win");
			gc.setFill(Color.BLUEVIOLET);
			//TODO set Font and color
			gc.fillText("Congratulations!", 400 ,300);
			gc.fillText(playerName, 200, 300);
			
			gc.drawImage(RenderableHolder.rPurple, 100, 350);
			gc.drawImage(RenderableHolder.rBlue,230, 350);
			gc.drawImage(RenderableHolder.rGreen,360, 350);
			gc.drawImage(RenderableHolder.rYellow,490, 350);
			gc.drawImage(RenderableHolder.rOrange,620, 350);
			gc.drawImage(RenderableHolder.rRed,750, 350);
		}
	
	}
	
	public void updateBg() {
		GraphicsContext gc = this.getGraphicsContext2D();
		gc.drawImage(RenderableHolder.levelBg, 0, 0,900,600);

	}
	}

	

