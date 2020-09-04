package being;

import behaviours.Magicable;
import behaviours.Ownable;

public class Wizard extends Humanoid implements Magicable {

    private Ownable ownedCreature;

    public Wizard(String name, int healthPoints, Nature nature) {
        super(name, healthPoints, nature);
    }

    public void castSpell(Being being) {
//        if (getEquippedItem() instanceof Spell) {
//            getEquippedItem().applyTo(being);
//        }
    }

    public void changeOwnedCreature(Ownable creature) {
        if (ownedCreature != null) { ownedCreature.setOwner(null); }
        ownedCreature = creature;
        creature.setOwner(this);
    }

    public Ownable getOwnedCreature() {
        return ownedCreature;
    }
}
