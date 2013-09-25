
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

/**
 * BouncePanel represents a canvas (drawing area) for objects of type Ball. A
 * timer-object periodically updates the canvas (in the run method), by moving
 * and repainting the objects.
 */

public class BouncePanel extends JPanel implements ActionListener,
MouseMotionListener {

	private int width = 270, height = 360;
	private Rectangle pad; // The to bounce of the ball
	private Timer timer;

	private static Color[] color = 
		{Color.blue, Color.cyan, Color.darkGray, Color.green, Color.magenta, Color.orange, Color.pink, Color.red, Color.yellow};	

	public BouncePanel() {
		this.setPreferredSize(new Dimension(width, height));
		this.setBackground(Color.lightGray);
		/*
		Random rand = new Random();
		theBall = new Ball[3];

		for(int i = 0; i < theBall.length; i++)
		{
			int c = rand.nextInt(color.length);
			double x = rand.nextDouble()+1;
			double y = rand.nextDouble()+1;
			theBall[i] = new Ball(0, 0, 5, color[c]);
			theBall[i].setVelocity(x, -y);	// Hastighet
		}*/

		// Create the pad
		pad = new Rectangle(width / 2, height - 40, 40, 5);

		// Initialize event handling (mouse motion)
		this.addMouseMotionListener(this);
	}

	public void startAnimation() {
		// Create, and start, the timer-object responsible for the animation
		timer = new Timer(10, this); // Signal every 10 milliseconds
									// (actionPerformed is called)
		timer.start();
	}

/**
* Update the position of the ball and repaint. This method is called each
* time the Timer produces an event.
*/

	public void actionPerformed(ActionEvent event) {
		/*for(int i = 0; i < theBall.length; i++)
		{
			// Is the ball outside the panel?
			constrainBall(theBall[i]);
			// Move the ball
			theBall[i].move();
			// Check ball against the pad
			checkForCollisionWithPad(theBall[i]);
			// Draw the ball (request to call paintComponent(g))
			repaint();
			
			if(pad.y+10 < theBall[i].getY())
			{
				timer.stop();
				JOptionPane.showMessageDialog(this, "End of Game!");
			}
		}*/
		
	
	}

/**
* Define what to draw. Called by repaint().
*/
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		// The pad
		g.setColor(Color.black);
		g.fillRect(pad.x, pad.y, pad.width, pad.height);

		// The ball
		/*
		for(int i = 0; i < theBall.length; i++)
		{
			theBall[i].paint(g);
		}*/
	}

/**
* Called when the mouse is dragged (left button down)
*/
	public void mouseDragged(MouseEvent e) {
		Point point = e.getPoint();

		// Keep the pad inside the panel
		if (point.x < 0) {
			pad.x = 0;
		} else if (point.x > this.getWidth() - pad.width) {
			pad.x = this.getWidth() - pad.width;
		} else {
			pad.x = point.x;
		}
	}

	public void mouseMoved(MouseEvent e) {
		// Do nothing
	}

/**
* Check if the ball collides with the pads upper edge. If so, bounce the
* ball vertically.
*/
	//TA IN ANDRA OBJEKT HÄR! INTE BALL!
	/*
	private void checkForCollisionWithPad(Ball ball) {
		double radius = ball.getRadius();
		double x1 = ball.getX(), y1 = ball.getY();
		double dx = ball.getDx(), dy = ball.getDy();
		double y2 = y1 + ball.getDy();
		// Does the line between the current and the next position of the ball
		// intersect the upper edge of the pad? If so - bounce off.
		if ((y1 + radius <= pad.y && y2 + radius >= pad.y)
				|| (y2 - radius <= pad.y && y1 - radius >= pad.y)) {
			double intersectX = x1 - dx * (y1 - pad.y) / dy;
			if (intersectX >= pad.x && intersectX <= pad.x + pad.width) {
				ball.setVelocity(dx, -dy);
			}
		}

		
	}
	*/

/**
* Keep the ball inside the panel/canvas
*/
	//TA IN ANDRA OBJEKT HÄR! INTE BALL!
	/*
	private void constrainBall(Ball ball) {
		double x = ball.getX(), y = ball.getY();
		double dx = ball.getDx(), dy = ball.getDy();
		double radius = ball.getRadius();

		// If outside the box - calculate new dx and dy
		if (x < radius)
			dx = Math.abs(dx);
		else if (x > width - radius)
			dx = -Math.abs(dx);
		if (y < radius)
			dy = Math.abs(dy);
		else if (y > height - radius)
			dy = -Math.abs(dy);

		ball.setVelocity(dx, dy);
	}
	*/

	private static final long serialVersionUID = 1L;
}