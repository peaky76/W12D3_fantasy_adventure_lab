package map;

import com.sun.tools.javac.util.Pair;

import static java.lang.Math.abs;

public class MapPosition {

    private int xCoord;
    private int yCoord;

    public MapPosition(int xCoord, int yCoord) {
        this.xCoord = xCoord;
        this.yCoord = yCoord;
    }

    public int getXCoord() { return xCoord; }

    public void setXCoord(int xCoord) {
        this.xCoord = xCoord;
    }

    public int getYCoord() {
        return yCoord;
    }

    public void setYCoord(int yCoord) {
        this.yCoord = yCoord;
    }

    public int getXDelta(MapPosition other) {
        return other.xCoord - this.xCoord;
    }

    public int getYDelta(MapPosition other) {
        return other.yCoord - this.yCoord;
    }

    public Pair<Integer, Integer> getMapDelta(MapPosition other) {
        return new Pair(this.getXDelta(other), this.getYDelta(other));
    }

    public Direction getDirectionTo(MapPosition other) {
        return MapDelta.convertToDirection(this.getMapDelta(other));
    }

    public Boolean isAdjacentTo(MapPosition other) {
        return abs(this.getXDelta(other)) <= 1 && abs(this.getYDelta(other)) <= 1;
    }

}
