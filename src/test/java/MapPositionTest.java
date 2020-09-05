import map.MapPosition;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MapPositionTest {

    MapPosition a;
    MapPosition b;
    MapPosition c;

    @Before
    public void before() {
        a = new MapPosition(5, 10);
        b = new MapPosition(3, 12);
        c = new MapPosition( 4, 11);
    }

    @Test
    public void canGetXDelta() {
        assertEquals(-2, a.getXDelta(b));
    }

    @Test
    public void canGetYDelta() {
        assertEquals(2, a.getYDelta(b));
    }

    @Test
    public void isAdjacentToTrue() {
        assertTrue(a.isAdjacentTo(c));
    }

    @Test
    public void isAdjacentToFalse() {
        assertFalse(a.isAdjacentTo(b));
    }

}
