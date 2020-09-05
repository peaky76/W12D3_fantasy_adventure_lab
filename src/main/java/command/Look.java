package command;

import behaviours.Actionable;
import behaviours.Describeable;


public class Look implements Actionable {

    private Describeable object;

    public Look(Describeable object) {
        this.object = object;
    }

    public void enact() {
        System.out.println(this.object.getDescription());
    }

}
