package ro.ase.cts;

import ro.ase.cts.exception.DatabaseException;
import ro.ase.cts.helpers.DatabaseConnection;
import ro.ase.cts.helpers.UserBuilder;
import ro.ase.cts.models.User;

public class Application {

	public static void main(String[] args) {
		User u1 = new UserBuilder("John Doe", "test@test.com", "p@ss").build();
		
		DatabaseConnection conn = DatabaseConnection.getInstance();
		try {
			conn.openConnection();
			conn.addUser(u1);
			for(User u : conn.getUsers()) {
				System.out.println(u.getEmail());
			}
			conn.closeConnection();
		} catch (DatabaseException ex){
			ex.printStackTrace();
		}
		DatabaseConnection conn2 = DatabaseConnection.getInstance();
		for(User u : conn2.getUsers()) {
			System.out.println(u.getEmail());
		}
		
	}
}
