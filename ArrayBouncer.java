import java.awt.Graphics;

public class ArrayBouncer implements Mover{
    private int[] x;
    private int[] y;
    private int xDirection;
    private int yDirection;
    private Sprite sprite;

    /** Create a Bouncer that positions sprite at (startX, startY). */
    public ArrayBouncer(int[] startX, int[] startY, Sprite sprite) {
        x = startX;
        y = startY;
        this.sprite = sprite; 
    }

    /** Starts moving the object in the direction (xIncrement, yIncrement). */
    public void setMovementVector(int xIncrement, int yIncrement) {
        xDirection = xIncrement;
        yDirection = yIncrement;
    }

    /** Draws the sprite at its current position on to surface. */
    public void draw(Graphics surface) {
        // Draw the sprite
    	for (int i=0; i<x.length; i++) {
    		sprite.draw(surface, x[i], y[i]);
    		System.out.println(x[i]);
    	

        // Move the object each time we draw it
        
        	x[i] += xDirection;
            y[i] += yDirection;
    	

        // If we have hit the edge and are moving in the wrong direction, reverse direction
        // We check the direction because if a box is placed near the wall, we would get "stuck"
        // rather than moving in the right direction
	        if ((x[i] <= 0 && xDirection < 0) ||
	                (x[i] + sprite.getWidth() >= SimpleDraw.WIDTH && xDirection > 0)) {
	            xDirection = -xDirection;
	        }
	        if ((y[i] <= 0 && yDirection < 0) ||
	                (y[i] + sprite.getHeight() >= SimpleDraw.HEIGHT && yDirection > 0)) {
	            yDirection = -yDirection;
	        }
    	}
        }
        
    }
