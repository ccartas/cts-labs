package eu.ase.cts.model.heroes;

import java.util.Random;

public abstract class Character {
	private String characterName;
	private String[] skills;
	
	public Character() {
		
	}
	
	public void setCharacterName(String name) {
		this.characterName = name;
	}
	public void setSkills(String[] skills) {
		this.skills = skills;
	}
	
	public String getCharacterName() {
		return this.characterName;
	}
	public String[] getSkills() {
		return this.skills;
	}
	
	public void useSkill() {
		Random rand = new Random();
		int skillIndex = rand.nextInt(this.skills.length);
		System.out.println("ATTACKING WITH: "+this.skills[skillIndex]);
	}
	
	public abstract String getSpecialAbility();
	public abstract int getHealthPoints();
}
