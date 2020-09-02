package character;

import behaviours.IOwned;

public class Dragon extends Character implements IOwned {

    public Dragon(String name, int healthPoints, int armourPoints, boolean friendly) {
        super(name, healthPoints, armourPoints, friendly);
    }

    public void ownedBy(character.Character character) {

    }
}
