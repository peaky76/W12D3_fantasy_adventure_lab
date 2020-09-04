package item;

import behaviours.Knowable;
import being.Being;

public class Spell implements Knowable {
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

    public void useOn(Being being) {
        if (spellType == SpellType.ATTACKING) {
            being.takeDamage(getStrength());
        }
        else if (spellType == SpellType.HEALING) {
            being.healDamage(getStrength());
        }
    }
}
