package ro.ase.cts.models;

import java.util.HashMap;
import java.util.Map;

public class HttpHeaders {
	private Map<String, String> headers;
	
	public HttpHeaders() {
		this.headers = new HashMap<String, String>();
	}
	
	public void set(String key, String value) {
		this.headers.put(key, value);
	}
	
	public String get(String key) {
		return this.headers.get(key);
	}
}
