package ro.ase.cts.models;

import ro.ase.cts.interfaces.Upgradeable;

public class Product implements Upgradeable{
	private final int PRODUCT_ID;
	private String productName;
	private int activationYear;
	private double price;
	
	public Product(int productId) {
		this.PRODUCT_ID = productId;
	}
	
	public Product(int productId, String productName, int activationYear, double price) {
		this.PRODUCT_ID = productId;
		this.productName = productName;
		this.activationYear = activationYear;
		this.price = price;
	}
	
	public int getProductId() {
		return this.PRODUCT_ID;
	}
	
	public String getProductName() { 
		return this.productName;
	}
	
	public double getProductPrice() {
		return this.price;
	}
	public int getActivationYear() {
		return this.activationYear;
	}
	
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public void setActivationYear(int year) {
		this.activationYear = year;
	}
	public void setProductPrice(double price) {
		this.price = price;
	}
	
	public void getMaxDiscount() {
		System.out.println("Maximum discount for a normal product is 10%");
	}

	@Override
	public double getBuyBackValue() {
		// TODO Auto-generated method stub
		return this.getProductPrice() * 0.2;
	}
}
