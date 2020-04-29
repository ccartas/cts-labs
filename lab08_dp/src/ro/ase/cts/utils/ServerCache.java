package ro.ase.cts.utils;

import java.util.HashMap;
import java.util.Map;

public class ServerCache {
	private static ServerCache singleton;
	private Map<String, String> cache;
	
	private ServerCache() {
		this.cache = new HashMap<String, String>();
	}
	
	public void set(String key, String value) {
		this.cache.put(key, value);
	}
	
	public String get(String key) {
		return this.cache.get(key);
	}
	
	public static ServerCache getInstance() {
		if(singleton == null) {
			singleton = new ServerCache();
		}
		return singleton;
	}
}
