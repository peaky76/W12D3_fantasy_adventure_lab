import com.sun.tools.javac.util.Pair;
import map.Direction;
import map.MapDelta;
import map.MapPosition;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MapDeltaTest {

    MapPosition a;
    MapPosition b;
    MapPosition c;

    @Before
    public void before() {
        a = new MapPosition(5, 10);
        b = new MapPosition(6, 11); // Northeast of a
        c = new MapPosition(4, 10); // West of a
    }

    @Test
    public void canConvertToDirection() {
        Pair<Integer, Integer> mapDelta = a.getMapDelta(b);
        assertEquals(Direction.NORTHEAST, MapDelta.convertToDirection(mapDelta));
    }

    @Test
    public void doesNotConvertNonAdjacentMapPositions() {
        Pair<Integer, Integer> mapDelta = b.getMapDelta(c);
        assertEquals(null, MapDelta.convertToDirection(mapDelta));
    }
}
