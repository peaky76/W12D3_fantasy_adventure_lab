package character;

import behaviours.IUse;

import java.util.ArrayList;

public abstract class Character {
    private String name;
    private int healthPoints;
    private int armourPoints;
    private boolean friendly;
    private ArrayList<IUse> inventory;
    private IUse equippedItem;

    public Character(String name, int healthPoints, int armourPoints, boolean friendly) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.armourPoints = armourPoints;
        this.friendly = friendly;
        this.inventory = new ArrayList<IUse>();
    }

    public String getName() {
        return name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public int getArmourPoints() {
        return armourPoints;
    }

    public boolean isFriendly() {
        return friendly;
    }

    public ArrayList<IUse> getInventory() {
        return inventory;
    }

    public IUse getEquippedItem() {
        return equippedItem;
    }

    public int getInventoryCount() {
        return inventory.size();
    }

    public void takeDamage(int amountOfDamage) {
        this.healthPoints -= amountOfDamage;
    }

    public void healDamage(int amountOfHealing) { this.healthPoints += amountOfHealing; }

}
