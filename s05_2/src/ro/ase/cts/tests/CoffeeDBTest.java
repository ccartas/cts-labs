package ro.ase.cts.tests;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import ro.ase.cts.utils.CoffeeDB;

public class CoffeeDBTest {
	
	@BeforeClass
	public static void connectDB() {
		try {
			CoffeeDB.connectDB("test", "test");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@AfterClass
	public static void disconnectDB() {
		CoffeeDB.closeDB("test", "test");
	}
	
	@Test
	public void testSomething() {
		System.out.println(CoffeeDB.coffeeNames.size());
	}
	
	@Test
	public void testQueryMethod() {
		//Cross Check
		assertEquals(CoffeeDB.selectCoffeeByIndex(0), CoffeeDB.selectCoffeeByName("Caffee Latte"));
	}
}
