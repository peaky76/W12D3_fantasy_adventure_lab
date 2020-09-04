package equipment;

public enum Material {

    PLATINUM(3),
    STEEL(2),
    IRON(1),
    WOOD(0);

    private final int strength;

    Material(int strength) {
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }

}
