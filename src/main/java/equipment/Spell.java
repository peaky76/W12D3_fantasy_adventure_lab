package equipment;

import behaviours.IApply;

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

    public void applyTo(character.Character character) {
        if (spellType == SpellType.ATTACKING) {
            character.takeDamage(getStrength());
        }
        else if (spellType == SpellType.HEALING) {
            character.healDamage(getStrength());
        }
    }
}
