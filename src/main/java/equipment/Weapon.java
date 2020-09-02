package equipment;

public class Weapon {
    private WeaponType weaponType;

    public Weapon(WeaponType weaponType) {
        this.weaponType = weaponType;
    }

    public int getDamage() {
        return weaponType.getDamage();
    }

    public void use(character.Character character) {
        character.takeDamage(getDamage());
    }
}
