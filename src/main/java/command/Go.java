package command;

import map.Direction;

public class Go extends Command {

    private Direction direction;

    public Go(Direction direction) {
        this.direction = direction;
    }

    public void enact() {

    }

}
