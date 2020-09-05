package command;

import behaviours.Actionable;
import map.Direction;

public class Go implements Actionable {

    private Direction direction;

    public Go(Direction direction) {
        this.direction = direction;
    }

    public void enact() {

    }

}
