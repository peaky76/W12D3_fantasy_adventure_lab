package being;

import behaviours.Knowable;
import behaviours.Possessable;
import item.storage.Inventory;

import java.util.ArrayList;

public abstract class Humanoid extends Being {

    private Inventory inventory;
    private ArrayList<Knowable> knowledge;
    private Possessable equippedItem;

    public Humanoid(String name, int healthPoints, Nature nature) {
        super(name, healthPoints, nature);
        this.inventory = new Inventory();
        this.knowledge = new ArrayList<Knowable>();
    }

    public Inventory getInventory() {
        return inventory;
    }

    public ArrayList<Knowable> getKnowledge() {
        return knowledge;
    }

    public Possessable getEquippedItem() {
        return equippedItem;
    }

    public int inventoryCount() {
        return inventory.contentsCount();
    }

    public void pickUp(Possessable item) { inventory.addItem(item); }

    public void drop(Possessable item) {
        inventory.removeItem(item);
        if (equippedItem == item) {
            equippedItem = null;
        }
    }

    public void equip(Possessable item) {
        if (inventory.getContents().contains(item)) {
            equippedItem = item;
        }
    }

}
