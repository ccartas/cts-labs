package ro.ase.cts.models;

import java.util.ArrayList;
import java.util.List;

import ro.ase.cts.utils.DeliveryMethod;
import ro.ase.cts.utils.PaymentMethod;

public class Order {
	private List<Product> basket;
	private PaymentMethod paymentMethod;
	private DeliveryMethod deliveryMethod;
	
	public Order() {
		this.basket = new ArrayList<Product>();
	}
}
