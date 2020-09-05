package room;

import behaviours.Describeable;
import being.Being;
import item.storage.Container;
import map.MapPosition;

import java.util.ArrayList;

public abstract class Room implements Describeable {

    private Container container;
    private ArrayList<Being> inhabitants;
    private MapPosition mapPosition;

    public Room(int xCoord, int yCoord) {
        this.container = createContainer();
        this.inhabitants = new ArrayList<Being>();
        this.mapPosition = new MapPosition(xCoord, yCoord);
    }

    public Container getContainer() {
        return container;
    }

    public ArrayList<Being> getInhabitants() {
        return inhabitants;
    }

    public MapPosition getMapPosition() { return mapPosition; }

    public void addInhabitant(Being being) {
        inhabitants.add(being);
    }

    public Boolean isCleared() {
        for (Being enemy: inhabitants) {
            if (!enemy.isDead()) {
                return false;
            }
        }
        return true;
    }

    protected abstract Container createContainer();
    public abstract String getDescription();
    
}
