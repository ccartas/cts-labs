package ro.ase.cts.tests;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import ro.ase.cts.models.Coffee;
import ro.ase.cts.models.CoffeeType;
import ro.ase.cts.models.Order;

public class OrderTest {
	
	public Order order;
	
	@Before
	public void setUp() {
		order = new Order();
	}
	
	@After
	public void tearDown() {
		order.removeProducts();
	}
	
	@Test
	public void testOrderPrintOneProduct() {
		
		Coffee c1 = new Coffee("Late", CoffeeType.BRAZIL, 15);
		order.addProduct(c1);
		String value = String.join("\n",
								"Late BRAZIL 15.0",
								"TOTAL: 15.0");
		assertEquals(value, order.printOrder());
	}
	
	@Test
	public void testOrderPrintTwoProducts() {
		Coffee c1 = new Coffee("Late", CoffeeType.ARABICA, 10);
		Coffee c2 = new Coffee("Cappuccinno", CoffeeType.ETIOPIA, 20);
		String value = String.format("%s\n%s\n%s", 
				"Late ARABICA 10.0",
				"Cappuccinno ETIOPIA 20.0",
				"TOTAL: 30.0");
		this.order.addProduct(c1);
		this.order.addProduct(c2);
		assertEquals(value, this.order.printOrder());
	}
	
	@Test
	public void testOrderPrintMultipleProductsDuplicate() {
		Coffee c1 = new Coffee("Late", CoffeeType.ARABICA, 10);
		Coffee c2 = new Coffee("Cappuccinno", CoffeeType.ETIOPIA, 20);
		Coffee c3 = new Coffee("Late", CoffeeType.ARABICA, 10);
		this.order.addProduct(c1);
		this.order.addProduct(c2);
		this.order.addProduct(c3);
		List<Coffee> list = new ArrayList<>();
		list.add(c1);
		list.add(c2);
		list.add(c3);
		Optional<String> orderValue = list.stream().map(c -> {
			String s = c.getBeverageName() + " " + c.getCoffeeType() + " " + c.getPrice()+"\n";
			return s;
		}).reduce((complete, value) -> {
			complete += value;
			return complete;
		});
		if(orderValue.isPresent()) {
			String total = orderValue.get() + "TOTAL: 40.0";
			assertEquals(total, this.order.printOrder());
		}
	}
	
	
}
