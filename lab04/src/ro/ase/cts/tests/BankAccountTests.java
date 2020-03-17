package ro.ase.cts.tests;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import ro.ase.cts.utils.BankAccountHelper;

public class BankAccountTests {

	/**
	 * Right Test for computeAnuallyInterestValue.
	 * The test
	 */
	@Test
	public void testRightInterestValue() {
		try {
			assertEquals(1200, BankAccountHelper.computeAnuallyInterestValue(1000, 0.1));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void testLowerBoundaryBalanceInterestValue() {
		try {
			BankAccountHelper.computeAnuallyInterestValue(-1000, 0.1);
			fail("Method should not accept negative balance");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void testUpperBoundaryBalanceInterestValue() {
		try {
			BankAccountHelper.computeAnuallyInterestValue(Double.MAX_VALUE , 0.1);
			fail("Method should not accept negative balance");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void testInverseInterestValue() {
		try {
			double interestValue = BankAccountHelper.computeAnuallyInterestValue(1000, 0.1);
			assertEquals(1000, BankAccountHelper.computeBalanceFromAnualInterestValue(interestValue, 0.1));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void testCrossCheckInterestValue() {
		try {
			double interestValue = BankAccountHelper.computeAnuallyInterestValue(10000, 0.1);
			double crossValue = 10000 * 12 * 10 / 100;
			assertEquals(crossValue, interestValue);
		} catch (Exception e) {
			
		}
	}
	
	@Test
	public void testPerformanceInterestValue() {
		try {
			long startTime = System.currentTimeMillis();
			BankAccountHelper.computeAnuallyInterestValue(10000, 0.1);
			long endTime = System.currentTimeMillis();
			long duration = endTime - startTime;
			assertTrue(duration < 1000);
		} catch(Exception ex) {
			
		}
	}
	
	
}
