import java.awt.Color;
import java.awt.Graphics;

<<<<<<< HEAD
=======

>>>>>>> 7a7d9d7a1f2bda7fbf81ea571efb9eeb1838f4e3

public class Line extends Shape{

	private double x;
	private double y;
	private double x2;
	private double y2;
	private Color lineColor;
	
	public Line(double x, double y, double x2, double y2, Color color)
	{
		super(x, y, color);
		this.x2 = x2;
		this.y2 = y2;
		this.lineColor = color;
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
		g.setColor(lineColor);
		g.fillRect((int)x, (int)y, (int)x2,(int) y2);
	}
}
