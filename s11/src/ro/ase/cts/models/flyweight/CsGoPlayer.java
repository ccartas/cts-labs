package ro.ase.cts.models.flyweight;

public class CsGoPlayer implements GamePlayer{
	private final String SKIN;
	private String weapon;
	
	public CsGoPlayer() {
		SKIN = "Terrorist";
	}
	
	@Override
	public void pickupWeapon(String weapon) {
		// TODO Auto-generated method stub
		this.weapon = weapon;
	}
	
	@Override
	public String toString() {
		return "CSGO player with skin: "+ SKIN +" and weapon: "+weapon;
	}
}
