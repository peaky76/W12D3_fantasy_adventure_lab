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
    Human human;
    Player player;

    @Before
    public void before() {
        game = new Game();
        hall = new Hall(0,0 );
        human = new Human("Dave", 100, Nature.GOOD);
        player = new Player(human);
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
