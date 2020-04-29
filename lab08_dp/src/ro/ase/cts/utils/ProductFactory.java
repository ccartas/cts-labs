package ro.ase.cts.utils;

import ro.ase.cts.interfaces.Sellable;
import ro.ase.cts.models.Laptop;
import ro.ase.cts.models.Smartphone;

public class ProductFactory {

	public Sellable getProduct(ProductType type, double price) {
		Sellable sellable = null;
		switch(type) {
			case LAPTOP:
				sellable = new Laptop(price);
				break;
			case SMARTPHONE:
				sellable = new Smartphone(price);
				break;
		}
		return sellable;
	}
}
