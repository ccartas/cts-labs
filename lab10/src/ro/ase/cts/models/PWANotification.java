package ro.ase.cts.models;

import ro.ase.cts.interfaces.DiscountNotification;

public class PWANotification implements DiscountNotification {
	
	private String title;
	private String body;

	public PWANotification(String title, String body) {
		this.title = title;
		this.body = body;
	}
	
	@Override
	public void sendNotification() {
		// TODO Auto-generated method stub
		System.out.println(String.format("PWA: %s\n%s", this.title, this.body));
	}

}
