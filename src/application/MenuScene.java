package application;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class MenuScene extends VBox {

	private Label label;

	private OurButton startBtn;
	private TextField textName;
	private Label enterNameLabel;
	private BackgroundSize mainBgSize = new BackgroundSize(900, 600, false, false, false, false);

	public MenuScene() {
		label = new Label("Little\nBunny");
		label.setFont(Font.loadFont("file:res/PressStart2P.ttf", 60));
		label.setTextFill(Color.WHITE);
		getChildren().add(label);
		setSpacing(15);
		setAlignment(Pos.CENTER_LEFT);
		setPadding(new Insets(20, 50, 0, 450));
		createEnterNameField();

		BackgroundImage mainBg = new BackgroundImage(RenderableHolder.mainBg, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT,BackgroundPosition.DEFAULT,mainBgSize);
		BackgroundSize mainBgSize  = new BackgroundSize(900, 600, false, false, false, false);
    setBackground(new Background(mainBg)); // change to classloader


		startBtn = new OurButton("START");
		getChildren().addAll(startBtn);

	}

	private void createEnterNameField() {
		HBox hBox = new HBox(15);
		enterNameLabel = new Label("Enter Your Name");
		enterNameLabel.setFont(new Font(15));
		textName = new TextField();
		textName.setPromptText("Enter Your Name Here");
		enterNameLabel.setTextFill(Color.WHITE);
		hBox.getChildren().addAll(enterNameLabel, textName);
		getChildren().add(hBox);
	}

	public OurButton getStartBtn() {
		return startBtn;
	}

	public Label getLabel() {
		return label;
	}

	public TextField getTextName() {
		return textName;
	}

	public Label getEnterNameLabel() {
		return enterNameLabel;
	}


}
