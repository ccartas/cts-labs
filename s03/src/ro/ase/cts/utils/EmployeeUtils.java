package ro.ase.cts.utils;

public class EmployeeUtils {
	
	public static float bonusCalculator(EmployeeExperience experience, float salary) throws InvalidEmployeeExperienceException {
		float bonus = 0.0f;
		switch(experience) {
			case JUNIOR:
				bonus = salary * 0.1f;
				break;
			case MIDDLE:
				bonus = salary * 0.12f;
				break;
			case SENIOR:
				bonus = salary * 0.15f;
				break;
			case EXPERT:
				bonus = salary * 0.2f;
				break;
			default:
				throw new InvalidEmployeeExperienceException("Unknown employee experience type.");
		}
		return bonus;
	}
}
