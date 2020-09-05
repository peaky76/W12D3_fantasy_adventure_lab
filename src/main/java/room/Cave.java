package room;

import item.Material;
import item.storage.Barrel;
import item.storage.Chest;
import item.storage.Container;
import item.storage.Sack;

import static helper.Helper.getRandomIntInRange;

public class Cave extends Room {

    public Cave(int xCoord, int yCoord) {
        super(xCoord, yCoord);
    }

    @Override
    protected Container createContainer() {
        int selection = getRandomIntInRange(0, 1);
        switch (selection) {
            case 0:
                return new Chest(Material.WOOD);
            default:
                return new Barrel();
        }
    }

    @Override
    public String getDescription() {
        return "You are in a cave.\n" + super.getDescription();
    }
}
