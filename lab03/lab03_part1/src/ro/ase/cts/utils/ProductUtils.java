package ro.ase.cts.utils;

import java.util.List;

import ro.ase.cts.models.Product;

public class ProductUtils {		
	public static void displayMaxDiscountForCategory(List<Product> products) {
		for(Product p : products) {
			if(p.getCategory().equals("SMARTPHONE")) {
				System.out.println("Maximum discount for SMARTPHONE is 20%.");
			} 
			if(p.getCategory().equals("LAPTOP")) {
				System.out.println("Maximum discount for LAPTOP is 10%");
			}
		}
	}
}
