package logic;

import application.*;

import input.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

public class GameButtons extends HBox{
	
	private static final Button backBtn = new Button("Exit");
	private static final Button pauseBtn = new Button("Next");
	
	public GameButtons() {
	
		backBtn.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				// TODO Auto-generated method stub
				
				//set it in MainGame Class//
			}
		});
		
		pauseBtn.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				InputUtility.pauseGame();
			}
		});	
				
	}
	
	public Button getBackBtn() {
		return backBtn;
	}
	public Button getPauseBtn() {
		return pauseBtn;
	}
	
	
}
