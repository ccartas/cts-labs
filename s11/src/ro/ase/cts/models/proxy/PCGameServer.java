package ro.ase.cts.models.proxy;

public class PCGameServer implements Platform{
	
	private int port;
	
	public PCGameServer(int port) {
		this.port = port;
		System.out.println("PC GAME SERVER STARTED ON PORT: "+port);
	}
	
	@Override
	public void connect(String device) {
		// TODO Auto-generated method stub
		System.out.println("Connected to PC GAME SERVER on port: "+port);
	}

}
