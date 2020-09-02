package equipment;

public enum WeaponType {
    SWORD(5),
    AXE(4),
    CLUB(3),
    ARROW(2),
    DAGGER(1);

    private final int damage;

    WeaponType(int damage) {
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }
}
