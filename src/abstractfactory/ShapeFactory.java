package abstractfactory;

public class ShapeFactory extends AbstractFactory {

	@Override
	Color getColor(String colorName) {
		// Shape factory... cannot return color
		return null;
	}

	@Override
	Shape getShape(String shapeName) {
		if(shapeName.equals("CIRCLE")) {
			return new Circle();
		}
		
		if(shapeName.equals("RECTANGLE")) {
			return new Rectangle();
		}
		System.out.println("Unknown shape");
		return null;
	}

}
