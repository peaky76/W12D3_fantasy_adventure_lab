package map;

import behaviours.Passable;
import room.Room;

public class Map {

    public static void createLink(Room roomA, Room roomB, Passable portal) {
        Direction aToB = roomA.getMapPosition().getDirectionTo(roomB.getMapPosition());
        Direction bToA = roomB.getMapPosition().getDirectionTo(roomA.getMapPosition());
        if (roomA.isAdjacentTo(roomB)) {
            roomA.addExit(aToB, portal);
            roomB.addExit(bToA, portal);
        }
    }

    public static void breakLink(Room roomA, Room roomB) {
        Direction aToB = roomA.getMapPosition().getDirectionTo(roomB.getMapPosition());
        Direction bToA = roomB.getMapPosition().getDirectionTo(roomA.getMapPosition());
        roomA.removeExit(aToB);
        roomB.removeExit(bToA);
    }

}
