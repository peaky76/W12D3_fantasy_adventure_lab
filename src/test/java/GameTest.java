import being.Being;
import being.Human;
import being.Nature;
import org.junit.Before;
import org.junit.Test;
import room.Hall;
import room.Room;

import static org.junit.Assert.assertEquals;

public class GameTest {

    Game game;
    Hall hall;
    Human player;

    @Before
    public void before() {
        game = new Game();
        hall = new Hall();
        player = new Human("Dave", 100, Nature.GOOD);
    }

    @Test
    public void canAddRoom() {
        game.addRoom(hall);
        assertEquals(1, game.getRooms().size());
    }

    @Test
    public void canAddPlayer() {
        game.addPlayer(player);
        assertEquals(player, game.getPlayer());
    }
}
