import being.Being;
import room.Room;

import java.util.ArrayList;

public class Game {

    private ArrayList<Room> rooms;
    private Being player;

    public Game() {
        this.rooms = new ArrayList<Room>();
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public Being getPlayer() {
        return player;
    }

    public void addRoom(Room room) {
        this.rooms.add(room);
    }

    public void addPlayer(Being player) {
        this.player = player;
    }
}
