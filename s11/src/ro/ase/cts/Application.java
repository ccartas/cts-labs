package ro.ase.cts;

import java.util.ArrayList;
import java.util.List;

import ro.ase.cts.exception.UnsupportedPlayerException;
import ro.ase.cts.models.flyweight.FlyweightFactory;
import ro.ase.cts.models.flyweight.GamePlayer;
import ro.ase.cts.models.proxy.MobileGameServer;
import ro.ase.cts.models.proxy.PCGameServer;
import ro.ase.cts.models.proxy.PlatformProxy;
import ro.ase.cts.utils.GameHelper;

public class Application {
	public static void main(String[] args) {
		List<GamePlayer> pls = new ArrayList<GamePlayer>(); 
		for(int i = 0 ;i < 100 ; i++) {
			try {
				GamePlayer p = FlyweightFactory.getBot(GameHelper.getRandomPlayerType());
				p.pickupWeapon(GameHelper.assignRandomWeapon());
				
				pls.add(p);
			} catch (UnsupportedPlayerException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		for(GamePlayer p : pls) {
			System.out.println(p);
		}
		
		MobileGameServer mobileServer = new MobileGameServer(8090);
		PCGameServer pcServer = new PCGameServer(8091);
		PlatformProxy proxy = new PlatformProxy(8099);
		proxy.add(mobileServer);
		proxy.add(pcServer);
		
		proxy.connect("MOBILE");
	}
}
