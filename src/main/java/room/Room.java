package room;

import behaviours.Usable;
import being.Being;

import java.util.ArrayList;

public class Room {

    private ArrayList<Usable> contents;
    private ArrayList<Being> inhabitants;

    public Room() {
        this.contents = new ArrayList<Usable>();
        this.inhabitants = new ArrayList<Being>();
    }

    public ArrayList<Usable> getContents() {
        return contents;
    }

    public ArrayList<Being> getInhabitants() {
        return inhabitants;
    }

    public void addContent(Usable item) {
        contents.add(item);
    }

    public void addInhabitant(Being being) {
        inhabitants.add(being);
    }

    public Boolean isCleared() {
        for (Being enemy: inhabitants) {
            if (!enemy.isDead()) {
                return false;
            }
        }
        return true;
    }
}
