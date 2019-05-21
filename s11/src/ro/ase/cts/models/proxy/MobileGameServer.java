package ro.ase.cts.models.proxy;

public class MobileGameServer implements Platform{
	private int port;
	
	public MobileGameServer(int port) {
		this.port = port;
		System.out.println("Mobile Game Server started on port: "+port);
	}
	
	@Override
	public void connect(String device) {
		// TODO Auto-generated method stub
		System.out.println("Connected to mobile game server on port: "+port);
	}
	

}
