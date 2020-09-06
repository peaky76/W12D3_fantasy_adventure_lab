package command;

import behaviours.Possessable;

import java.util.ArrayList;

public class Drop extends Command {

    private ArrayList<Possessable> objects;

    public Drop(ArrayList<Possessable> objects) {
        this.objects = objects;
    }

    public void enact() {

    }
}
