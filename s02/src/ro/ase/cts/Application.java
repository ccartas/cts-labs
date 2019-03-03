package ro.ase.cts;

import ro.ase.cts.exception.ProductNotAvailableException;
import ro.ase.cts.models.ClientSalaries;
import ro.ase.cts.models.ProductCategory;
import ro.ase.cts.utils.DiscountUtils;

public class Application {
	
	public static void main(String[] args) {
		System.out.println(compute(1, 10000, 11000));
		try {
		System.out.println(DiscountUtils.computeDiscount(ProductCategory.SMARTPHONE, 10000, 11000));
		} catch (ProductNotAvailableException ex) {
			System.out.println(ex.getMessage());
		}
	}
	
	/*
	 * Initial function 
	 */
	public static float compute(int c, float p, float cs) {
		float fp = 0f;
		float cd = 0f;
		if(c == 1) {
			if(cs >= 2000 && cs <= 10000) {
				cd = p * 0.05f;
			} else {
				cd = p * 0.02f;
			}
			fp = p - cd - (p * 0.03f);
		} else if (c == 2) {
			if(cs >= 2000 && cs <= 10000) {
				cd = p * 0.05f;
			} else {
				cd = p * 0.02f;
			}
			fp = p - cd - (p * 0.05f);
		} else if (c == 3) {
			if(cs >= 2000 && cs <= 10000) {
				cd = p * 0.05f;
			} else {
				cd = p * 0.02f;
			}
			fp = p - cd - (p * 0.07f);
		} else if (c == 4) {
			if(cs >= 2000 && cs <= 10000) {
				cd = p * 0.05f;
			} else {
				cd = p * 0.02f;
			}
			fp = p - cd - (p * 0.1f);
		}
		return fp;
	}
}
