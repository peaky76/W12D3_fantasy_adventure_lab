import being.Being;
import being.Elf;
import being.Nature;
import org.junit.Before;
import org.junit.Test;
import room.Cave;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Elf elf;
    Player player;
    Cave cave;

    @Before
    public void before() {
        elf = new Elf("Brian", 50, Nature.GOOD);
        player = new Player(elf);
        cave = new Cave();
    }

    @Test
    public void hasCharacter() {
        assertEquals(elf, player.getCharacter());
    }

    @Test
    public void canSetLocation() {
        player.setLocation(cave);
        assertEquals(cave, player.getLocation());
    }
}
