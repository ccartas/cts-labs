package ro.ase.cts.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import ro.ase.cts.exception.EngineStateException;
import ro.ase.cts.exception.SpeedException;
import ro.ase.cts.models.Locomotive;
import ro.ase.cts.utils.EngineStates;

public class LocomotiveConstructorTestCase {
	private Locomotive locomotive;
	
	@Before
	public void initialize() {
		
	}
	
	@Test
	public void testRightForConstructor() {
		try {
			this.locomotive = new Locomotive(EngineStates.STARTING, 100, 10);
		} catch (SpeedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (EngineStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(EngineStates.STARTING, this.locomotive.getEngineStatus());
		assertEquals(100, this.locomotive.getTripKm(), 0.1);
		assertEquals(10, this.locomotive.getCurrentSpeed(), 0.1);
	}
	
	@Test
	public void testExceptionForConstructor() {
		try {
			this.locomotive = new Locomotive(EngineStates.STARTING, 200, 160);
			fail("Locomotive max speed is " + Locomotive.MAX_SPEED);
		} catch (SpeedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (EngineStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	@Category(ImportantTest.class)
	public void testLowerLimitForConstructor() {
		try {
			this.locomotive = new Locomotive(EngineStates.RUNNING, 100, 0);
			fail("Engine state should be STOPPED or STARTING");
		} catch (SpeedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (EngineStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
