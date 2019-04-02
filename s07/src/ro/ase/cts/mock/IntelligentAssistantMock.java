package ro.ase.cts.mock;

import ro.ase.cts.service.IntelligentAssistant;

public class IntelligentAssistantMock implements IntelligentAssistant{
	
	private int numberOfSeats;
	
	
	public void setNumberOfSeats(int number) {
		this.numberOfSeats = number;
	}
	
	@Override
	public int getNumberOfAvailableSeats(String planeID) {
		// TODO Auto-generated method stub
		return this.numberOfSeats;
	}

	
}
