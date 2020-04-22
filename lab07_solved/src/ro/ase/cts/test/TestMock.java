package ro.ase.cts.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

import ro.ase.cts.exception.EngineStateException;
import ro.ase.cts.exception.SpeedException;
import ro.ase.cts.models.Locomotive;
import ro.ase.cts.utils.EngineStates;
import ro.ase.cts.utils.GPSMock;

public class TestMock {
	private Locomotive locomotive;
	
	@Before
	public void setUp() {
		try {
			this.locomotive = new Locomotive(EngineStates.RUNNING, 150, 30);
		} catch (SpeedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (EngineStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void testRightForMock() {
		GPSMock mock = new GPSMock();
		mock.setDistanceFromCurrentPos(150);
		try {
			float result = this.locomotive.estimateRemainingTimeTillDestination(100, 20, mock);
			assertEquals(5, result, 0.1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void testExceptionForMock() {
		GPSMock mock = new GPSMock();
		mock.setDistanceFromCurrentPos(-1);
		try {
			this.locomotive.estimateRemainingTimeTillDestination(100, 20, mock);
			fail();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
