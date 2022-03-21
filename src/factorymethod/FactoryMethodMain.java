package factorymethod;

public class FactoryMethodMain {

	public static void main(String[] args) {
		
		FarmFactory cheeseFactory = new CheeseFactory();
	
		FarmProduct cheese = cheeseFactory.produceProduct("COW_CHEESE");
		
		FarmFactory milkFactory = new MilkFactory();
		FarmProduct milk = milkFactory.produceProduct("GOAT_MILK");
		
	}

}
