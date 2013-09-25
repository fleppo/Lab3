import java.awt.Color;
import java.awt.Rectangle;


public abstract class Shape {
 private double x;
 private double y;
 private double dy;
 private double dx;
 private Color color;
 private Rectangle box;
 
 public Shape()
 {
	//So whats up ? 
 }
 
 public double getX()
 {
	 return x;
 }
 
 public double getY()
 {
	 return y;
 }
 
 public double getDX()
 {
	 return dx;
 }
 
 public double getDY()
 {
	 return  dy;
 }
 
 public Color getColor()
 {
	 return color;
 }
 
 public Rectangle getBoundingBox()
 {
	 return box;
 }
 
 public void setBoundingBox(Rectangle box)
 {
	 this.box = box;
 }
 
 public void move()
 {
	 
 }
 
 protected void constrain()
 {
	 
 }
 
 abstract public void paint();
}
