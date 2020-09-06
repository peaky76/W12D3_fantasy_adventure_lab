import portal.Door;
import item.Key;
import item.Material;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DoorTest {

    Door door;

    @Before
    public void before() {
        door = new Door(Material.WOOD);
    }

    @Test
    public void hasMaterial() {
        assertEquals(Material.WOOD, door.getMaterial());
    }

    @Test
    public void startsClosed() { assertFalse(door.getOpen()); }

    @Test
    public void canOpen() {
        door.open();
        assertTrue(door.getOpen());
    }

    @Test
    public void canClose() {
        door.open();
        door.close();
        assertFalse(door.getOpen());
    }

    @Test
    public void canGetDescription() {
        assertEquals("a WOOD DOOR", door.getDescription());
    }
}
