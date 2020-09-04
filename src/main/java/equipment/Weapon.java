package equipment;

import behaviours.IApply;
import being.Being;

public class Weapon implements IApply {
    private WeaponType weaponType;

    public Weapon(WeaponType weaponType) {
        this.weaponType = weaponType;
    }

    public int getDamage() {
        return weaponType.getDamage();
    }

    public void applyTo(Being being) {
        being.takeDamage(getDamage());
    }
}
