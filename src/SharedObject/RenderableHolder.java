package SharedObject;

import java.util.ArrayList;

import javafx.scene.image.Image;
import logic.Carrot;
import logic.Sheep;

public class RenderableHolder {
	private static final RenderableHolder instance = new RenderableHolder();
	
	private ArrayList<IRenderable> carrots;
	private ArrayList<IRenderable> sheepp;
	//add for astronaut
	
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
		rRed = new Image(ClassLoader.getSystemResource("Rred.png").toString());
	}
	
	public RenderableHolder() {
		carrots = new ArrayList<IRenderable>();
		sheepp = new ArrayList<IRenderable>();
	}
	
	public static RenderableHolder getInstance() {
		return instance;
	}
	
	public void add(IRenderable charactor) {
		if (charactor instanceof Carrot) {
			carrots.add(charactor);
		}else if (charactor instanceof Sheep) {
			sheepp.add(charactor);
		}
	}
	
	public void update() {
		for (int i = carrots.size() -1 ; i>=0 ;i--) {
			if (carrots.get(i).isDestroyed()) {
				carrots.remove(i);
			}
		}
		for (int i = sheepp.size()-1 ; i>=0 ; i--) {
			if (sheepp.get(i).isDestroyed()) {
				carrots.remove(i);
			}
		}
	}

	public ArrayList<IRenderable> getCarrots() {
		return carrots;
	}

	public ArrayList<IRenderable> getSheepp() {
		return sheepp;
	}
	
	

}
