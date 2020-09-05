package command;

import behaviours.Actionable;
import being.Being;

public class Attack implements Actionable {

    private Being target;

    public Attack(Being target) {
        this.target = target;
    }

    public void enact() {

    }

}
