package ro.ase.cts.controller;

import java.util.Optional;

import ro.ase.cts.MockDB;
import ro.ase.cts.exceptions.InvalidCredentialsException;
import ro.ase.cts.model.User;
import ro.ase.cts.service.UserService;

public class UserController implements UserService{
	public User loggedUser;
	
	public UserController() {
		
	}

	@Override
	public void authenthicate(String username, String password) throws InvalidCredentialsException {
		Optional<User> userOptional = MockDB.users.stream()
											.filter(user -> user.getEmail().equals(username) && user.getPassword().equals(password))
											.findFirst();
		if(userOptional.isPresent()) {
			this.loggedUser = userOptional.get();
			System.out.println("User logged in successfully");
		} else {
			throw new InvalidCredentialsException("Provided credentials are incorrect");
		}		
	}
	
	public String getLoggedUserType() {
		if(this.loggedUser != null) {
			return this.loggedUser.getClass().toString();	
		} else {
			return "USER NOT LOGGED IN";
		}
		
	}
}
