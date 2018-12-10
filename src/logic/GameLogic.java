package logic;

import java.util.ArrayList;

import SharedObject.RenderableHolder;
import input.InputUtility;

public class GameLogic {
	private ArrayList<Sprite> gameObjectContainer;
	private Astronaunt astronaunt;
	public static int score = 0;
	private int numRandom;
	private double posRandom;
	private int lives  = 2 ;
	
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
		if (!InputUtility.isGamePaused && !InputUtility.isDie && !InputUtility.isWin) {
			astronaunt.update();
			for (int i = gameObjectContainer.size()-1 ; i >= 0 ; i--) {
				Sprite what = gameObjectContainer.get(i);
				what.update();
				if (!(what instanceof Astronaunt)) {
					if (astronaunt.interscetsSprite(what)) {
						if (what instanceof Carrot) {
							System.out.println("carrot");
							score+=100;
							//TODO for winner
							if (score == 10000) {
								InputUtility.isWin = true;
								System.out.println("WIN!");
								break;
							}
							gameObjectContainer.remove(i);
						}
						if (what instanceof Sheep) {
							System.out.println("sheep");
							if(lives == 0) {
								InputUtility.isDie = true;}
							else
								lives -=1 ;
							
							gameObjectContainer.remove(i);
						}
					}
				}
			}

			if (!InputUtility.isDie && !InputUtility.isWin) {
				numRandom = (int)(Math.random()*100 + 1);
				System.out.println(numRandom);
				posRandom = Math.random()*600;
				//TODO add new enemies or carrots 
				if (numRandom == 1) { 
					Carrot carrot = new Carrot();
					carrot.setPosition(900, posRandom);
					addnewObject(carrot);
				}
				if (numRandom == 9) {
					Sheep sheep = new Sheep();
					sheep.setPosition(900, posRandom);
					addnewObject(sheep);
				}
			}

		}


	}

}
