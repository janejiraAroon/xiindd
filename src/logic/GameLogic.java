package logic;

import java.util.ArrayList;

import SharedObject.RenderableHolder;

public class GameLogic {
	private ArrayList<Sprite> gameObjectContainer;
	private Astronaunt astronaunt;
	public static int score = 0;
	private int numRandom;
	private double posRandom;
	
	public GameLogic() {
		this.gameObjectContainer = new ArrayList<Sprite>();
		astronaunt = new Astronaunt();
		astronaunt.setPosition(0, 200);
		addnewObject(astronaunt);
	}
	
	protected void addnewObject(Sprite sprite) {
		gameObjectContainer.add(sprite);
		RenderableHolder.getInstance().add(sprite);
	}
	
	
	public void logicUpdate() {
		astronaunt.update();
		for (int i = gameObjectContainer.size()-1 ; i >= 0 ; i--) {
			Sprite what = gameObjectContainer.get(i);
			what.update();
			if (!(what instanceof Astronaunt)) {
				if (astronaunt.interscetsSprite(what)) {
					if (what instanceof Carrot) System.out.println("carrot");
					if (what instanceof Sheep) System.out.println("sheep");
					gameObjectContainer.remove(i);
					score+=100;
				}
			}
		}
		
		numRandom = (int)(Math.random()*100 + 1);
		System.out.println(numRandom);
		posRandom = Math.random()*600;
		//TODO add new enemies or carrots 
		if (numRandom == 1) { 
			Carrot carrot = new Carrot();
			carrot.setPosition(900, posRandom);
			addnewObject(carrot);
		}
		
	}
	
	
	

}
