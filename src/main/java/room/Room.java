package room;

import behaviours.Victimable;
import being.Being;

import java.util.ArrayList;

public class Room {

    private ArrayList<Victimable> contents;
    private ArrayList<Being> inhabitants;

    public Room() {
        this.contents = new ArrayList<Victimable>();
        this.inhabitants = new ArrayList<Being>();
    }

    public ArrayList<Victimable> getContents() {
        return contents;
    }

    public ArrayList<Being> getInhabitants() {
        return inhabitants;
    }

    public void addContent(Victimable item) {
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
