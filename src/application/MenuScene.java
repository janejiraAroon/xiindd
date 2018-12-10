package application;

import javafx.event.ActionEvent;
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
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.Side;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;


public class MenuScene extends VBox{
	
	private Scene s1, s2, s3;
	private Stage stageOwner;
	private Label label;
	private OurButton startBtn ;
//	BackgroundPosition mainBgPos = new BackgroundPosition(Side.LEFT,0.5, true, Side.TOP, 0, false);
	BackgroundSize mainBgSize  = new BackgroundSize(900, 600, false, false, false, false);
	
	public MenuScene(/*Scene s1,Scene s2,Scene s3, Stage stageOwner*/){	
		this.s1 = s1 ;// this.s2 = s2; this.s3 = s3;
		this.stageOwner = stageOwner;
		label  = new Label("Little\nBunny");
		label.setFont(Font.loadFont("file:res/PressStart2P.ttf", 60));
		label.setTextFill(Color.WHITE);		
		
		setSpacing(5);
		setAlignment(Pos.CENTER_LEFT);	
		setPadding(new Insets(20,50,0,450));
		
		BackgroundImage mainBg = new BackgroundImage(RenderableHolder.mainBg, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT,BackgroundPosition.DEFAULT,mainBgSize);
		setBackground(new Background(mainBg));  
		 
		
		startBtn = new OurButton("START"/*,s1,stageOwner*/);
		startBtn.setFont(Font.loadFont("file:res/PressStart2P.ttf", 20));
		startBtn.setBackground(null);
		startBtn.setBorder(null);
		
		getChildren().addAll(label,startBtn);		
		

	}

	public OurButton getStartBtn() {
		return startBtn;
	}

		
	

}
