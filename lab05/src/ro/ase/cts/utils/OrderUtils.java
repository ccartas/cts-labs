package ro.ase.cts.utils;

import java.util.List;

import ro.ase.cts.exception.EmptyProductListException;
import ro.ase.cts.exception.InvalidDiscountRateFormat;
import ro.ase.cts.models.Product;

public class OrderUtils {
	public static final double MIN_DISCOUNT_RATE = 0;
	public static final double MAX_DISCOUNT_RATE = 0.5;
	public static double getTotalOrderValue(List<Product> products, double discountRate) throws InvalidDiscountRateFormat, EmptyProductListException {
		double totalOrderValue = 0;
		if(discountRate < MIN_DISCOUNT_RATE || discountRate >= MAX_DISCOUNT_RATE) {
			throw new InvalidDiscountRateFormat("Discount value should be between 0 and 1");
		}
		if(products != null) {
			if(products.size() == 0) {
				throw new EmptyProductListException("Product list should contain at least 1 product");
			}
			for(Product p : products) {
				totalOrderValue += p.getPrice() - discountRate * p.getPrice();
			}	
		} else {
			throw new NullPointerException("Products list is not initialized");
		}
		
		return totalOrderValue;
	}
}
