package command;

import behaviours.Actionable;
import behaviours.Possessable;

import java.util.ArrayList;

public class PickUp implements Actionable {

    private ArrayList<Possessable> objects;

    public PickUp(ArrayList<Possessable> objects) {
        this.objects = objects;
    }

    public void enact() {

    }
}
