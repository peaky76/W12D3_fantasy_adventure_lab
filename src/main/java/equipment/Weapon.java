package equipment;

import action.Attack;
import behaviours.Exchangeable;
import behaviours.Usable;
import being.Being;

public class Weapon implements Usable, Exchangeable {

    private String name;
    private WeaponType weaponType;
    private Attack attack;

    public Weapon(WeaponType weaponType) {
        this.weaponType = weaponType;
        this.attack = new Attack(weaponType.getMinDamage(), weaponType.getMaxDamage());
    }

    public WeaponType getWeaponType() {
        return weaponType;
    }

    public int getDamage() {
        return attack.getDamage();
    }

    public void useOn(Being being) {
        being.takeDamage(getDamage());
    }

    public int getMonetaryValue() {
        return 0;
    }

}
