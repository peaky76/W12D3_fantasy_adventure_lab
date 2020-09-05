package portal;

import behaviours.Passable;
import room.Room;

public class Portal {

    Room roomA;
    Room roomB;
    Passable connectingObject;

    public Portal(Room roomA, Room roomB, Passable connectingObject) {
        this.roomA = roomA;
        this.roomB = roomB;
        this.connectingObject = connectingObject;
    }

    public Room getRoomA() {
        return roomA;
    }

    public Room getRoomB() {
        return roomB;
    }

    public Passable getConnectingObject() {
        return connectingObject;
    }
}
