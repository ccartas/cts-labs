package ro.ase.cts.services;

import ro.ase.cts.interfaces.DataSource;

public class StockUpdaterService {
	private final DataSource source;
	
	public StockUpdaterService(DataSource source) {
		this.source = source;
	}
	
	public void update(String productName, int quantity) {
		this.source.update(productName, quantity);
	}
}
