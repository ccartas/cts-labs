package ro.ase.cts.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

import ro.ase.cts.models.Product;
import ro.ase.java.exception.InvalidDiscountException;

public class ProductTest {
	private Product p;
	
	@Before
	public void setUp() {
		System.out.println("I am called");
		p = new Product("Air Pods", 800);
	}
	
	@Test
	public void testDiscountMethod() {
		try {
			p.applyDiscount(0.1);
			assertEquals(720, p.getProductPrice(), 0.001);
		} catch (InvalidDiscountException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void testNegativeDiscount() {
		try {
			p.applyDiscount(-0.2);
			fail("Metoda applyDiscount nu ar trebui sa accepte discount negative");
		} catch(InvalidDiscountException ex) {
			ex.printStackTrace();
		}
	}
	
	@Test
	public void testGreaterDiscount() {
		try {
			p.applyDiscount(1.2);
			fail("Metoda applyDiscount nu ar trebui sa accepte discount mai mare de 100%");
		} catch (InvalidDiscountException ex) {
			ex.printStackTrace();
		}
	}
}
