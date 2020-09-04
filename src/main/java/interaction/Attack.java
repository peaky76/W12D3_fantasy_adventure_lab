package interaction;

import static helper.Helper.getRandomIntInRange;

public class Attack {

    private String name;
    private int minDamage;
    private int maxDamage;

    public Attack(String name, int minDamage, int maxDamage) {
        this.name = name;
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return getRandomIntInRange(minDamage, maxDamage);
    }

}
