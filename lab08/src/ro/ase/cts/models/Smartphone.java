package ro.ase.cts.models;

import ro.ase.cts.interfaces.Sellable;

public class Smartphone implements Sellable {
	
	private double price;
	
	public Smartphone(double price) {
		this.price = price;
	}
	
	@Override
	public void sell() {
		// TODO Auto-generated method stub
		System.out.println(String.format("Smartphone sold %f", price));
	}
	
	
}
