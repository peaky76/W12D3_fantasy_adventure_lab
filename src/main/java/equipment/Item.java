package equipment;

import behaviours.IApply;

public class Item implements IApply {

    private String name;
    private ItemType itemType;

    public Item(String name, ItemType itemType) {
        this.name = name;
        this.itemType = itemType;
    }

    public String getName() {
        return name;
    }

    public ItemType getItemType() {
        return itemType;
    }

    public void applyTo(character.Character character) {

    }
}
