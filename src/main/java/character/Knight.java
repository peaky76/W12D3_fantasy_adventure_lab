package character;

import behaviours.IFight;
import equipment.Weapon;

public class Knight extends Character implements IFight {

    public Knight(String name, int healthPoints, int armourPoints, boolean friendly) {
        super(name, healthPoints, armourPoints, friendly);
    }

    public void attack(character.Character character) {
        if (getEquippedItem() instanceof Weapon) {
            getEquippedItem().applyTo(character);
        }
    }
}
