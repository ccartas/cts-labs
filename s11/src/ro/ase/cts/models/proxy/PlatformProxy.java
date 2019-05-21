package ro.ase.cts.models.proxy;

import java.util.ArrayList;
import java.util.List;



public class PlatformProxy implements Platform{
	private List<Platform> platforms = new ArrayList<>();
	private int port;
	
	public PlatformProxy(int port) {
		this.port = port;
		System.out.println("Started proxy on port: "+port);
	}

	@Override
	public void connect(String device) {
		// TODO Auto-generated method stub
		switch(device) {
		case "PC":
			platforms.get(0).connect(device);
			break;
		case "MOBILE":
			platforms.get(1).connect(device);
			break;
		default:
			System.out.println("Platfrom not supported");
		}
	}
	
	public void add(Platform p) {
		this.platforms.add(p);
	}
	
	
	
}
