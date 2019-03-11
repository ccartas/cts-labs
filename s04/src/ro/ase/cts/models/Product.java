package ro.ase.cts.models;

import ro.ase.java.exception.NegativePriceException;

public class Product {
	private String productName;
	private double price;
	
	public Product() {
		
	}
	
	public Product(String name, double price) {
		this.productName = name;
		this.price = price;
	}
	
	public void setProductName(String name) {
		this.productName = name;
	}
	
	public void setProductPrice(double price) throws NegativePriceException {
		if(price < 0)
			throw new NegativePriceException("Pretul setat este negativ!");
		this.price = price;
	}
	
	public String getProductName() {
		return this.productName;
	}
	public double getProductPrice() {
		return this.price;
	}
}
