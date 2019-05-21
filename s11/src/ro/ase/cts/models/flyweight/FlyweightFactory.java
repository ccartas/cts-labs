package ro.ase.cts.models.flyweight;

import java.util.HashMap;

import ro.ase.cts.exception.UnsupportedPlayerException;

public class FlyweightFactory {
	private static HashMap<String, GamePlayer> bots = new HashMap<>();
	
	public static GamePlayer getBot(String type) throws UnsupportedPlayerException {
		if(bots.containsKey(type)) {
			return bots.get(type);
		} else {
			switch(type) {
			case "Fortnite":
				return new FortnitePlayer();
			case "CSGO":
				return new CsGoPlayer();
			default:
				throw new UnsupportedPlayerException("Player type not supported"); 
			}
			
		}
	}
}
