package ro.ase.cts.utils;

import java.util.Random;

public class GameHelper {
	
	public static String getRandomPlayerType() {
		String[] playerTypes = new String[] {"CSGO", "Fortnite"};
		Random rand = new Random();
		return playerTypes[rand.nextInt(playerTypes.length)];
	}
	
	public static String assignRandomWeapon() {
		String[] weapons = new String[]{"Bazooka", "AK47", "M4A1", "Knife"};
		Random rand = new Random();
		return weapons[rand.nextInt(weapons.length)];
	}
}
