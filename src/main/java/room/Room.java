package room;

import behaviours.Describeable;
import being.Being;
import item.storage.Container;
import map.Direction;
import map.MapPosition;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class Room implements Describeable {

    private Container container;
    private ArrayList<Being> inhabitants;
    private MapPosition mapPosition;
    private HashMap<Direction, Room> exits;

    public Room(int xCoord, int yCoord) {
        this.container = createContainer();
        this.inhabitants = new ArrayList<Being>();
        this.mapPosition = new MapPosition(xCoord, yCoord);
        this.exits = new HashMap<Direction, Room>();
    }

    public Container getContainer() {
        return container;
    }

    public ArrayList<Being> getInhabitants() {
        return inhabitants;
    }

    public MapPosition getMapPosition() { return mapPosition; }

    public HashMap<Direction, Room> getExits() { return exits; }

    public void addInhabitant(Being being) {
        inhabitants.add(being);
    }

    public void addExit(Direction direction, Room room) {
        exits.put(direction, room);
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
