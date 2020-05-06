package ro.ase.cts.external;

import ro.ase.cts.external.services.ExternalAirConditioningService;
import ro.ase.cts.external.services.ExternalDoorService;
import ro.ase.cts.external.services.ExternalWindowService;

public class ExternalSmartHomeFacade {
	private ExternalAirConditioningService externalAir;
	private ExternalDoorService externalDoor;
	private ExternalWindowService externalWindow;
	
	public ExternalSmartHomeFacade() {
		this.externalAir = new ExternalAirConditioningService();
		this.externalDoor = new ExternalDoorService();
		this.externalWindow = new ExternalWindowService();
	}
	
	public void triggerSystem() {
		this.externalAir.action();
		this.externalDoor.action();
		this.externalWindow.action();
	}
}
