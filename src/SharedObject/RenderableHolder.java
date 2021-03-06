package SharedObject;

import java.net.URISyntaxException;
import java.util.ArrayList;

import application.MainGame;
import javafx.scene.image.Image;
import javafx.scene.media.AudioClip;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import logic.Astronaunt;
import logic.Carrot;
import logic.Sheep;
import logic.Sprite;

public class RenderableHolder {
	private static final RenderableHolder instance = new RenderableHolder();

	private static final ClassLoader CLASS_LOADER = RenderableHolder.class.getClassLoader();

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
	public static Image sheep8;
	public static Image sheep9;

	public static Image rPurple;
	public static Image rBlue;
	public static Image rGreen;
	public static Image rYellow;
	public static Image rOrange;
	public static Image rRed;

	public static Image levelBg;
	public static Image mainBg;

	public static MediaPlayer menuSound;
	public static MediaPlayer playingSound;
	public static AudioClip sheepSound;
	public static AudioClip collectCarrotSound;
	public static AudioClip loseSound;
	public static AudioClip congratsSound;
	public static AudioClip gameOverSound;
	public static Image heart;
	public static Image addHeart;

	static {
		loadResourse();
	}

	public static void loadResourse() {
		cPurple = new Image(ClassLoader.getSystemResource("Cpurple.png").toString(), 80, 80, true, false);
		cBlue = new Image(ClassLoader.getSystemResource("Cblue.png").toString(), 80, 80, true, false);
		cGreen = new Image(ClassLoader.getSystemResource("Cgreen.png").toString(), 80, 80, true, false);
		cYellow = new Image(ClassLoader.getSystemResource("Cyellow.png").toString(), 80, 80, true, false);
		cOrange = new Image(ClassLoader.getSystemResource("Corange.png").toString(), 80, 80, true, false);
		cRed = new Image(ClassLoader.getSystemResource("Cred.png").toString(), 80, 80, true, false);

		sheep1 = new Image(ClassLoader.getSystemResource("sheep1.png").toString(), 80, 80, true, false);
		sheep2 = new Image(ClassLoader.getSystemResource("sheep2.png").toString(), 80, 80, true, false);
		sheep3 = new Image(ClassLoader.getSystemResource("sheep3.png").toString(), 80, 80, true, false);
		sheep4 = new Image(ClassLoader.getSystemResource("sheep4.png").toString(), 80, 80, true, false);
		sheep5 = new Image(ClassLoader.getSystemResource("sheep5.png").toString(), 80, 80, true, false);
		sheep6 = new Image(ClassLoader.getSystemResource("sheep6.png").toString(), 80, 80, true, false);
		sheep7 = new Image(ClassLoader.getSystemResource("sheep7.png").toString(), 80, 80, true, false);
		sheep8 = new Image(ClassLoader.getSystemResource("sheep8.png").toString(), 80, 80, true, false);
		sheep9 = new Image(ClassLoader.getSystemResource("sheep9.png").toString(), 80, 80, true, false);

		rPurple = new Image(ClassLoader.getSystemResource("Rpurple2.png").toString());
		rBlue = new Image(ClassLoader.getSystemResource("Rblue2.png").toString());
		rGreen = new Image(ClassLoader.getSystemResource("Rgreen2.png").toString());
		rYellow = new Image(ClassLoader.getSystemResource("Ryellow2.png").toString());
		rOrange = new Image(ClassLoader.getSystemResource("Rorange2.png").toString());
		rRed = new Image(ClassLoader.getSystemResource("Rred2.png").toString());

		levelBg = new Image(ClassLoader.getSystemResource("levelBg.png").toString());
		mainBg = new Image(ClassLoader.getSystemResource("mainBg.png").toString());

		try {
			menuSound = new MediaPlayer(new Media(CLASS_LOADER.getResource("menu.mp3").toURI().toString()));
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		playingSound = new MediaPlayer(new Media(ClassLoader.getSystemResource("play2.mp3").toString()));
		collectCarrotSound = new AudioClip(ClassLoader.getSystemResource("collectCarrot1.wav").toString());
		sheepSound = new AudioClip(ClassLoader.getSystemResource("sheepSound2.mp3").toString());
		loseSound = new AudioClip(ClassLoader.getSystemResource("lose.wav").toString());
		congratsSound = new AudioClip(ClassLoader.getSystemResource("congratulations.wav").toString());
		gameOverSound = new AudioClip(ClassLoader.getSystemResource("game_over.wav").toString());

		heart = new Image(ClassLoader.getSystemResource("heart.png").toString(), 50, 50, true, false);
		addHeart = new Image(ClassLoader.getSystemResource("addHeart.png").toString(), 50, 50, true, false);

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
		} else if (charactor instanceof Sheep) {
			System.out.println("sheep");
		} else if (charactor instanceof Astronaunt) {
			astronaunt = (Astronaunt) charactor;
			System.out.println("Astronaunt");
		}
	}

	public void update() {
		for (int i = allSprite.size() - 1; i >= 0; i--) {
			if (!(allSprite.get(i) instanceof Astronaunt)) {
				Sprite what = (Sprite) allSprite.get(i);
				if (astronaunt.interscetsSprite(what)) {
					allSprite.remove(i);
				}
			}
		}

	}

}
