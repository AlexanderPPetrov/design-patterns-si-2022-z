package abstractfactory;

public class ColorFactory extends AbstractFactory {

	@Override
	Color getColor(String colorName) {
		if(colorName.equals("BLUE")) {
			return new Blue();
		}
		
		if(colorName == "GREEN") {
			return new Green();
		}
		System.out.println("Unknown color");
		return null;
	}

	@Override
	Shape getShape(String shapeName) {
		// Color factory... cannot return shape
		return null;
	}

}
