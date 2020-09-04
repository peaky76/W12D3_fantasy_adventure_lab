package item.valuable;

public enum Gemstone {

    DIAMOND(50),
    RUBY(40),
    EMERALD(32),
    SAPPHIRE(26);

    private final int value;

    Gemstone(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
