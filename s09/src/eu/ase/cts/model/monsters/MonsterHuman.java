package eu.ase.cts.model.monsters;

import eu.ase.cts.utils.MonsterType;

public class MonsterHuman extends Monster{

	public MonsterHuman() {
		this.setMonsterType(MonsterType.HUMAN);
	}
	
	@Override
	public void summonMonster() {
		// TODO Auto-generated method stub
		System.out.println("Human monster was summoned");
	}

}
