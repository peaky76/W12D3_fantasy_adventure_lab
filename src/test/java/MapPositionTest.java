import map.MapPosition;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MapPositionTest {

    MapPosition a;
    MapPosition b;

    @Before
    public void before() {
        a = new MapPosition(5, 10);
        b = new MapPosition(3, 12);
    }

    @Test
    public void canGetXDelta() {
        assertEquals(-2, a.getXDelta(b));
    }

    @Test
    public void canGetYDelta() {
        assertEquals(2, a.getYDelta(b));
    }

}
