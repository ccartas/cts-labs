package ro.ase.cts.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import ro.ase.cts.exception.EngineStateException;
import ro.ase.cts.exception.SpeedException;
import ro.ase.cts.models.Locomotive;
import ro.ase.cts.utils.EngineStates;
import ro.ase.cts.utils.LocomotiveHelper;

public class GetAverageSpeedTestCase {
	private Locomotive locomotive;
	
	@Before
	public void setUp() {
		try {
			this.locomotive = new Locomotive(EngineStates.RUNNING, 200, 10);
		} catch (SpeedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (EngineStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void testCrossCheckForGetAverageSpeed() {
		float avgSpeed = this.locomotive.getAverageSpeed(10);
		float avgSpeedAlternative = LocomotiveHelper.getAverage(200, 10);
		assertEquals(avgSpeedAlternative, avgSpeed, 0.1);
	}
	
	@Test
	public void testInverseForGetAverageSpeed() {
		float avgSpeed = this.locomotive.getAverageSpeed(10);
		float kmSinceDeparture = LocomotiveHelper.getDistanceFromAvgSpeed(avgSpeed, 10);
		assertEquals(200, kmSinceDeparture, 0.1);
	}
}
