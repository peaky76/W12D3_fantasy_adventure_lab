package being;

import action.Attack;

public class Bear extends Monster {

    public Bear(int healthPoints) {
        super("A BEAR", healthPoints);
        this.meansOfAttack.put("Claw", new Attack(4, 8));
        this.meansOfAttack.put("Bear hug", new Attack(8, 10));
    }

}
