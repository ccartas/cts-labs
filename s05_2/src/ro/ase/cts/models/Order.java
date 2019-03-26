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
	
	public void removeProducts() {
		this.products.clear();
	}
	
	public List<Coffee> getOrderProducts(){
		return this.products;
	}
	
	public double getTotalPrice() {
		double totalPrice = 0;
		for(Coffee c : products) {
			totalPrice +=c.getPrice();
		}
		return totalPrice;
	}
	
	public String printOrder() {
		StringBuilder builder = new StringBuilder();
		for(Coffee c : this.products) {
			builder.append(c.getBeverageName() + " " + c.getCoffeeType() + " " + c.getPrice() + "\n");
		}
		builder.append("TOTAL: " + this.getTotalPrice());
		return builder.toString();
	}
}
