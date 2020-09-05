package command;

import behaviours.Actionable;
import map.CompassDirection;

public class Go implements Actionable {

    private CompassDirection direction;

    public Go(CompassDirection direction) {
        this.direction = direction;
    }

    public void enact() {

    }

}
