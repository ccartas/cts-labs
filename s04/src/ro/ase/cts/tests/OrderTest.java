package ro.ase.cts.tests;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import ro.ase.cts.models.Order;

public class OrderTest {
	private Order testOrder;
	
	
	@Before
	public void setUp() {
		this.testOrder = new Order();
	}
	
	@After
	public void tearDown() {
		this.testOrder.clearBasket();
	}
	
	@Test
	public void testBasketInitialization() {
		assertTrue(this.testOrder.getBasket().isEmpty());
	}
	
	
}
