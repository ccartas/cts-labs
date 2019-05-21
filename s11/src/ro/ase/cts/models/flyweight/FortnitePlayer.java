package ro.ase.cts.models.flyweight;

public class FortnitePlayer implements GamePlayer{
	
	public final String SKIN;
	public String weapon;
	
	public FortnitePlayer() {
		SKIN = "Floss";
	}
	
	@Override
	public void pickupWeapon(String weapon) {
		// TODO Auto-generated method stub
		this.weapon = weapon;
	}
	
	@Override
	public String toString() {
		return "Fortnite player with skin: "+ SKIN +" and weapon: "+weapon;
	}
}
