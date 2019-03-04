package ro.ase.cts.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

import ro.ase.cts.utils.EmployeeExperience;
import ro.ase.cts.utils.EmployeeUtils;
import ro.ase.cts.utils.InvalidEmployeeExperienceException;

public class EmployeeUtilsTests {
	
	@Test
	public void testBonusCalculatorJunior() {
		try {
			assertEquals(1000, EmployeeUtils.bonusCalculator(EmployeeExperience.JUNIOR, 10000), 0);
		} catch (InvalidEmployeeExperienceException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
	
	@Test
	public void testBonusCalculatorMiddle() {
		try {
			assertEquals(1200, EmployeeUtils.bonusCalculator(EmployeeExperience.MIDDLE, 10000), 0);
		} catch (InvalidEmployeeExperienceException e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Test
	public void testBonusCalculatorSenior() { 
		try {
			assertEquals(1500, EmployeeUtils.bonusCalculator(EmployeeExperience.SENIOR, 10000), 0);
		} catch (InvalidEmployeeExperienceException e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Test
	public void testBonusCalculatorExpert() {
		try {
			assertEquals(2000, EmployeeUtils.bonusCalculator(EmployeeExperience.EXPERT, 10000), 0);
		} catch(InvalidEmployeeExperienceException e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Test
	public void testInvalidEmployeeExperienceException() {
		try {
			float bonus = EmployeeUtils.bonusCalculator(EmployeeExperience.PARTNER, 1000);
			fail("Function call should fail");
		} catch (InvalidEmployeeExperienceException e) {
			System.out.println(e.getMessage());
		}
	}
}
