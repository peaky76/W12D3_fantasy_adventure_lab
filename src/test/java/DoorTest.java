import item.Door;
import item.Key;
import item.Material;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DoorTest {

    Door door;
    Key correctKey;
    Key wrongKey;

    @Before
    public void before() {
        correctKey = new Key(Material.WOOD);
        wrongKey = new Key(Material.IRON);
        door = new Door(Material.WOOD, correctKey, false, true);
    }

    @Test
    public void hasMaterial() {
        assertEquals(Material.WOOD, door.getMaterial());
    }

    @Test
    public void hasCorrectKey() {
        assertEquals(correctKey, door.getCorrectKey());
    }

    @Test
    public void canUnlockWithCorrectKey() {
        door.unlockWith(correctKey);
        assertEquals(false, door.getLocked());
    }

    @Test
    public void cannotUnlockWithWrongKey() {
        door.unlockWith(wrongKey);
        assertEquals(true, door.getLocked());
    }

}
