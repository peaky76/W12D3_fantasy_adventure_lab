package command;

import behaviours.Actionable;

public class Go implements Actionable {

    private CompassDirection direction;

    public Go(CompassDirection direction) {
        this.direction = direction;
    }

    public void enact() {

    }

}
