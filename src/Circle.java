import java.awt.Color;
import java.awt.Graphics;


public class Circle extends FillableShape{

	private double diameter;
	private double radius;
	private Color color;
	double x, y;
	
	public Circle(double x, double y, Color color)
	{
		super(x, y, color);
		this.color = color;
		this.x = x;
		this.y = y;
	}
	
	public double getDiameter(){
		return diameter;
	}
	
	public void paint(Graphics g)
	{
		g.setColor(color);
		g.fillOval((int) (x - radius), (int) (y - radius), (int) (2 * radius),
				(int) (2 * radius));
	}
}
