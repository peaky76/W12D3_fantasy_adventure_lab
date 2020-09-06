package item;

import action.Attack;
import behaviours.Tradeable;
import behaviours.Possessable;
import behaviours.Victimable;
import being.Being;

public class Weapon implements Tradeable, Possessable, Victimable {

    private WeaponType weaponType;
    private Material material;
    private Attack attack;
    private String name;

    public Weapon(WeaponType weaponType, Material material) {
        this.weaponType = weaponType;
        this.material = material;
        this.attack = new Attack(weaponType.getMinDamage(), weaponType.getMaxDamage());
        this.name = material.name() + " " + weaponType.name();
    }

    public WeaponType getWeaponType() {
        return weaponType;
    }

    public Material getMaterial() {
        return material;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return attack.getDamage() + material.getStrength();
    }

    public void useOn(Being being) {
        being.takeDamage(getDamage());
    }

    public int getMonetaryValue() {
        return weaponType.getMinDamage() * 4 + material.getStrength() * 5;
    }

    public String getDescription() { return name; }

}
