package being;

import behaviours.IFight;
import behaviours.IOwned;

public class Dragon extends Being implements IFight, IOwned {

    private Being owner;

    public Dragon(String name, int healthPoints, int armourPoints, boolean friendly) {
        super(name, healthPoints, armourPoints, friendly);
    }

    public Being getOwner() {
        return owner;
    }

    public void setOwner(Being owner) {
        this.owner = owner;
    }

    public void attack(Being being) {
        being.takeDamage(20);
    }
}
