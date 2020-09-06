import item.Key;
import item.Material;
import org.junit.Before;
import org.junit.Test;
import portal.LockableDoor;

import static org.junit.Assert.assertEquals;

public class LockableDoorTest {

    LockableDoor door;
    Key correctKey;
    Key wrongKey;

    @Before
    public void before() {
        correctKey = new Key(Material.WOOD);
        wrongKey = new Key(Material.IRON);
        door = new LockableDoor(Material.WOOD, correctKey, true);
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
