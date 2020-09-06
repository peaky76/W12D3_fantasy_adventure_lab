package command;

import behaviours.Possessable;

import java.util.ArrayList;

public class PickUp extends Command {

    private ArrayList<Possessable> objects;

    public PickUp(ArrayList<Possessable> objects) {
        this.objects = objects;
    }

    public void enact() {

    }
}
