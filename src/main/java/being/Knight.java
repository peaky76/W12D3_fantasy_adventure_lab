package being;

import behaviours.Fightable;
import equipment.Weapon;

public class Knight extends Being implements Fightable {

    public Knight(String name, int healthPoints, int armourPoints, boolean friendly) {
        super(name, healthPoints, armourPoints, friendly);
    }

    public void attack(Being being) {
        if (getEquippedItem() instanceof Weapon) {
            getEquippedItem().applyTo(being);
        }
    }
}
