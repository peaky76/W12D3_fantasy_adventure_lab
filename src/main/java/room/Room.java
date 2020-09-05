package room;

import behaviours.Describeable;
import behaviours.Passable;
import being.Being;
import item.storage.Container;
import map.Direction;
import map.MapPosition;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class Room implements Describeable {

    private MapPosition mapPosition;
    private HashMap<Direction, Passable> exits;
    private ArrayList<Being> inhabitants;
    private Container container;

    public Room(int xCoord, int yCoord) {
        this.mapPosition = new MapPosition(xCoord, yCoord);
        this.exits = new HashMap<Direction, Passable>();
        this.inhabitants = new ArrayList<Being>();
        this.container = createContainer();
    }

    public MapPosition getMapPosition() { return mapPosition; }

    public HashMap<Direction, Passable> getExits() { return exits; }

    public ArrayList<Being> getInhabitants() {
        return inhabitants;
    }

    public Container getContainer() {
        return container;
    }

    public void addExit(Direction direction, Passable portal) { exits.put(direction, portal); }

    public void removeExit(Direction direction) { exits.remove(direction); }

    public void addInhabitant(Being being) {
        inhabitants.add(being);
    }

    public Boolean isAdjacentTo(Room otherRoom) {
        return this.mapPosition.isAdjacentTo(otherRoom.mapPosition);
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
