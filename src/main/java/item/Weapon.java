package item;

import action.Attack;
import behaviours.Exchangeable;
import behaviours.Usable;
import being.Being;

public class Weapon implements Usable, Exchangeable {

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

}
