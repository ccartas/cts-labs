package ro.ase.cts.services;

import ro.ase.cts.interfaces.SmartService;

public class SmartAirConditioningService implements SmartService{
	private float temperature;
	
	public void setTeperature(float temperature) {
		this.temperature = temperature;
	}

	@Override
	public void action() {
		// TODO Auto-generated method stub
		if(this.temperature > 30) {
			System.out.println("Start cooling.");
		} else if(this.temperature < 15){
			System.out.println("Start heating.");
		} else {
			System.out.println("Maintaining air fresh.");
		}
	}
}
