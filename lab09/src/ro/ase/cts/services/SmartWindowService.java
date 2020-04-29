package ro.ase.cts.services;

import ro.ase.cts.interfaces.SmartService;

public class SmartWindowService implements SmartService {
	private boolean isSunnyDay;
	
	public void setIsSunnyDay(boolean isSunnyDay) {
		this.isSunnyDay = isSunnyDay;
	}
	
	public void action() {
		if(this.isSunnyDay) {
			System.out.println("Windows are opening");
		} else {
			System.out.println("The weather doesn't look so good.");
		}
	}
}
