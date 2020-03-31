package ro.ase.cts.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import ro.ase.cts.exception.EmptyProductListException;
import ro.ase.cts.exception.InvalidDiscountRateFormat;
import ro.ase.cts.models.Product;
import ro.ase.cts.utils.OrderUtils;

public class OrderUtilsTests {

	private List<Product> products;
	
	@Before
	public void init() {
		this.products = new ArrayList<Product>();
	}
	
	@Test
	public void testRight1ForGetTotalOrderValue() {
		try {
			products.add(new Product("Asus ROG", 5000));
			products.add(new Product("iMac Pro", 30000));
			double totalOrderValue = OrderUtils.getTotalOrderValue(products, 0);
			assertEquals(35000, totalOrderValue, 0.001);
		} catch (InvalidDiscountRateFormat e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (EmptyProductListException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void testRight2ForGetTotalOrderValue() {
		try {
			products.add(new Product("Asus ROG", 5000));
			products.add(new Product("iMac Pro", 30000));
			double totalOrderValue = OrderUtils.getTotalOrderValue(products, 0.1);
			assertEquals(31500, totalOrderValue, 0.001);
		} catch (InvalidDiscountRateFormat e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (EmptyProductListException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void testConformanceForGetTotalOrderValue() {
		try {
			OrderUtils.getTotalOrderValue(this.products, 10);
			fail("Discount rate should be value between (0, 1)");
		} catch (InvalidDiscountRateFormat e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (EmptyProductListException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void testOrderingAscForGetTotalOrderValue() {
		try {
			products.add(new Product("iMac Pro", 30000));
			products.add(new Product("Asus ROG", 5000));
			products.add(new Product("iMac Pro", 30000));
			double totalValue = OrderUtils.getTotalOrderValue(products, 0.1);
			Collections.sort(products, new Comparator<Product>() {
				@Override
				public int compare(Product o1, Product o2) {
					// TODO Auto-generated method stub
					if(o1.getPrice() == o2.getPrice()) {
						return 0;
					} else if(o1.getPrice() > o2.getPrice()) {
						return 1;
					} else {
						return -1;
					}
				}
			});
			double totalValueOrdered = OrderUtils.getTotalOrderValue(products, 0.1);
			assertEquals(totalValue, totalValueOrdered, 0.001);
		} catch (InvalidDiscountRateFormat e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (EmptyProductListException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void testOrderingDescForGetTotalOrderValue() {
		try {
			products.add(new Product("iMac Pro", 30000));
			products.add(new Product("Asus ROG", 5000));
			products.add(new Product("iMac Pro", 30000));
			double totalValue = OrderUtils.getTotalOrderValue(products, 0.1);
			Collections.sort(products, new Comparator<Product>() {
				@Override
				public int compare(Product o1, Product o2) {
					// TODO Auto-generated method stub
					if(o1.getPrice() == o2.getPrice()) {
						return 0;
					} else if(o1.getPrice() < o2.getPrice()) {
						return 1;
					} else {
						return -1;
					}
				}
			});
			double totalValueOrdered = OrderUtils.getTotalOrderValue(products, 0.1);
			assertEquals(totalValue, totalValueOrdered, 0.001);
		} catch (InvalidDiscountRateFormat e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (EmptyProductListException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void testRangeForGetTotalOrderValue() {
		try {
			products.add(new Product("iMac Pro", 30000));
			products.add(new Product("Asus ROG", 5000));
			products.add(new Product("iMac Pro", 30000));
			double totalValue = OrderUtils.getTotalOrderValue(products, 0.6);
			fail("Discounts above 50% should not be allowed");
		} catch (InvalidDiscountRateFormat e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (EmptyProductListException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void testReferenceForGetTotalOrderValue() {
		try {
			products.add(new Product("Asus ROG", 5000));
			products.add(new Product("iMac Pro", 30000));
			double totalValue = OrderUtils.getTotalOrderValue(products, 0.1);
			assertEquals(31500, totalValue, 0.001);
			products.add(new Product("iMac Pro", 30000));
			assertEquals(31500, totalValue, 0.001);
		} catch (InvalidDiscountRateFormat e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (EmptyProductListException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void testExistenceForGetTotalOrderValue() {
		try {
			OrderUtils.getTotalOrderValue(null, 0.1);
			fail("Should throw");
		} catch (InvalidDiscountRateFormat e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NullPointerException e) {
			
		} catch (EmptyProductListException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void testCardinalityZeroElementsForGetTotalOrderValue() {
		try {
			OrderUtils.getTotalOrderValue(products, 0.1);
			fail("Should throw");
		} catch (InvalidDiscountRateFormat e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NullPointerException e) {
			
		} catch (EmptyProductListException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void testTimeForGetTotalOrderValue() {
		try {
			OrderUtils.getTotalOrderValue(products, 0.1);
			fail("Should throw");
			products.add(new Product("Asus Rog", 3000));
			products.add(new Product("Asus Rog", 3000));
			products.add(new Product("Asus Rog", 3000));
		} catch (InvalidDiscountRateFormat e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NullPointerException e) {
			
		} catch (EmptyProductListException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
