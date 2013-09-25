
public abstract class FillableShape extends Shape {
	
	private boolean filled;
	
	public FillableShape()
	{
		
	}
	
	public boolean getFilled()
	{
		return filled;
	}
	
	public void setFilled(boolean filled)
	{
		this.filled = filled;
	}
}
