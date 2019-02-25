package ro.ase.cts.model;

public abstract class User {
	private String fullName;
	private String email;
	private String password;
	private boolean isLoggedIn;
	
	public User() {
		
	}
	
	public User(String fullName, String email, String password, boolean isLoggedIn) {
		this.fullName = fullName;
		this.email = email;
		this.password = password;
		this.isLoggedIn = isLoggedIn;
	}
	
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setIsLoggedIn(boolean flag) {
		this.isLoggedIn = flag;
	}
	
	public String getFullName() {
		return this.fullName;
	}
	public String getEmail() {
		return this.email;
	}
	public String getPassword() {
		return this.password;
	}
	public boolean isLoggedIn() {
		return this.isLoggedIn;
	}
}
