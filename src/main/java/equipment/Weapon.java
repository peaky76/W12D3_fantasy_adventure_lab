package equipment;

import behaviours.Useable;
import being.Being;

public class Weapon implements Useable {
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
