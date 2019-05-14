package ro.ase.cts.models;

public class SourCream extends ToppingDecorator	{
	private Coffee coffee;
	
	public SourCream(Coffee coffee) {
		this.coffee = coffee;
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return this.coffee.getDescription()+" with sour cream.";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return this.coffee.getPrice()+1;
	}

}
