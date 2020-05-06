package ro.ase.cts.utils.decorator;

import ro.ase.cts.interfaces.DiscountNotification;

public class PWANotificationDecorator extends DiscountNotificationDecorator {

	public PWANotificationDecorator(DiscountNotification notification) {
		super(notification);
	}
	
	public void sendNotification() {
		super.sendNotification();
		sendPWA();
	}
	
	public void sendPWA() {
		System.out.println("Sending PWANotification");
	}

}
