package ro.ase.cts.strategy;

public class Assassin {
	int healthPoints;
	AttackBehavior attackBehavior;
	DefenseBehavior defenseBehavior;
	
	public void setAttackBehavior(AttackBehavior attack) {
		this.attackBehavior = attack;
	}
	public void setDefenseBehavior(DefenseBehavior defense) {
		this.defenseBehavior = defense;
	}
	
	public void doAttack() {
		this.attackBehavior.attack();
	}
	public void doDefense() {
		this.defenseBehavior.defense();
	}
}
