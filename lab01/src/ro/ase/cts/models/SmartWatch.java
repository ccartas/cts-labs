package ro.ase.cts.models;

import ro.ase.cts.exceptions.MaxSupportedConnectionsException;
import ro.ase.cts.exceptions.NoAvailableConnectionsException;
import ro.ase.cts.utils.Connectable;

public class SmartWatch extends Device implements Connectable{
	private static final int MAX_SUPPORTED_CONNECTIONS = 1;
	
	public SmartWatch(String deviceId) {
		super(deviceId);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addDevice(String deviceId) throws MaxSupportedConnectionsException {
		// TODO Auto-generated method stub
		if(this.pairedDevices.size() < MAX_SUPPORTED_CONNECTIONS) {
			this.pairedDevices.add(deviceId);
		} else {
			throw new MaxSupportedConnectionsException("The smartwatch has more than 1 connection.");
		}
	}

	@Override
	public void removeDevice(String deviceId) throws NoAvailableConnectionsException {
		// TODO Auto-generated method stub
		if(this.pairedDevices.size() > 0) {
			this.pairedDevices.remove(deviceId);
		} else {
			throw new NoAvailableConnectionsException("There is no connection to be removed.");
		}
	}

	@Override
	public boolean pair(Device d) {
		// TODO Auto-generated method stub
		try {
			this.addDevice(d.getDeviceId());
			d.addDevice(this.getDeviceId());
			return true;
		} catch (MaxSupportedConnectionsException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		return false;
	}

	@Override
	public boolean unpair(Device d) {
		// TODO Auto-generated method stub
		try {
			this.removeDevice(d.getDeviceId());
			d.removeDevice(this.getDeviceId());
			return true;
		} catch (NoAvailableConnectionsException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		return false;
	}

}
