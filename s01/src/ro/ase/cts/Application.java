package ro.ase.cts;

import ro.ase.cts.controller.UserController;
import ro.ase.cts.exceptions.InvalidCredentialsException;

public class Application {

	public static void main(String[] args) {
		UserController controller = new UserController();
		try {
			System.out.println(controller.getLoggedUserType());
			controller.authenthicate("admin@email.com", "@dmin");
			System.out.println(controller.getLoggedUserType());
		} catch (InvalidCredentialsException ex) {
			System.out.println(ex.getMessage());
		}
		
	}
}
