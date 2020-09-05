package item.valuable;

import behaviours.Tradeable;
import behaviours.Possessable;

public class Treasure implements Possessable, Tradeable {

    private Gemstone gemstone;
    private Clarity clarity;
    private String name;

    public Treasure(Gemstone gemstone, Clarity clarity) {
        this.gemstone = gemstone;
        this.clarity = clarity;
        this.name = clarity.name() + " " + gemstone.name();
    }

    public Gemstone getGemstone() {
        return gemstone;
    }

    public Clarity getClarity() {
        return clarity;
    }

    public String getName() {
        if (this.clarity == Clarity.NORMAL) name = name.replace("NORMAL ", "");
        return name;
    }

    public int getMonetaryValue() {
        return (int) (gemstone.getValue() * clarity.getModifier());
    }

}
