import java.awt.Color;
import java.awt.Graphics;


public class Line extends Shape{

	private double x2;
	private double y2;
	
	public Line(double x, double y, double x2, double y2, Color color)
	{
		super(x, y, color);
	}
	
	public double getX2()
	{
		return x2;
	}
	
	public double getY2()
	{
		return y2;
	}
	
	@Override
	public void paint(Graphics g)
	{
		
	}
}
