import being.Being;
import room.Room;

public class Player {

    private Being character;
    private Room location;

    public Player(Being character) {
        this.character = character;
    }

    public Being getCharacter() {
        return character;
    }

    public void setCharacter(Being character) {
        this.character = character;
    }

    public Room getLocation() {
        return location;
    }

    public void setLocation(Room location) {
        this.location = location;
    }
}
