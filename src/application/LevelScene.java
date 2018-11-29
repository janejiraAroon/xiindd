package application;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class LevelScene extends VBox{
	private Label label;
	private Label labelName;
	private TextField nameInput;
	private OurButton lev1, lev2, lev3, back, play;
	
	public LevelScene() {
		setSpacing(100);
		setPadding(new Insets(10,5,10,5));
		label = new Label("SELECT STAGE  ");
		label.setFont(new Font(30));
		setAlignment(Pos.CENTER);
		
		HBox name = new HBox(50);
		labelName = new Label("Enter Your Name");
		labelName.setFont(new Font(20));
		nameInput = new TextField();
		nameInput.setPromptText("ENTER YOU NAME HERE");
		nameInput.setPrefWidth(300);
		name.getChildren().addAll(labelName,nameInput);
		name.setAlignment(Pos.CENTER);
		name.setPadding(new Insets(70,0,0,0));
		
		HBox hBox = new HBox(50);
		lev1 = new OurButton("STAGE 1");
		lev2 = new OurButton("STAGE 2");
		lev3 = new OurButton("STAGE 3");
		hBox.setAlignment(Pos.CENTER);
		hBox.getChildren().addAll(label,lev1,lev2,lev3);
		
		HBox hBox2 = new HBox(30);
		back = new OurButton("BACK");
		play = new OurButton("PLAY!");
		Region region1 = new Region();
        HBox.setHgrow(region1, Priority.ALWAYS);
		hBox2.setAlignment(Pos.CENTER);
		hBox2.getChildren().addAll(back,region1,play);
		
		getChildren().addAll(name,hBox,hBox2);
	}

	public OurButton getLev1() {
		return lev1;
	}

	public OurButton getLev2() {
		return lev2;
	}

	public OurButton getLev3() {
		return lev3;
	}

	public OurButton getBack() {
		return back;
	}

	public OurButton getPlay() {
		return play;
	}
	
}
