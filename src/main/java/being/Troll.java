package being;

import action.Attack;

public class Troll extends Monster {

    public Troll(int healthPoints) {
        super("A TROLL", healthPoints);
        this.meansOfAttack.put("Bone crunch", new Attack(6, 10));
    }
}
