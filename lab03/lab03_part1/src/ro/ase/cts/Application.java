package ro.ase.cts;

import ro.ase.cts.models.Product;

public class Application {
	public static void main(String[] args) {
		Product p1 = new Product(1, "Iphone 11 Pro", "SMARTPHONE", 2019, 5000);
		Product p2 = new Product(2, "Samsung S20 Ultra", "SMARTPHONE", 2020, 5500);
		p1.getBuyBackValueForSmartphone();
	}
}
