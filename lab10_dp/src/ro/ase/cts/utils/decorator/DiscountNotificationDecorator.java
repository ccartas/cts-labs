package ro.ase.cts.utils.decorator;

import ro.ase.cts.interfaces.DiscountNotification;

public abstract class DiscountNotificationDecorator implements DiscountNotification {
	private DiscountNotification notification; 
	
	public DiscountNotificationDecorator(DiscountNotification notification) {
		// TODO Auto-generated constructor stub
		this.notification = notification;
	}
	@Override
	public void sendNotification() {
		// TODO Auto-generated method stub
		this.notification.sendNotification();
	}

}
