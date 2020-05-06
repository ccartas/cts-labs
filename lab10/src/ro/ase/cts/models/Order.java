package ro.ase.cts.models;

public class Order {
	private String client;
	private String billingAddress;
	private String deliveryAddress;
	private double amount;
	
	
	public Order(String client, String billingAddress, String deliveryAddress, double amount) {
		this.client = client;
		this.billingAddress = billingAddress;
		this.deliveryAddress = deliveryAddress;
		this.amount = amount;
	}
}
