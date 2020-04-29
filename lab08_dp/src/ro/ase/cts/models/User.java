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
	
	private User(String firstName,
			String lastName,
			String username,
			String password) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.username = username;
	}
	
	
	
	public String getUsername() {
		return username;
	}



	public String getPassword() {
		return password;
	}



	public String getFirstName() {
		return firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public String getPhoneNumber() {
		return phoneNumber;
	}



	public int getYearOfBirth() {
		return yearOfBirth;
	}



	public String getGender() {
		return gender;
	}



	public boolean isProfileCompleted() {
		return isProfileCompleted;
	}



	public static class UserBuilder {
		private User user;
		
		public UserBuilder(String firstName, String lastName, String username, String password) {
			this.user = new User(firstName, lastName, username, password);
		}
		
		public UserBuilder withPhoneNumber(String phoneNumber) {
			this.user.phoneNumber = phoneNumber;
			return this;
		}
		
		public UserBuilder withYearOfBirth(int yearOfBirth) {
			this.user.yearOfBirth = yearOfBirth;
			return this;
		}
		
		public UserBuilder withGender(String gender) {
			this.user.gender = gender;
			return this;
		}
		
		public UserBuilder withProfileCompleted(boolean isProfileCompleted) {
			this.user.isProfileCompleted = isProfileCompleted;
			return this;
		}
		
		public User build() {
			return this.user;
		}
	}
}
