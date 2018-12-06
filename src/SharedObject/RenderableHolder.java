package SharedObject;

import java.util.ArrayList;

import javafx.scene.image.Image;
import logic.Astronaunt;
import logic.Carrot;
import logic.Sheep;
import logic.Sprite;

public class RenderableHolder {
	private static final RenderableHolder instance = new RenderableHolder();
	
	private ArrayList<IRenderable> allSprite;
	private Astronaunt astronaunt;
	
	public static Image cPurple;
	public static Image cBlue;
	public static Image cGreen;
	public static Image cYellow;
	public static Image cOrange;
	public static Image cRed;
	
	public static Image sheep1;
	public static Image sheep2;
	public static Image sheep3;
	public static Image sheep4;
	public static Image sheep5;
	public static Image sheep6;
	public static Image sheep7;
	
	public static Image rPurple;
	public static Image rBlue;
	public static Image rGreen;
	public static Image rYellow;
	public static Image rOrange;
	public static Image rRed;
	
	static {
		loadResourse();
	}
	
	public static void loadResourse() {
		cPurple = new Image(ClassLoader.getSystemResource("Cpurple.png").toString());
		cBlue = new Image(ClassLoader.getSystemResource("Cblue.png").toString());
		cGreen = new Image(ClassLoader.getSystemResource("Cgreen.png").toString());
		cYellow = new Image(ClassLoader.getSystemResource("Cyellow.png").toString());
		cOrange = new Image(ClassLoader.getSystemResource("Corange.png").toString());
		cRed = new Image(ClassLoader.getSystemResource("Cred.png").toString());
		
		sheep1 = new Image(ClassLoader.getSystemResource("sheep1.png").toString());
		sheep1 = new Image(ClassLoader.getSystemResource("sheep2.png").toString());
		sheep3 = new Image(ClassLoader.getSystemResource("sheep3.png").toString());
		sheep4 = new Image(ClassLoader.getSystemResource("sheep4.png").toString());
		sheep5 = new Image(ClassLoader.getSystemResource("sheep5.png").toString());
		sheep6 = new Image(ClassLoader.getSystemResource("sheep6.png").toString());
		sheep7 = new Image(ClassLoader.getSystemResource("sheep7.png").toString());
		
		rPurple = new Image(ClassLoader.getSystemResource("Rpurple2.png").toString());
		rBlue = new Image(ClassLoader.getSystemResource("Rblue2.png").toString());
		rGreen = new Image(ClassLoader.getSystemResource("Rgreen2.png").toString());
		rYellow = new Image(ClassLoader.getSystemResource("Ryellow2.png").toString());
		rOrange = new Image(ClassLoader.getSystemResource("Rorange2.png").toString());
		rRed = new Image(ClassLoader.getSystemResource("Rred2.png").toString());
	}
	
	public RenderableHolder() {
		allSprite = new ArrayList<IRenderable>();
	}
	
	public ArrayList<IRenderable> getAllSprite() {
		return allSprite;
	}

	public static RenderableHolder getInstance() {
		return instance;
	}
	
	public void add(IRenderable charactor) {
		allSprite.add(charactor);
		if (charactor instanceof Carrot) {
			System.out.println("carrot");
		}else if (charactor instanceof Sheep) {
			System.out.println("sheep");
		}else if (charactor instanceof Astronaunt) {
			astronaunt = (Astronaunt) charactor;
			System.out.println("Astronaunt");
		}
	}
	
	public void update() {
		for (int i = allSprite.size()-1 ; i >= 0 ; i--) {
			if (!(allSprite.get(i) instanceof Astronaunt)) {
				Sprite what = (Sprite) allSprite.get(i);
				if (astronaunt.interscetsSprite(what)) {
					allSprite.remove(i);
				}
			}
		}
		
	}

	
	

}
