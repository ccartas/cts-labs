package ro.ase.cts.model;

import ro.ase.cts.services.SmartAirConditioningService;
import ro.ase.cts.services.SmartDoorService;
import ro.ase.cts.services.SmartWindowService;
import ro.ase.cts.utils.SmartHomeFacade;

public class SmartHome {
	private String address;
	private SmartHomeFacade facade;
	
	
	public SmartHome(String address, SmartHomeFacade facade) {
		this.address = address;
		this.facade = facade;
	}
	
	
	public void openDoor() {
		this.facade.openDoor();
	}
	public void openWindow() {
		this.facade.openWindows();
	}
	public void openAirConditioning() {
		this.facade.openAirConditioning();
	}
	
	public void startSystems() {
		this.facade.startSmartSystems();
	}
}
