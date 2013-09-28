import java.awt.Color;
import java.awt.Graphics;


public class Rect extends FillableShape{

	private double width;
	private double height;
	
	public Rect(double x, double y, Color color)
	{
		super(x,y, color);
		width = x;
		height = y;
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
		
	}
}
