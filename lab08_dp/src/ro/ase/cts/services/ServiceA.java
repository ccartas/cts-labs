package ro.ase.cts.services;

import ro.ase.cts.interfaces.HttpInterface;
import ro.ase.cts.utils.ServerCache;

public class ServiceA implements HttpInterface {
	
	private ServerCache serverCache;
	
	public ServiceA() {
		this.serverCache = ServerCache.getInstance();
	}
	
	@Override
	public void call(String url) {
		// TODO Auto-generated method stub
		System.out.println(String.format("Called %s", url));
		this.serverCache.set("serviceA", url);
	}

}
