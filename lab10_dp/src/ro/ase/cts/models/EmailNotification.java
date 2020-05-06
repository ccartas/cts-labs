package ro.ase.cts.models;

import ro.ase.cts.interfaces.DiscountNotification;

public class EmailNotification implements DiscountNotification {
	
	private String title;
	private String body;
	
	public EmailNotification(String title, String body) {
		this.body = body;
		this.title = title;
	}

	@Override
	public void sendNotification() {
		// TODO Auto-generated method stub
		System.out.println(String.format("EMAIL: %s\n%s", this.title, this.body));
	}
	
	
}
