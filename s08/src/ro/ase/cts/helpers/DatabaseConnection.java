package ro.ase.cts.helpers;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import ro.ase.cts.exception.DatabaseException;
import ro.ase.cts.models.User;

public class DatabaseConnection {
	
	
	private static DatabaseConnection dbInstance ;//= new DatabaseConnection();
	private List<User> users;
	public boolean isConnectionOpen;
	
	
	private DatabaseConnection() {
		this.users = new ArrayList<User>();
	}
	
	
	public static DatabaseConnection getInstance() {
		if(dbInstance == null)
			dbInstance = new DatabaseConnection();
		return dbInstance;
	}
	
	public void openConnection() throws DatabaseException {
		if(this.isConnectionOpen)
			throw new DatabaseException("Connection already open");
		this.isConnectionOpen = true;
	}
	
	public void closeConnection() throws DatabaseException {
		if(!this.isConnectionOpen)
			throw new DatabaseException("Connection already closed");
		this.isConnectionOpen = false;
	}
	
	public void addUser(User u) throws DatabaseException{
		if(this.isConnectionOpen)
			this.users.add(u);
		else
			throw new DatabaseException("Database connection is not opened");
	}
	
	public List<User> getUsers(){
		return this.users;
	}
	
}
