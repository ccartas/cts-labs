package ro.ase.cts.models;

public class Decaf extends ToppingDecorator {
	private Coffee coffee;
	
	public Decaf(Coffee coffee) {
		this.coffee = coffee;
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "Decaf,"+this.coffee.getDescription();
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return this.coffee.getPrice()+2;
	}

}
