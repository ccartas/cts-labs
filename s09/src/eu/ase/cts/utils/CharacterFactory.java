package eu.ase.cts.utils;


import eu.ase.cts.exception.UnsupportedCharacterException;
import eu.ase.cts.model.heroes.Character;
import eu.ase.cts.model.heroes.Healer;
import eu.ase.cts.model.heroes.Rogue;
import eu.ase.cts.model.heroes.Warrior;
import eu.ase.cts.model.heroes.Wizard;

public class CharacterFactory {

	public static Character getCharacter(CharacterType type) throws UnsupportedCharacterException {
		switch(type) {
		case TANK:
			return new Warrior();
		case MAGE:
			return new Wizard();
		case ASSASSIN:
			return new Rogue();
		case SUPPORT:
			return new Healer();
		default:
			throw new UnsupportedCharacterException("The implementation for "+type+" is missing.");
		}
	}
}
