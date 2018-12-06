package SharedObject;

import javafx.scene.canvas.GraphicsContext;

public interface IRenderable {
	public void draw(GraphicsContext gc);
	public boolean isDestroyed();
}
