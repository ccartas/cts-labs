package ro.ase.cts.models;

import ro.ase.cts.interfaces.Sellable;

public class Laptop implements Sellable {
	
	private double price;
	
	public Laptop(double price) {
		this.price = price;
	}
	
	@Override
	public void sell() {
		// TODO Auto-generated method stub
		System.out.println(String.format("Laptop sold %f", price));
	}

}
