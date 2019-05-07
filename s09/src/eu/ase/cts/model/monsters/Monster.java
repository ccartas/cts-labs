package eu.ase.cts.model.monsters;

import eu.ase.cts.utils.MonsterType;

public abstract class Monster implements Cloneable{
	private MonsterType monsterType;
	
	
	@Override
	public Object clone() throws CloneNotSupportedException{
		Monster m = null;
		m = (Monster) super.clone();
		m.monsterType = this.monsterType;
		return m;
	}
	
	public void setMonsterType(MonsterType type) {
		this.monsterType = type;
	}
	
	public MonsterType getMonsterType() {
		return this.monsterType;
	}
	
	public abstract void summonMonster();
}
