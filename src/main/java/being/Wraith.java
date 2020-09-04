package being;

import action.Attack;

public class Wraith extends Monster {

    public Wraith(int healthPoints) {
        super("A WRAITH", healthPoints);
        this.meansOfAttack.put("Icy chill", new Attack(2, 4));
        this.meansOfAttack.put("Lightning shock", new Attack(7, 10));
        this.meansOfAttack.put("Really spooky noise that puts the willies up you", new Attack(1, 1));
    }
}
