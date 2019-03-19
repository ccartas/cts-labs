package ro.ase.cts.models;

import java.util.ArrayList;
import java.util.List;

import ro.ase.cts.utils.DeliveryMethod;
import ro.ase.cts.utils.PaymentMethod;
import ro.ase.java.exception.DeliveryMethodException;
import ro.ase.java.exception.EmptyOrderException;
import ro.ase.java.exception.PaymentMethodException;

public class Order {
	private List<Product> basket;
	private PaymentMethod paymentMethod;
	private DeliveryMethod deliveryMethod;
	
	public Order() {
		this.basket = new ArrayList<Product>();
	}
	
	public void setPaymentMethod(PaymentMethod method) {
		this.paymentMethod = method;
	}
	
	public void setDeliveryMethod(DeliveryMethod method) {
		this.deliveryMethod = method;
	}
	
	public List<Product> getBasket(){
		return this.basket;
	}
	
	public void clearBasket() {
		this.basket.clear();
	}
	
	public void finishOrder() throws EmptyOrderException, 
									PaymentMethodException,
									DeliveryMethodException{
		if(basket.size() == 0)
			throw new EmptyOrderException("Pentru a plasa o comanda trebuie sa adaugati cel putin 1 produs in cosul de cumparaturi.");
		if(this.paymentMethod == null)
			throw new PaymentMethodException("Pentru finalizarea comenzii setati metoda de plata.");
		if(this.deliveryMethod == null)
			throw new DeliveryMethodException("Pentru finalizarea comenzii setati modalitatea de livarare.");
		
		double totalPrice = 0;
		for(Product p : this.basket) {
			totalPrice += p.getProductPrice();
		}
		
		System.out.println("Comanda dumneavoastra, in valoare de " + totalPrice + " va fi livrata " + this.deliveryMethod + " si va fi achitata "+ this.paymentMethod);
	}
	
}
