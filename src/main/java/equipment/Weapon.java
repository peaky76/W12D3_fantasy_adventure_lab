package equipment;

import behaviours.Usable;
import being.Being;

public class Weapon implements Usable {
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
