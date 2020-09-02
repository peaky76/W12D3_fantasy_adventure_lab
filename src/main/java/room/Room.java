package room;

import behaviours.IApply;

import java.util.ArrayList;

public class Room {

    private ArrayList<IApply> contents;
    private ArrayList<character.Character> inhabitants;

    public Room() {
        this.contents = new ArrayList<IApply>();
        this.inhabitants = new ArrayList<character.Character>();
    }

    public ArrayList<IApply> getContents() {
        return contents;
    }

    public ArrayList<character.Character> getInhabitants() {
        return inhabitants;
    }

    public void addContent(IApply item) {
        contents.add(item);
    }

    public void addInhabitant(character.Character character) {
        inhabitants.add(character);
    }

    public Boolean isCleared() {
        for (character.Character enemy: inhabitants) {
            if (!enemy.isDead()) {
                return false;
            }
        }
        return true;
    }
}
