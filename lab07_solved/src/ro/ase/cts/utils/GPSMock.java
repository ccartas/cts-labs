package ro.ase.cts.utils;

import ro.ase.cts.interfaces.GPSClientInterface;

public class GPSMock implements GPSClientInterface {
	
	private float distanceFromCurrentPos;
	
	public void setDistanceFromCurrentPos(float distance) {
		this.distanceFromCurrentPos = distance;
	}
	
	@Override
	public float getDistanceFromCurrentPosition(float destinationLatitute, float destinationLongitude) {
		// TODO Auto-generated method stub
		return this.distanceFromCurrentPos;
	}

}
