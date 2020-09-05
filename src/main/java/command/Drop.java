package command;

import behaviours.Actionable;
import behaviours.Possessable;

import java.util.ArrayList;

public class Drop implements Actionable {

    private ArrayList<Possessable> objects;

    public Drop(ArrayList<Possessable> objects) {
        this.objects = objects;
    }

    public void enact() {

    }
}
