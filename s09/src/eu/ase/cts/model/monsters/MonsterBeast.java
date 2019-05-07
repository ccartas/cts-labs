package eu.ase.cts.model.monsters;

import eu.ase.cts.utils.MonsterType;

public class MonsterBeast extends Monster{

	public MonsterBeast() {
		this.setMonsterType(MonsterType.BEAST);
	}
	
	@Override
	public void summonMonster() {
		// TODO Auto-generated method stub
		System.out.println("Beast monster was summoned");
		
	}

}
