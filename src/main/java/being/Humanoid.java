package being;

import behaviours.Knowable;
import behaviours.Usable;

import java.util.ArrayList;

public abstract class Humanoid extends Being {

    private ArrayList<Usable> inventory;
    private ArrayList<Knowable> knowledge;
    private Usable equippedItem;

    public Humanoid(String name, int healthPoints, Nature nature) {
        super(name, healthPoints, nature);
        this.inventory = new ArrayList<Usable>();
        this.knowledge = new ArrayList<Knowable>();
    }

    public ArrayList<Usable> getInventory() {
        return inventory;
    }

    public ArrayList<Knowable> getKnowledge() {
        return knowledge;
    }

    public Usable getEquippedItem() {
        return equippedItem;
    }

    public int getInventoryCount() {
        return inventory.size();
    }

    public void pickUp(Usable item) {
        inventory.add(item);
    }

    public void drop(Usable item) {
        inventory.remove(item);
        if (equippedItem == item) {
            equippedItem = null;
        }
    }

    public void equip(Usable item) {
        if (inventory.contains(item)) {
            equippedItem = item;
        }
    }
}
