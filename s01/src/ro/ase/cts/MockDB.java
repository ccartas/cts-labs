package ro.ase.cts;

import java.util.ArrayList;
import java.util.List;

import ro.ase.cts.model.Admin;
import ro.ase.cts.model.Supplier;
import ro.ase.cts.model.User;

public class MockDB {
	
	public static List<User> users;
	
	static {
		users = new ArrayList<User>();
		users.add(new Supplier("John Doe", "john.doe@email.com", "P@ssw0rd", 2000));
		users.add(new Admin("Administratorul", "admin@email.com", "@dmin", "Random Company"));
	}
}
