package command;

import behaviours.Actionable;
import room.Room;

public class Look implements Actionable {

    private Room room;

    public Look(Room room) {
        this.room = room;
    }

    public void enact() {
        System.out.println(this.room.getDescription());
    }

}
