package ro.ase.cts;

import ro.ase.cts.models.Laptop;
import ro.ase.cts.models.ShoppingCart;
import ro.ase.cts.utils.ProductUtils;

public class Application {
	public static void main(String[] args) {
		Laptop l1 = new Laptop(1, "Asus ROG", 2019, 4000);
		Laptop l2 = new Laptop(2, "Lenovo Thinkpad", 2020, 5000);
		ShoppingCart cart = new ShoppingCart();
		cart.addProductToCart(l1);
		cart.addProductToCart(l2);
		
		ProductUtils.displayMaxDiscountForCategory(cart.getProducts());
	}
}
