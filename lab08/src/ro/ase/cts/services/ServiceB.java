package ro.ase.cts.services;

import ro.ase.cts.interfaces.HttpInterface;
import ro.ase.cts.utils.ServerCache;

public class ServiceB implements HttpInterface {

	private ServerCache serverCache;
	
	public ServiceB() {
		this.serverCache = new ServerCache();
	}
	
	@Override
	public void call(String url) {
		// TODO Auto-generated method stub
		System.out.println(String.format("Called %s", url));
		this.serverCache.set("serviceB", url);
	}
	
	
}
