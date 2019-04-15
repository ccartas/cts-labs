package ro.ase.cts.helpers;

import ro.ase.cts.models.User;

public class UserBuilder implements GenericBuilder<User> {

	private String completeName;
	private String email;
	private String password;
	private String city;
	private String address;
	private String telephone;
	private boolean accountConfirmed;
	private boolean addedPaymentMethod;
	
	public UserBuilder(String name, String email, String password) {
		this.completeName = name;
		this.email = email;
		this.password = password;
	}
	
	public  UserBuilder withOptionalCity(String city) {
		this.city = city;
		return this;
	}
	
	public UserBuilder withOptionalAddress(String address) {
		this.address = address;
		return this;
	}
	
	public UserBuilder withOptionalTelephone(String telephone) {
		this.telephone = telephone;
		return this;
	}
	
	public UserBuilder withAccountConfirmed(boolean confirmed) {
		this.accountConfirmed = confirmed;
		return this;
	}
	
	public UserBuilder withAddedPaymentMethod(boolean paymentMethod) {
		this.addedPaymentMethod = paymentMethod;
		return this;
	}
	
	public User build() {
		User user = new User();
		user.setCompleteName(this.completeName);
		user.setEmail(this.email);
		user.setPassword(this.password);
		user.setCity(this.city);
		user.setAddress(this.address);
		user.setTelephone(this.telephone);
		user.setAddedPaymentMethod(this.addedPaymentMethod);
		user.setAccountConfirmed(this.accountConfirmed);
		return user;
	}
}
