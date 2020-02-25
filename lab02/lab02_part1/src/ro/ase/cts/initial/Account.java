package ro.ase.cts.initial;

public class Account {
	private String id;
	private String name;
	private String bank;
	private double total;
	
	public Account() {
		
	}
	
	public Account(String id, String name, String bank, double total) {
		this.id = id;
		this.name = name;
		this.bank = bank;
		this.total = total;
	}
	
	public double getTotal() {
		return this.total;
	}
	public void setTotal(double v) {
		this.total = v;
	}
}
