package equipment;

import action.Attack;
import behaviours.Exchangeable;
import behaviours.Usable;
import being.Being;

public class Weapon implements Usable, Exchangeable {

    private String name;
    private WeaponType weaponType;
    private Material material;
    private Attack attack;

    public Weapon(WeaponType weaponType, Material material) {
        this.weaponType = weaponType;
        this.material = material;
        this.attack = new Attack(weaponType.getMinDamage(), weaponType.getMaxDamage());
    }

    public WeaponType getWeaponType() {
        return weaponType;
    }

    public Material getMaterial() {
        return material;
    }

    public int getDamage() {
        return attack.getDamage() + material.getStrength();
    }

    public void useOn(Being being) {
        being.takeDamage(getDamage());
    }

    public int getMonetaryValue() {
        return 0;
    }

}
