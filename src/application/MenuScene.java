package application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class MenuScene extends VBox{
	
	private Scene s1, s2, s3;
	private Stage stageOwner;
	private Label label;
	private OurButton startBtn,howtoBtn,highscoreBtn;
	
	public MenuScene(/*Scene s1,Scene s2,Scene s3, Stage stageOwner*/){	
		this.s1 = s1 ;// this.s2 = s2; this.s3 = s3;
		this.stageOwner = stageOwner;
		label  = new Label("Progmeth");
		label.setFont(new Font(100));
		setSpacing(50);
		setPadding(new Insets(10,5,10,5));
		setAlignment(Pos.CENTER);	
		
		startBtn = new OurButton("START"/*,s1,stageOwner*/);
		howtoBtn = new OurButton("HOW TO PLAY"/*,s2,stageOwner*/);
		highscoreBtn = new OurButton("HIGHSCORES"/*,s3,stageOwner*/);
		getChildren().addAll(label,startBtn,howtoBtn,highscoreBtn);
		
		
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
