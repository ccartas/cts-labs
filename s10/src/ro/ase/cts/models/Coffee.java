package ro.ase.cts.models;

public abstract class Coffee {
	private String description;
	
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public abstract double getPrice();
}
