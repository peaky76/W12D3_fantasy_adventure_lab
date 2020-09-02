import character.Knight;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    Knight knight;

    @Before
    public void before() {
        knight = new Knight("Sir Lancelot", 50, 10, true);
    }

    @Test
    public void hasName() {
        assertEquals("Sir Lancelot", knight.getName());
    }

    @Test
    public void hasHealthPoints() {
        assertEquals(50, knight.getHealthPoints());
    }

    @Test
    public void hasArmourPoints() {
        assertEquals(10, knight.getArmourPoints());
    }

    @Test
    public void isFriendly() {
        assertEquals(true, knight.isFriendly());
    }

    @Test
    public void inventoryStartsEmpty() {
        assertEquals(0, knight.getInventoryCount());
    }
}
