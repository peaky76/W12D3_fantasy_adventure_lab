package being;

import behaviours.Fightable;
import behaviours.Ownable;

public class Dragon extends Being implements Fightable, Ownable {

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
