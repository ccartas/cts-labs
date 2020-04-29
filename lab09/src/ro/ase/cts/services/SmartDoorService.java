package ro.ase.cts.services;

import ro.ase.cts.interfaces.SmartService;

public class SmartDoorService implements SmartService{
	private boolean isKnownFace;
	
	
	public void setIsKnownFace(boolean isKnownFace) {
		this.isKnownFace = isKnownFace;
	}

	@Override
	public void action() {
		// TODO Auto-generated method stub
		if(this.isKnownFace) {
			System.out.println("Door is unlocking");
		} else {
			System.out.println("Unknown face! Please try again.");
		}
	}
}
