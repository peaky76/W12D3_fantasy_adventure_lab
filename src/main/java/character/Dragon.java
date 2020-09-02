package character;

import behaviours.IOwned;

public class Dragon extends Character implements IOwned {

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
}
