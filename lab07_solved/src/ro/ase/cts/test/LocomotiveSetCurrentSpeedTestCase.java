package ro.ase.cts.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

import ro.ase.cts.exception.EngineStateException;
import ro.ase.cts.exception.SpeedException;
import ro.ase.cts.models.Locomotive;
import ro.ase.cts.utils.EngineStates;

public class LocomotiveSetCurrentSpeedTestCase {
	private Locomotive locomotive;
	
	
	@Test
	public void testRightForSetCurrentSpeed() {
		try {
			this.locomotive = new Locomotive(EngineStates.RUNNING, 100, 10);
			this.locomotive.setCurrentSpeed(20);
			assertEquals(20, this.locomotive.getCurrentSpeed(), 0.1);
		} catch (SpeedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (EngineStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void testExceptionForSetCurrentSpeed() {
			try {
				this.locomotive = new Locomotive(EngineStates.RUNNING, 200, 100);
				this.locomotive.setCurrentSpeed(160);
				fail("SPEED IS TOO HIGH");
			} catch (SpeedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (EngineStateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	@Test
	public void testBoundaryForSetCurrentSpeed() {
		try {
			this.locomotive = new Locomotive(EngineStates.STARTING, 100, 0);
			this.locomotive.setCurrentSpeed(150);
			fail("Engine should be in running mode");
		} catch (SpeedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (EngineStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
