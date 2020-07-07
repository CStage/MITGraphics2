import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class DrawGraphics {
    Bouncer movingSprite;
    ArrayBouncer FatRect;
    StraightMover StraightSprite;
    StraightMover FatStraight;
    

    /** Initializes this class for drawing. */
    public DrawGraphics() {
    	
        Rectangle box = new Rectangle(15, 20, Color.RED);
        movingSprite = new Bouncer(100, 170, box);
        movingSprite.setMovementVector(3, 1);
        int[] xArray = {5, 9, 12, -9, -5};
        int[] yArray = {10, 14, 17, -14, -11};
        Star st = new Star(30, 40, Color.GREEN, xArray, yArray);
        FatRect = new ArrayBouncer(xArray, yArray, st);
        FatRect.setMovementVector(-3, -1);
        Rectangle straightBox = new Rectangle(10, 15, Color.BLUE);
        StraightSprite = new StraightMover(100, 150, straightBox);
        StraightSprite.setMovementVector(-2, 3);
    }

    /** Draw the contents of the window on surface. */
    public void draw(Graphics surface) {
    	ArrayList<Mover> MoverList = new ArrayList<Mover>();
        MoverList.add(movingSprite);
        MoverList.add(FatRect);
        MoverList.add(StraightSprite);
        for (Mover j:MoverList) {
        	j.draw(surface);
        }
        }
        
        
    }
