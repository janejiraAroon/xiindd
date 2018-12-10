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

public class GameScene extends Canvas {

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
		GraphicsContext gc = this.getGraphicsContext2D();

		for (IRenderable sprite : RenderableHolder.getInstance().getAllSprite()) {
			sprite.draw(gc);
		}

		gc.setFill(Color.DARKSLATEBLUE);
		String pscore = "SCORE : " + (GameLogic.score);
		gc.setFont(Font.loadFont("file:res/PressStart2P.ttf", 15));
		gc.fillText(pscore, 700, 20);

		int lives = GameLogic.lives;
		int x = 700;
		for (int i = 0; i <= lives; i++) {
			gc.drawImage(RenderableHolder.heart, x, 550, 50, 50);
			x += 50;
		}

		drawWhenLose(gc);
		drawWhenWin(gc);

	}

	private void drawWhenLose(GraphicsContext gc) {
		if (InputUtility.isDie) {
			System.out.println("input die");
			gc.setFill(Color.DIMGRAY);
			gc.setFont(Font.loadFont("file:res/PressStart2P.ttf", 50));
			gc.fillText("GAME OVER", 200, 300);
			gc.setFill(Color.LIGHTSEAGREEN);
			String s = "Try again next time, " + playerName + "!";
			gc.fillText(s, 200, 300);
		}
	}

	private void drawWhenWin(GraphicsContext gc) {
		if (InputUtility.isWin) {
			System.out.println("input win");

			gc.setFill(Color.BLUEVIOLET);
			gc.setFont(Font.loadFont("file:res/PressStart2P.ttf", 50));
			gc.fillText("Congratulations!", 400, 300);
			gc.fillText(playerName, 200, 300);

			gc.drawImage(RenderableHolder.rPurple, 100, 350);
			gc.drawImage(RenderableHolder.rBlue, 230, 350);
			gc.drawImage(RenderableHolder.rGreen, 360, 350);
			gc.drawImage(RenderableHolder.rYellow, 490, 350);
			gc.drawImage(RenderableHolder.rOrange, 620, 350);
			gc.drawImage(RenderableHolder.rRed, 750, 350);
		}
	}

	public void updateBg() {
		GraphicsContext gc = this.getGraphicsContext2D();
		gc.drawImage(RenderableHolder.levelBg, 0, 0, 900, 600);

	}

	public String getPlayerName() {
		return playerName;
	}

}
