package facade;

public class ShapeMaker {

	private Shape Circle;
	private Shape Rectangle;
	private Shape Square;
	
	public ShapeMaker()
	{
		Circle = new Circle();
		Rectangle = new Rectangle();
		Square = new Sqaure();
		
	}
	
	public void drawCircle()
	{
		Circle.draw();
		
	}
	public void drawRectangle()
	{
		Rectangle.draw();
		
	}
	public void drawSquare()
	{
		Square.draw();
		
	}
	
}
