import being.Being;
import being.Human;
import being.Nature;
import item.Key;
import item.Material;
import org.junit.Before;
import org.junit.Test;
import portal.Door;
import room.Cave;
import room.Forest;
import room.Hall;
import room.Room;

import static org.junit.Assert.assertEquals;

public class GameTest {

    Game game;
    Human human;
    Player player;
    Hall hall;

    @Before
    public void before() {
        game = new Game();
        human = new Human("Dave", 100, Nature.GOOD);
        player = new Player(human);
        hall = new Hall(0,0);
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
