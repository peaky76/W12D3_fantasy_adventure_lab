package item.valuable;

public enum Clarity {

    FLAWLESS(1.5),
    NORMAL(1),
    TARNISHED(0.8);

    private final double modifier;

    Clarity(double modifier) {
        this.modifier = modifier;
    }

    public double getModifier() {
        return modifier;
    }
}
