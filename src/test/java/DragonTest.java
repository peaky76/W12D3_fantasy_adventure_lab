import character.Dragon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DragonTest {

    Dragon dragon;

    @Before
    public void before() {
        dragon = new Dragon("Flamebreath", 100, 10, false);
    }

    @Test
    public void hasName() {
        assertEquals("Flamebreath", dragon.getName());
    }

    @Test
    public void hasHealthPoints() {
        assertEquals(100, dragon.getHealthPoints());
    }

    @Test
    public void hasArmourPoints() {
        assertEquals(10, dragon.getArmourPoints());
    }

    @Test
    public void isFriendly() {
        assertEquals(false, dragon.isFriendly());
    }

    @Test
    public void inventoryStartsEmpty() {
        assertEquals(0, dragon.getInventoryCount());
    }

}
