package ro.ase.cts.models;

import java.util.ArrayList;
import java.util.List;

public class Order {
	private List<Coffee> products;
	private double orderValue;
	private boolean applyDiscount;
	
	public Order() {
		this.products = new ArrayList<Coffee>();
	}
	
	public void addProduct(Coffee c) {
		this.products.add(c);
	}
	
	public void removeProduct(Coffee c) {
		this.products.remove(c);
	}
}
