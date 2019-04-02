package ro.ase.cts.models;

import ro.ase.cts.service.IntelligentAssistant;

public class Plane {
	
	private String planeID;
	private String model;
	private int availableSeats;
	
	public Plane() {
		
	}
	
	public Plane(String model, String planeID) {
		this.model = model;
		this.planeID = planeID;
		
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	public void setNumberOfSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}
	
	public String getModel() {
		return this.model;
	}
	public int getSeats() {
		return this.availableSeats;
	}
	
	public void getNumberOfAvailableSeats(String planeID, IntelligentAssistant smartAPI) {
		int numberOfEmptySeats = smartAPI.getNumberOfAvailableSeats(planeID);
		this.availableSeats = numberOfEmptySeats;
	}
	

}
