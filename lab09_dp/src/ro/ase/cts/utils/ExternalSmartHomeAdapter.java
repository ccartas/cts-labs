package ro.ase.cts.utils;

import ro.ase.cts.external.ExternalSmartHomeFacade;

public class ExternalSmartHomeAdapter extends SmartHomeFacade {
	private ExternalSmartHomeFacade facade;
	
	public ExternalSmartHomeAdapter(ExternalSmartHomeFacade facade) {
		this.facade = facade;
	}
	
	@Override
	public void startSmartSystems() {
		this.facade.triggerSystem();
	}
	

}
