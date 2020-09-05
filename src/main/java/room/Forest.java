package room;

import item.Material;
import item.storage.*;

import static helper.Helper.getRandomIntInRange;

public class Forest extends Room {

    public Forest(int xCoord, int yCoord) {
        super(xCoord, yCoord);
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

    @Override
    public String getDescription() {
        return "You are in a forest.\n" + super.getDescription();
    }
}
