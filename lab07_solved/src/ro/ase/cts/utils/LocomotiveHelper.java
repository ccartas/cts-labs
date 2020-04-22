package ro.ase.cts.utils;

public class LocomotiveHelper {
	
	public static float getAverage(float a, float b) {
		return a/b;
	}
	
	public static float getDistanceFromAvgSpeed(float avgSpeed, float time) {
		return avgSpeed * time;
	}
}
