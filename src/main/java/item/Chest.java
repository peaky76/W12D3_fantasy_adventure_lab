package item;

import behaviours.Lockable;
import behaviours.Possessable;

import java.util.ArrayList;

public class Chest implements Lockable {

    private Material material;
    private Key correctKey;
    private Boolean isLocked;
    private ArrayList<Possessable> contents;

    public Chest(Material material, Key correctKey, Boolean isLocked) {
        this.material = material;
        this.correctKey = correctKey;
        this.isLocked = isLocked;
        this.contents = new ArrayList<Possessable>();
    }

    public Material getMaterial() {
        return material;
    }

    public Key getCorrectKey() {
        return correctKey;
    }

    public Boolean getLockedStatus() {
        return isLocked;
    }

    public void setLockedStatus(Boolean locked) { isLocked = locked; }

    public void addItem(Possessable item) {
        this.contents.add(item);
    }

    public void removeItem(Possessable item) {
        if (this.contents.contains(item)) {
            this.contents.remove(item);
        }
    }

    public int contentsCount() {
        return this.contents.size();
    }
}
