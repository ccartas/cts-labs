package eu.ase.cts.utils;

import java.util.HashMap;
import java.util.Map;

import eu.ase.cts.model.monsters.Monster;
import eu.ase.cts.model.monsters.MonsterBeast;
import eu.ase.cts.model.monsters.MonsterHuman;

public class BossFight {
	
	private Map<MonsterType, Monster> monsters = new HashMap<MonsterType, Monster>();
	
	public BossFight() {
		this.monsters.put(MonsterType.HUMAN, new MonsterHuman());
		this.monsters.put(MonsterType.BEAST, new MonsterBeast());
	}
	
	public Monster spawnMonster(MonsterType type) throws CloneNotSupportedException {
		return (Monster) this.monsters.get(type).clone();
	}
}
