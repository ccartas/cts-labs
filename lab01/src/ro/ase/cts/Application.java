package ro.ase.cts;

import ro.ase.cts.models.SmartPhone;
import ro.ase.cts.models.SmartWatch;

public class Application {
	public static void main(String[] args) {
		SmartPhone sp1 = new SmartPhone("SP1");
		SmartWatch sw1 = new SmartWatch("SW1");
		SmartWatch sw2 = new SmartWatch("SW2");
		sp1.pair(sw1);
		sp1.pair(sw2);
		sp1.displayPairedDevices();
		sp1.unpair(sw1);
		sp1.unpair(sw2);
		sw1.pair(sw2);
		sw1.displayPairedDevices();
		sw2.displayPairedDevices();
		
	}
}
