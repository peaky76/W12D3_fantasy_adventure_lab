package equipment;

import behaviours.IApply;
import being.Being;

public class Spell implements IApply {
    private String name;
    private SpellType spellType;
    private int strength;

    public Spell(String name, SpellType spellType, int strength) {
        this.name = name;
        this.spellType = spellType;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public SpellType getSpellType() {
        return spellType;
    }

    public int getStrength() {
        return strength;
    }

    public void applyTo(Being being) {
        if (spellType == SpellType.ATTACKING) {
            being.takeDamage(getStrength());
        }
        else if (spellType == SpellType.HEALING) {
            being.healDamage(getStrength());
        }
    }
}
