package being;

import interaction.Attack;

import java.util.ArrayList;
import java.util.Random;

public class Monster extends Being {

    protected ArrayList<Attack> attacks;

    public Monster(String name, int healthPoints, Nature nature) {
        super(name, healthPoints, nature);
        this.attacks = new ArrayList<Attack>();
    }

    public void attack(Being opponent) {
        opponent.takeDamage(selectAttack().getDamage());
    }

    public int getNumOfAttacks() {
        return attacks.size();
    }

    public Attack selectAttack() {
        return attacks.get(new Random().nextInt(getNumOfAttacks()));
    }

}
