package application;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
public class MenuScene extends VBox {

	private Label label;
	private OurButton startBtn, howtoBtn, highscoreBtn;
	BackgroundSize mainBgSize = new BackgroundSize(900, 600, false, false, false, false);

	public MenuScene() {
		label = new Label("Little\nBunny");
		label.setFont(Font.loadFont("file:res/PressStart2P.ttf", 60));
		label.setTextFill(Color.WHITE);

		setSpacing(5);
		setAlignment(Pos.CENTER_LEFT);
		setPadding(new Insets(20, 50, 0, 450));

		BackgroundImage mainBg = new BackgroundImage(new Image("mainBg.png"), BackgroundRepeat.NO_REPEAT,
				BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, mainBgSize);
		setBackground(new Background(mainBg)); // change to classloader

		startBtn = new OurButton("START");
		howtoBtn = new OurButton("HOW TO PLAY");
		highscoreBtn = new OurButton("HIGHSCORES");
		getChildren().addAll(label, startBtn, howtoBtn, highscoreBtn);

	}

	public OurButton getStartBtn() {
		return startBtn;
	}

	public OurButton getHowtoBtn() {
		return howtoBtn;
	}

	public OurButton getHighscoreBtn() {
		return highscoreBtn;
	}

}
