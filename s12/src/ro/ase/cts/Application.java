package ro.ase.cts;

import ro.ase.cts.state.Checkpoint;
import ro.ase.cts.strategy.Assassin;
import ro.ase.cts.strategy.HealDefenseBehavior;
import ro.ase.cts.strategy.StunAttackBehavior;

public class Application {
	public static void main(String[] args) {
		Assassin assassin = new Assassin();
		assassin.setAttackBehavior(new StunAttackBehavior());
		assassin.setDefenseBehavior(new HealDefenseBehavior());
		assassin.doAttack();
		assassin.doDefense();
		
		
		Checkpoint ck = new Checkpoint();
		ck.printStatus();
		ck.nextState();
		ck.printStatus();
	}
}
