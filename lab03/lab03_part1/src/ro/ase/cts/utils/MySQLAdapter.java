package ro.ase.cts.utils;

import java.util.HashMap;
import java.util.Map;

public class MySQLAdapter {
	
	private Map<String, Integer> stocks;
	
	public MySQLAdapter() {
		this.stocks = new HashMap<String, Integer>();
	}
	
	public void update(String productName, int quantity) {
		this.stocks.put(productName, quantity);
	}
}
