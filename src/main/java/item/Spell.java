package item;

import behaviours.Knowable;
import being.Being;

public class Spell implements Knowable {
    private String name;
    private Effect effect;
    private int strength;

    public Spell(String name, Effect effect, int strength) {
        this.name = name;
        this.effect = effect;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public Effect getEffect() {
        return effect;
    }

    public int getStrength() {
        return strength;
    }

    public void useOn(Being being) {
        if (effect == Effect.ATTACKING) {
            being.takeDamage(getStrength());
        }
        else if (effect == Effect.HEALING) {
            being.healDamage(getStrength());
        }
    }
}
