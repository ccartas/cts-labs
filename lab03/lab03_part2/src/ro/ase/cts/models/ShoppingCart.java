package ro.ase.cts.models;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	private List<Product> products;
	
	public ShoppingCart() {
		this.products = new ArrayList<Product>();
	}
	
	public void addProductToCart(Product product) {
		this.products.add(product);
	}
	public void removeProductFromCart(Product product) {
		this.products.removeIf(p -> p.getProductId() == product.getProductId());
	}
	
	public List<Product> getProducts() {
		return this.products;
	}
	
	public double getTotalOrderValue() {
		double total = 0;
		for(Product p : this.products) {
			total += p.getProductPrice();
		}
		return total;
	}
}
