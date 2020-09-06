package command;

import behaviours.Describeable;


public class Look extends Command {

    private Describeable object;

    public Look(Describeable object) {
        this.object = object;
    }

    public void enact() {
        System.out.println(this.object.getDescription());
    }

}
