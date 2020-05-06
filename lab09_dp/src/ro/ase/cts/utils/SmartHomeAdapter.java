package ro.ase.cts.utils;

import ro.ase.cts.external.ExternalSmartHomeFacade;

public class SmartHomeAdapter extends ExternalSmartHomeFacade {
	private SmartHomeFacade facade;
	
	public SmartHomeAdapter(SmartHomeFacade facade) {
		this.facade = facade;
	}
	
	@Override
	public void triggerSystem() {
		this.facade.startSmartSystems();
	}
}
