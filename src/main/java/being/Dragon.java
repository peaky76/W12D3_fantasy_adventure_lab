package being;

import behaviours.Fightable;
import behaviours.Ownable;
import interaction.Attack;

public class Dragon extends Monster {

    public Dragon(String name, int healthPoints, Nature nature) {
        super(name, healthPoints, nature);
        this.attacks.add(new Attack("Fiery breath", 8, 12));
        this.attacks.add(new Attack("Tail swish", 4, 6));
    }

}
