package map;

public class MapPosition {

    private int xCoord;
    private int yCoord;

    public MapPosition(int xCoord, int yCoord) {
        this.xCoord = xCoord;
        this.yCoord = yCoord;
    }

    public int getXCoord() {
        return xCoord;
    }

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

}
