package being;

import behaviours.IFight;
import equipment.Weapon;

public class Knight extends Being implements IFight {

    public Knight(String name, int healthPoints, int armourPoints, boolean friendly) {
        super(name, healthPoints, armourPoints, friendly);
    }

    public void attack(Being being) {
        if (getEquippedItem() instanceof Weapon) {
            getEquippedItem().applyTo(being);
        }
    }
}
