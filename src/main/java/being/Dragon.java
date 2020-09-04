package being;

import action.Attack;

public class Dragon extends Monster {

    public Dragon(int healthPoints) {
        super("A DRAGON", healthPoints);
        this.meansOfAttack.put("Fiery breath", new Attack(8, 12));
        this.meansOfAttack.put("Tail swish", new Attack(4, 6));
    }

}
