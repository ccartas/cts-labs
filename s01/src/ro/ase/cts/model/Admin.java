package ro.ase.cts.model;

public class Admin extends User {
	private String companyName;
	
	public Admin() {
		super();
	}
	
	public Admin(String fullName, String email, String password, String companyName) {
		super(fullName, email, password, false);
		this.companyName = companyName;
	}
	
	public void setCompanyName(String company) {
		this.companyName = company;
	}
	public String getCompanyName() {
		return this.companyName;
	}
}
