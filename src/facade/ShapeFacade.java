package facade;

public class ShapeFacade {

	private Shape circle;
	private Shape rectangle;
	private Shape triangle;
	
	
	public ShapeFacade() {
		this.circle = new Circle();
		this.rectangle = new Rectangle();
		this.triangle = new Triangle();
	}

	public void drawCircle() {
		// Super complex initialization
		// Some code
		// Some more code
		this.circle.draw();
	}
	public void drawRectangle() {
		// Super complex initialization
		// Some code
		// Some more code
		this.rectangle.draw();
	}
	public void drawTriangle() {
		// Super complex initialization
		// Some code
		// Some more code
		this.triangle.draw();
	}
	
}
