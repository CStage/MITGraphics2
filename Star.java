import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Star implements Sprite{
	private int width;
	private int height;
	private Color color;
	private int[] xArray;
	private int[] yArray;
	
	public Star(int width, int height, Color color, int[] xArray, int[] yArray) {
		this.width=width;
		this.height=height;
		this.color=color;
		this.xArray=xArray;
		this.yArray=yArray;
	}

	public void draw(Graphics surface, int leftX, int topY) {
		surface.setColor(color);
		surface.fillPolygon(xArray, yArray, 5);
		surface.setColor(Color.BLACK);
		((Graphics2D) surface).setStroke(new BasicStroke(3.0f));
		surface.drawPolygon(xArray, yArray, 5);
	}
	
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	
}
