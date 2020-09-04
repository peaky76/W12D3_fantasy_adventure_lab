package being;

import behaviours.Knowable;
import behaviours.Victimable;

import java.util.ArrayList;

public abstract class Humanoid extends Being {

    private ArrayList<Victimable> inventory;
    private ArrayList<Knowable> knowledge;
    private Victimable equippedItem;

    public Humanoid(String name, int healthPoints, Nature nature) {
        super(name, healthPoints, nature);
        this.inventory = new ArrayList<Victimable>();
        this.knowledge = new ArrayList<Knowable>();
    }

    public ArrayList<Victimable> getInventory() {
        return inventory;
    }

    public ArrayList<Knowable> getKnowledge() {
        return knowledge;
    }

    public Victimable getEquippedItem() {
        return equippedItem;
    }

    public int getInventoryCount() {
        return inventory.size();
    }

    public void pickUp(Victimable item) {
        inventory.add(item);
    }

    public void drop(Victimable item) {
        inventory.remove(item);
        if (equippedItem == item) {
            equippedItem = null;
        }
    }

    public void equip(Victimable item) {
        if (inventory.contains(item)) {
            equippedItem = item;
        }
    }
}
