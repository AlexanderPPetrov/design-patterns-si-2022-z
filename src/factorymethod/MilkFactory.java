package factorymethod;

public class MilkFactory extends FarmFactory {

	@Override
	public FarmProduct createProduct(String productName) {
		if(productName == "COW_MILK") {
			return new CowMilk();
		}
		if(productName == "GOAT_MILK") {
			return new GoatMilk();
		}
		System.out.println("Unknown milk product");
		return null;
	}

}
