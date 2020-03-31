package ro.ase.cts.models;

public class Product {
	private String productName;
	private double price;
	
	public Product(String productName, double price) {
		this.productName = productName;
		this.price = price;
	}
	
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String getProductName() {
		return this.productName;
	}
	public double getPrice() {
		return this.price;
	}
}
