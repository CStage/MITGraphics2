import java.awt.Graphics;

public class ParentMovement {
	public int x;
	public int y;
	public int xDirection;
	public int yDirection;
	public Sprite sprite;
	
	public void setMovementVector(int xIncrement, int yIncrement) {
		xDirection = xIncrement;
		yDirection = yIncrement;
	}
	
	public void draw(Graphics graphics) {
		sprite.draw(graphics, x, y);
		
		x += xDirection;
		y += yDirection;
	}

}
