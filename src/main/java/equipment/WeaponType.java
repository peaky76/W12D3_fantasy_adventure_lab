package equipment;

public enum WeaponType {
    SWORD(5, 7),
    AXE(4, 6),
    ARROW(3, 5),
    DAGGER(2, 4),
    BLUNT_INSTRUMENT(1, 3);

    private final int minDamage;
    private final int maxDamage;

    WeaponType(int minDamage, int maxDamage) {

        this.minDamage = minDamage;
        this.maxDamage = maxDamage;

    }

    public int getMinDamage() {
        return minDamage;
    }

    public int getMaxDamage() {
        return maxDamage;
    }
}
