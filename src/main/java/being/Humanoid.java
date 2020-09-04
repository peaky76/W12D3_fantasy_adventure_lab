package being;

import behaviours.Knowable;
import behaviours.Useable;

import java.util.ArrayList;

public abstract class Humanoid extends Being {

    private ArrayList<Useable> inventory;
    private ArrayList<Knowable> knowledge;
    private Useable equippedItem;

    public Humanoid(String name, int healthPoints, Nature nature) {
        super(name, healthPoints, nature);
        this.inventory = new ArrayList<Useable>();
        this.knowledge = new ArrayList<Knowable>();
    }

    public ArrayList<Useable> getInventory() {
        return inventory;
    }

    public ArrayList<Knowable> getKnowledge() {
        return knowledge;
    }

    public Useable getEquippedItem() {
        return equippedItem;
    }

    public int getInventoryCount() {
        return inventory.size();
    }

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
}
