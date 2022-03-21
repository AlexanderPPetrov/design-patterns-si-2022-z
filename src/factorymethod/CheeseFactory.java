package factorymethod;

public class CheeseFactory extends FarmFactory {

	@Override
	public FarmProduct createProduct(String productName) {
		if(productName == "COW_CHEESE") {
			return new CowCheese();
		}
		if(productName == "GOAT_CHEESE") {
			return new GoatCheese();
		}
		System.out.println("Unknown cheese product");
		return null;
	}

}
