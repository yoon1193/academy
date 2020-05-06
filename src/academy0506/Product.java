package academy0506;

public class Product {
	public Product() {}
	public double price = 1000;
	public double tax = 0.1;
	public double getPrice() {
		return price*(1-tax);
	}

}
