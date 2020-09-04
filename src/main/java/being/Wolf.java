package being;

import action.Attack;

public class Wolf extends Monster {

    public Wolf(int healthPoints) {
        super("A WOLF", healthPoints);
        this.meansOfAttack.put("Claw", new Attack(3, 5));
        this.meansOfAttack.put("Bite", new Attack(5, 8));
    }
}
