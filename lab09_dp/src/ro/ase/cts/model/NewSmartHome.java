package ro.ase.cts.model;

import ro.ase.cts.external.ExternalSmartHomeFacade;

public class NewSmartHome {
	private String address;
	private ExternalSmartHomeFacade externalFacade;
	
	public NewSmartHome(String address, ExternalSmartHomeFacade externalFacade) {
		this.address = address;
		this.externalFacade = externalFacade;
	}
	
	public void startAllSystems() {
		this.externalFacade.triggerSystem();
	}
}
