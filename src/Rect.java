import java.awt.Color;
import java.awt.Graphics;


public class Rect extends FillableShape{

	private double x;
	private double y;
	private double width;
	private double height;
	private Color color;
	
	public Rect(double x, double y, double width, double height, Color color)
	{
		super(x, y, color);
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.color = color;
	}
	
	public double getWidth()
	{
		return width;
	}
	
	public double getHeight()
	{
		return height;
	}
	
	public void paint(Graphics g)
	{
		g.setColor(color);
		//g.drawRect((int) x, (int) y, (int) width, (int) height);
		g.fillRect((int) x, (int) y, (int) width, (int) height);
	}
}
