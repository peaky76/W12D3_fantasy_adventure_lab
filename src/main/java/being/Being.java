package being;

import behaviours.Useable;

import java.util.ArrayList;

public abstract class Being {
    private String name;
    private int healthPoints;
    private Nature nature;


    public Being(String name, int healthPoints, Nature nature) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.nature = nature;

    }

    public String getName() {
        return name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public Nature getNature() {
        return nature;
    }



    public void takeDamage(int amountOfDamage) {
        this.healthPoints -= amountOfDamage;
    }

    public void healDamage(int amountOfHealing) { this.healthPoints += amountOfHealing; }



    public Boolean isDead() {
        return healthPoints <= 0;
    }

}
