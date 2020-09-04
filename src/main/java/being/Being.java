package being;

import behaviours.Useable;

import java.util.ArrayList;

public abstract class Being {
    private String name;
    private int healthPoints;
    private int armourPoints;
    private boolean friendly;
    private ArrayList<Useable> inventory;
    private Useable equippedItem;

    public Being(String name, int healthPoints, int armourPoints, boolean friendly) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.armourPoints = armourPoints;
        this.friendly = friendly;
        this.inventory = new ArrayList<Useable>();
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

    public ArrayList<Useable> getInventory() {
        return inventory;
    }

    public Useable getEquippedItem() {
        return equippedItem;
    }

    public int getInventoryCount() {
        return inventory.size();
    }

    public void takeDamage(int amountOfDamage) {
        this.healthPoints -= amountOfDamage;
    }

    public void healDamage(int amountOfHealing) { this.healthPoints += amountOfHealing; }

    public void pickUp(Useable item) {
        inventory.add(item);
    }

    public void drop(Useable item) {
        inventory.remove(item);
        if (equippedItem == item) {
            equippedItem = null;
        }
    }

    public void equip(Useable item) {
        if (inventory.contains(item)) {
            equippedItem = item;
        }
    }

    public Boolean isDead() {
        return healthPoints <= 0;
    }

}
