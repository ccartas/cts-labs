package ro.ase.cts.models;

import java.util.ArrayList;
import java.util.List;

import ro.ase.cts.exceptions.MaxSupportedConnectionsException;
import ro.ase.cts.exceptions.NoAvailableConnectionsException;

public abstract class Device {
	private final String DEVICE_ID;
	private String deviceName;
	protected List<String> pairedDevices;
	
	public Device(String deviceId) {
		this.DEVICE_ID = deviceId;
		this.pairedDevices = new ArrayList<String>();
	}
	
	public String getDeviceId() {
		return this.DEVICE_ID;
	}
	public String getDeviceName() {
		return this.deviceName;
	}
	public void setDeviceName(String name) {
		this.deviceName = name;
	}
	
	public void displayPairedDevices() {
		for(String device : this.pairedDevices) {
			System.out.println(device);
		}
	}
	
	public abstract void addDevice(String deviceId) throws MaxSupportedConnectionsException;
	public abstract void removeDevice(String deviceId) throws NoAvailableConnectionsException;
}
