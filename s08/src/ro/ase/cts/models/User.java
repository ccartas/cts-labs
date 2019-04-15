package ro.ase.cts.models;

import ro.ase.cts.helpers.UserBuilder;

public class User {
	
	private String completeName;
	private String email;
	private String password;
	private String city;
	private String address;
	private String telephone;
	private boolean accountConfirmed;
	private boolean addedPaymentMethod;
	
	public User() {
		
	}

	public String getCompleteName() {
		return completeName;
	}

	public void setCompleteName(String completeName) {
		this.completeName = completeName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public boolean isAccountConfirmed() {
		return accountConfirmed;
	}

	public void setAccountConfirmed(boolean accountConfirmed) {
		this.accountConfirmed = accountConfirmed;
	}

	public boolean isAddedPaymentMethod() {
		return addedPaymentMethod;
	}

	public void setAddedPaymentMethod(boolean addedPaymentMethod) {
		this.addedPaymentMethod = addedPaymentMethod;
	}
	
	
}
