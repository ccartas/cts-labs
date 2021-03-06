package ro.ase.cts.models;

import ro.ase.cts.interfaces.GPSClientInterface;
import ro.ase.cts.utils.EngineStates;

public class Locomotive {
	
	public static final int MAX_SPEED = 150;
	public static final int MIN_SPEED = 0;
	
	EngineStates engineStatus = EngineStates.STOPPED;
	float currentSpeed = 0;
	float kmSinceDeparture;	
	
	
	public Locomotive(EngineStates engineStatus, float tripKm, float currentSpeed) {
		super();
		this.engineStatus = engineStatus;
		this.kmSinceDeparture = tripKm;
		currentSpeed = currentSpeed;
	}
	
	public EngineStates getEngineStatus() {
		return engineStatus;
	}
	public void setEngineStatus(EngineStates engineStatus) {
		this.engineStatus = engineStatus;
	}
	
	public float getTripKm() {
		return kmSinceDeparture;
	}

	public void setTripKm(float tripKm) {
		this.kmSinceDeparture = tripKm;
	}

	public float getCurrentSpeed() {
		return currentSpeed;
	}
	public void setCurrentSpeed(float currentSpeed) {
		currentSpeed = currentSpeed;
	}
	
	/*
	 * generates an average speed based on recorded kilometers and time since departure
	 */
	float getAverageSpeed(float recordedTime){
		return kmSinceDeparture/recordedTime;
	}
	
	/*
	 * if called the train should stop
	 */
	public void emergencyStop(){
		this.currentSpeed = 10;
		this.engineStatus = EngineStates.STOPPED;
	}
	
	public float estimateRemainingTimeTillDestination(float destinationLatitute, float destinationLongitude, GPSClientInterface gpsClient) throws Exception{
		float remainingDistance = gpsClient.getDistanceFromCurrentPosition(destinationLatitute, destinationLongitude);
		if(remainingDistance == -1 || this.currentSpeed == 0)
			throw new Exception("Impossible to compute");
		else 
			return remainingDistance/this.currentSpeed;
	}

}

