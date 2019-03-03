package ro.ase.cts.utils;

import ro.ase.cts.exception.ProductNotAvailableException;
import ro.ase.cts.models.ClientSalaries;
import ro.ase.cts.models.ProductCategory;

public class DiscountUtils {
	
	public static float computeDiscount(ProductCategory category, float productPrice, float clientSalary) throws ProductNotAvailableException {
		float finalPrice = 0;
		finalPrice = productPrice - computeProductCategoryDiscount(category, productPrice) - computeClientDiscount(productPrice, clientSalary); 
		return finalPrice;
	}
	
	public static float computeProductCategoryDiscount(ProductCategory category, float productPrice) throws ProductNotAvailableException {
		float categoryDiscount = 0.0f;
		switch(category) {
			case SMARTPHONE:
				categoryDiscount = productPrice * 0.03f; 
				break;
			case TABLET:
				categoryDiscount = productPrice * 0.05f; 
				break;
			case LAPTOP:
				categoryDiscount = productPrice * 0.07f;
				break;
			case DESKTOP:
				categoryDiscount = productPrice * 0.1f;
				break;
			default:
				throw new ProductNotAvailableException("Invalid product category.");
		}
		return categoryDiscount;
	}
	
	public static float computeClientDiscount(float price, float clientSalary) {
		float clientDiscount = 0f;
		if(clientSalary >= ClientSalaries.MIN_SALARY && clientSalary <= ClientSalaries.MAX_SALARY) {
			clientDiscount = price * 0.05f;
		} else {
			clientDiscount = price * 0.02f;
		}
		return clientDiscount;
	}
}
