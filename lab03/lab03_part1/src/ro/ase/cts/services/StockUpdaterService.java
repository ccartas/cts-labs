package ro.ase.cts.services;

import ro.ase.cts.utils.MySQLAdapter;

public class StockUpdaterService {
	private final MySQLAdapter datasource;
	
	public StockUpdaterService(MySQLAdapter datasource) {
		this.datasource = datasource;
	}
	
	public void update(String productName, int quantity) {
		this.datasource.update(productName, quantity);
	}
}
