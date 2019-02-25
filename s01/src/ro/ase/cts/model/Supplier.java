package ro.ase.cts.model;

public class Supplier extends User{
	
	private double ballance;
	
	public Supplier() {
		super();
	}
	
	public Supplier(String fullName, String email, String password, double ballance) {
		super(fullName, email, password, false);
		this.ballance = ballance;
	}
	
	public void setBallance(double amount) {
		this.ballance = amount;
	}
	public double getBallance() {
		return this.ballance;
	}
}
