package map;

import com.sun.tools.javac.util.Pair;

import java.util.HashMap;

public class MapDelta {

    public static Direction convertToDirection(Pair<Integer, Integer> mapDelta) {

        // Returns a direction for a mapDelta one square in any direction,
        // else returns null

        HashMap<Pair<Integer, Integer>, Direction> conversionTable;
        conversionTable = new HashMap<Pair<Integer, Integer>, Direction>();
        conversionTable.put(new Pair(0,1), Direction.NORTH);
        conversionTable.put(new Pair(1,1), Direction.NORTHEAST);
        conversionTable.put(new Pair(1,0), Direction.EAST);
        conversionTable.put(new Pair(1, -1), Direction.SOUTHEAST);
        conversionTable.put(new Pair(0, -1), Direction.SOUTH);
        conversionTable.put(new Pair(-1, -1), Direction.SOUTHWEST);
        conversionTable.put(new Pair(-1, 0), Direction.WEST);
        conversionTable.put(new Pair(-1, 1), Direction.NORTHWEST);

        if (conversionTable.containsKey(mapDelta)) return conversionTable.get(mapDelta);

        return null;
    }
}
