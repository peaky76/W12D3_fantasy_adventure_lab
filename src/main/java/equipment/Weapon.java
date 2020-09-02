package equipment;

import behaviours.IApply;

public class Weapon implements IApply {
    private WeaponType weaponType;

    public Weapon(WeaponType weaponType) {
        this.weaponType = weaponType;
    }

    public int getDamage() {
        return weaponType.getDamage();
    }

    public void applyTo(character.Character character) {
        character.takeDamage(getDamage());
    }
}
