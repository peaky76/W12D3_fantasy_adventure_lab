package being;

import behaviours.Magicable;
import behaviours.Ownable;
import equipment.Spell;

public class Wizard extends Being implements Magicable {

    private Ownable ownedCreature;

    public Wizard(String name, int healthPoints, int armourPoints, boolean friendly) {
        super(name, healthPoints, armourPoints, friendly);
    }

    public void castSpell(Being being) {
        if (getEquippedItem() instanceof Spell) {
            getEquippedItem().applyTo(being);
        }
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
