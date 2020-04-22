package ro.ase.cts.models;

public class User {
	private String username;
	private String password;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private int yearOfBirth;
	private String gender;
	private boolean isProfileCompleted;
	
	public User(String username,
			String password,
			String firstName,
			String lastName,
			String phoneNumber,
			int yearOfBirth,
			String gender,
			boolean isProfileCompleted) {
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.yearOfBirth = yearOfBirth;
		this.gender = gender;
		this.isProfileCompleted = isProfileCompleted;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getYearOfBirth() {
		return yearOfBirth;
	}

	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public boolean isProfileCompleted() {
		return isProfileCompleted;
	}

	public void setProfileCompleted(boolean isProfileCompleted) {
		this.isProfileCompleted = isProfileCompleted;
	}
	
	
	
	
}
