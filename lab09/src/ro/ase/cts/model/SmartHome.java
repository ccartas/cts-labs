package ro.ase.cts.model;

import ro.ase.cts.services.SmartAirConditioningService;
import ro.ase.cts.services.SmartDoorService;
import ro.ase.cts.services.SmartWindowService;

public class SmartHome {
	private String address;
	private SmartAirConditioningService smartAirService;
	private SmartDoorService smartDoorService;
	private SmartWindowService smartWindowService;
	
	
	public SmartHome(String address) {
		this.address = address;
		this.smartAirService = new SmartAirConditioningService();
		this.smartDoorService = new SmartDoorService();
		this.smartWindowService = new SmartWindowService();
	}
	
	public void setTemperature(float temperature) {
		this.smartAirService.setTeperature(temperature);
	}
	
	public void startAirService() {
		this.smartAirService.action();
	}
	
	public void setIsKnownFace(boolean isKnownFace) {
		this.smartDoorService.setIsKnownFace(isKnownFace);
	}
	
	public void openDoor() {
		this.smartDoorService.action();
	}
	
	public void setIsSunnyDay(boolean isSunnyDay) {
		this.smartWindowService.setIsSunnyDay(isSunnyDay);
	}
	
	public void openWindows() {
		this.smartWindowService.action();
	}
	
	
}
