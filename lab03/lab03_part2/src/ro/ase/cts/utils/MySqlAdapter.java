package ro.ase.cts.utils;

import java.util.HashMap;
import java.util.Map;

import ro.ase.cts.interfaces.DataSource;


public class MySqlAdapter implements DataSource {
	private Map<String, Integer> stocks;
	
	public MySqlAdapter() {
		this.stocks = new HashMap<String, Integer>();
	}

	@Override
	public void update(String name, int quantity) {
		this.stocks.put(name, quantity);
	}
}
