package ro.ase.cts.utils.decorator;

import ro.ase.cts.interfaces.DiscountNotification;

public class EmailNotificationDecorator extends DiscountNotificationDecorator {

	public EmailNotificationDecorator(DiscountNotification notification) {
		super(notification);
	}
	
	public void sendNotification() {
		super.sendNotification();
		sendEmail();
	}
	
	public void sendEmail() {
		System.out.println("Sending email");
	}

}
