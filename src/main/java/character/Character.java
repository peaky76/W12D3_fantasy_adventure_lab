package character;

import behaviours.IApply;

import java.util.ArrayList;

public abstract class Character {
    private String name;
    private int healthPoints;
    private int armourPoints;
    private boolean friendly;
    private ArrayList<IApply> inventory;
    private IApply equippedItem;

    public Character(String name, int healthPoints, int armourPoints, boolean friendly) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.armourPoints = armourPoints;
        this.friendly = friendly;
        this.inventory = new ArrayList<IApply>();
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

    public ArrayList<IApply> getInventory() {
        return inventory;
    }

    public IApply getEquippedItem() {
        return equippedItem;
    }

    public int getInventoryCount() {
        return inventory.size();
    }

    public void takeDamage(int amountOfDamage) {
        this.healthPoints -= amountOfDamage;
    }

    public void healDamage(int amountOfHealing) { this.healthPoints += amountOfHealing; }

    public void pickUp(IApply item) {
        inventory.add(item);
    }

    public void drop(IApply item) {
        inventory.remove(item);
        if (equippedItem == item) {
            equippedItem = null;
        }
    }

    public void equip(IApply item) {
        if (inventory.contains(item)) {
            equippedItem = item;
        }
    }

    public Boolean isDead() {
        return healthPoints <= 0;
    }

}
