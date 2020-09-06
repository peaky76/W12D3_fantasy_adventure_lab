package command;

import being.Being;

public class Attack extends Command {

    private Being target;

    public Attack(Being target) {
        this.target = target;
    }

    public void enact() {

    }

}
