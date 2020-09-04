package room;

import item.Material;
import item.storage.*;

import static helper.Helper.getRandomIntInRange;

public class Forest extends Room {

    public Forest() {
    }

    @Override
    protected Container createContainer() {
        int selection = getRandomIntInRange(0, 1);
        switch (selection) {
            case 0:
                return new Chest(Material.WOOD);
            default:
                return new Sack();
        }
    }
}
