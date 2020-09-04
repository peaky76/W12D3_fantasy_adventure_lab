package room;

import behaviours.IApply;
import being.Being;

import java.util.ArrayList;

public class Room {

    private ArrayList<IApply> contents;
    private ArrayList<Being> inhabitants;

    public Room() {
        this.contents = new ArrayList<IApply>();
        this.inhabitants = new ArrayList<Being>();
    }

    public ArrayList<IApply> getContents() {
        return contents;
    }

    public ArrayList<Being> getInhabitants() {
        return inhabitants;
    }

    public void addContent(IApply item) {
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
