package room;

import behaviours.Useable;
import being.Being;

import java.util.ArrayList;

public class Room {

    private ArrayList<Useable> contents;
    private ArrayList<Being> inhabitants;

    public Room() {
        this.contents = new ArrayList<Useable>();
        this.inhabitants = new ArrayList<Being>();
    }

    public ArrayList<Useable> getContents() {
        return contents;
    }

    public ArrayList<Being> getInhabitants() {
        return inhabitants;
    }

    public void addContent(Useable item) {
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
