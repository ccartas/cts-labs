package ro.ase.cts.testing;

import ro.ase.cts.interfaces.Database;

public class DatabaseAdaptorMock implements Database{
	
	private boolean connection;
	
	public void setConnection(boolean connection) {
		this.connection = connection;
	}
	
	@Override
	public boolean connect() {
		// TODO Auto-generated method stub
		return this.connection;
	}

	@Override
	public boolean close() {
		// TODO Auto-generated method stub
		return this.connection;
	}

}
