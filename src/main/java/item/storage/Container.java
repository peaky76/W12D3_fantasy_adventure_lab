package item.storage;

import behaviours.Fillable;
import behaviours.Possessable;

import java.util.ArrayList;

public abstract class Container implements Fillable {

    private ArrayList<Possessable> contents;

    public Container() {
        this.contents = new ArrayList<Possessable>();
    }

    public ArrayList<Possessable> getContents() {
        return contents;
    }

    public void addItem(Possessable item) {
        this.contents.add(item);
    }

    public void removeItem(Possessable item) {
        if (this.contents.contains(item)) {
            this.contents.remove(item);
        }
    }
}
