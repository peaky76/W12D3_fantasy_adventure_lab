package character;

import behaviours.IMagic;
import behaviours.IOwned;
import equipment.Spell;

public class Wizard extends Character implements IMagic {

    private IOwned ownedCreature;

    public Wizard(String name, int healthPoints, int armourPoints, boolean friendly) {
        super(name, healthPoints, armourPoints, friendly);
    }

    public void castSpell(character.Character character) {
        if (getEquippedItem() instanceof Spell) {
            getEquippedItem().applyTo(character);
        }
    }

    public void changeOwnedCreature(IOwned creature) {
        if (ownedCreature != null) { ownedCreature.setOwner(null); }
        ownedCreature = creature;
        creature.setOwner(this);
    }

    public IOwned getOwnedCreature() {
        return ownedCreature;
    }
}
