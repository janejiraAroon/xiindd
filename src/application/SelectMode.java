package application;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;

public class SelectMode extends VBox{
	private OurButton chMode,stMode,back;
	
	public SelectMode() {
		setAlignment(Pos.CENTER);
		setSpacing(70);
		HBox hbox = new HBox(200);
		hbox.setAlignment(Pos.CENTER);
		hbox.setPadding(new Insets(100,0,0,0));
		chMode = new OurButton("Challenge");
		stMode = new OurButton("Select Stage");
		hbox.getChildren().addAll(chMode,stMode);
		back = new OurButton("BACK");
		
		getChildren().addAll(hbox,back);
	}

	public OurButton getChMode() {
		return chMode;
	}

	public OurButton getStMode() {
		return stMode;
	}

	public OurButton getBack() {
		return back;
	}
	
}
