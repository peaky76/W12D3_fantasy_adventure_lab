package item;

import behaviours.Consumable;
import behaviours.Tradeable;
import behaviours.Possessable;
import being.Being;

public class Potion implements Consumable, Tradeable, Possessable {

    private String name;
    private Effect effect;
    private int strength;

    public Potion(Effect effect, int strength) {
        this.effect = effect;
        this.strength = strength;
        this.name = generateName();
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

    public void applyEffectTo(Being recipient) {
        if (this.effect == Effect.ATTACKING) {
            recipient.takeDamage(strength);
        }
        else {
            recipient.healDamage(strength);
        }
    }

    public int getMonetaryValue() {
        return strength * 5;
    }

    private String generateName() {

        String power = "";
        if (this.strength > 50) {
            power = "EPIC";
        } else if (this.strength > 20) {
            power = "STRONG";
        } else if (this.strength < 10) {
            power = "MILD";
        }

        String type = "";
        if (this.effect == Effect.ATTACKING) {
            type = "POISON";
        } else {
                type = "HEALING POTION";
        }

        return power + " " + type;
    }

    public String getDescription() { return name; }

}
