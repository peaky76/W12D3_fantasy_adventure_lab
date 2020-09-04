package action;

import static helper.Helper.getRandomIntInRange;

public class Attack {

    private int minDamage;
    private int maxDamage;

    public Attack(int minDamage, int maxDamage) {
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
    }

    public int getDamage() {
        return getRandomIntInRange(minDamage, maxDamage);
    }

}
