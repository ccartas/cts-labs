package ro.ase.cts.utils;

import ro.ase.cts.services.SmartAirConditioningService;
import ro.ase.cts.services.SmartDoorService;
import ro.ase.cts.services.SmartWindowService;

public class SmartHomeFacade {
	private SmartAirConditioningService smartAirConditioning;
	private SmartDoorService smartDoor;
	private SmartWindowService smartWindow;
	
	public SmartHomeFacade() {
		this.smartAirConditioning = new SmartAirConditioningService();
		this.smartDoor = new SmartDoorService();
		this.smartWindow = new SmartWindowService();
	}
	
	public void setTemperature(float temperature) {
		this.smartAirConditioning.setTeperature(temperature);
	}
	public void setIsKnownFace(boolean isKnownFace) {
		this.smartDoor.setIsKnownFace(isKnownFace);
	}
	public void setIsSunnyDay(boolean isSunnyDay) {
		this.smartWindow.setIsSunnyDay(isSunnyDay);
	}
	
	public void openAirConditioning() {
		this.smartAirConditioning.action();
	}
	public void openDoor() {
		this.smartDoor.action();
	}
	public void openWindows() {
		this.smartWindow.action();
	}
	
	public void openDoorAndWindows() {
		this.smartDoor.action();
		this.smartWindow.action();
	}
	
	public void startSmartSystems() {
		this.smartAirConditioning.action();
		this.smartDoor.action();
		this.smartWindow.action();
	}
}
