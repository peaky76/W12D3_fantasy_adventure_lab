package being;

import behaviours.Magicable;
import behaviours.Tameable;

public class Wizard extends Humanoid implements Magicable {

    private Tameable ownedCreature;

    public Wizard(String name, int healthPoints, Nature nature) {
        super(name, healthPoints, nature);
    }

    public void castSpell(Being being) {
//        if (getEquippedItem() instanceof Spell) {
//            getEquippedItem().applyTo(being);
//        }
    }

    public void changeOwnedCreature(Tameable creature) {
        if (ownedCreature != null) { ownedCreature.setOwner(null); }
        ownedCreature = creature;
        creature.setOwner(this);
    }

    public Tameable getOwnedCreature() {
        return ownedCreature;
    }
}
