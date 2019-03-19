package ro.ase.cts.models;

public class Coffee {
	private String beverageName;
	private CoffeeType type;
	private double price;
	
	public Coffee() {
		
	}
	
	public Coffee(String beverageName, CoffeeType type, double price) {
		this.beverageName = beverageName;
		this.type = type;
		this.price = price;
	}
	
	public void setBeverageName(String name) {
		this.beverageName = name;
	}
	public void setCoffeeType(CoffeeType type) {
		this.type = type;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String getBeverageName() {
		return this.beverageName;
	}
	public CoffeeType getCoffeeType() {
		return this.type;
	}
	public double getPrice() {
		return this.price;
	}
}
