package ro.ase.cts.test;

import ro.ase.cts.models.Plane;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import ro.ase.cts.mock.IntelligentAssistantMock;

public class PlaneTest {
	Plane p;
	IntelligentAssistantMock mock;
	
	@Before
	public void setUp() {
		p = new Plane("Boeing 737", "PLANE001");
		mock = new IntelligentAssistantMock();
	}
	
	@Test
	public void testRightNumberOfSeats() {
		mock.setNumberOfSeats(5);
		p.getNumberOfAvailableSeats("PLANE001", mock);
		assertEquals(5, p.getSeats());
	}
	
}
