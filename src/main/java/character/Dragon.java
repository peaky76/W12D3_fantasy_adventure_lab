package character;

import behaviours.IFight;
import behaviours.IOwned;
import equipment.Weapon;

public class Dragon extends Character implements IFight, IOwned {

    private Character owner;

    public Dragon(String name, int healthPoints, int armourPoints, boolean friendly) {
        super(name, healthPoints, armourPoints, friendly);
    }

    public character.Character getOwner() {
        return owner;
    }

    public void setOwner(Character owner) {
        this.owner = owner;
    }

    public void attack(character.Character character) {
        character.takeDamage(20);
    }
}
