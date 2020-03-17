package ro.ase.cts.utils;

import java.util.List;

import ro.ase.cts.models.Product;

public class ProductUtils {
	public static void displayMaxDiscountForCategory(List<Product> products) {
		for(Product p : products) {
			p.getMaxDiscount();
		}
	}
}
