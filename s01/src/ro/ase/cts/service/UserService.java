package ro.ase.cts.service;

import ro.ase.cts.exceptions.InvalidCredentialsException;

public interface UserService {
	void authenthicate(String username, String password) throws InvalidCredentialsException;
}
