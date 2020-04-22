package ro.ase.cts.utils;

import java.util.HashMap;
import java.util.Map;

public class ServerCache {
	private Map<String, String> cache;
	
	public ServerCache() {
		this.cache = new HashMap<String, String>();
	}
	
	public void set(String key, String value) {
		this.cache.put(key, value);
	}
	
	public String get(String key) {
		return this.cache.get(key);
	}
}
