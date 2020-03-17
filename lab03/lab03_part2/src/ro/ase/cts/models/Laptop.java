package ro.ase.cts.models;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import ro.ase.cts.interfaces.Upgradeable;

public class Laptop extends Product implements Upgradeable {

	public Laptop(int productId) {
		super(productId);
	}
	public Laptop(int productId, String productName, int activationYear, double price) {
		super(productId, productName, activationYear, price);
	}
	
	@Override
	public void getMaxDiscount() {
		System.out.println("Max discount for laptop is 15%.");
	}

	@Override
	public double getBuyBackValue() {
		// TODO Auto-generated method stub
		Date d = new Date();
		Calendar calendar = new GregorianCalendar();
		calendar.setTime(d);
		int currentYear = calendar.get(Calendar.YEAR);
		int aging = currentYear - this.getActivationYear();
		if(aging <= 1) {
			return this.getProductPrice() * 0.6;
		} else {
			return this.getProductPrice() * 0.3;
		}
	}

}
