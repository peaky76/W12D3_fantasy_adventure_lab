package room;

import item.Material;
import item.storage.*;

import static helper.Helper.getRandomIntInRange;

public class Hall extends Room {

    public Hall() {
    }

    @Override
    protected Container createContainer() {
        int selection = getRandomIntInRange(0, 3);
        switch (selection) {
            case 0:
                return new Barrel();
            case 1:
                return new Sack();
            case 2:
                return new Chest(Material.WOOD);
            default:
                return new Cupboard();
        }
    }
}
