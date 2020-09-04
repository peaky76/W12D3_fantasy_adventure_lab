package item;

import behaviours.Lockable;
import behaviours.Usable;

import java.util.ArrayList;

public class Chest implements Lockable {

    private Material material;
    private Key correctKey;
    private Boolean isLocked;
    private ArrayList<Usable> contents;

    public Chest(Material material, Key correctKey, Boolean isLocked) {
        this.material = material;
        this.correctKey = correctKey;
        this.isLocked = isLocked;
        this.contents = new ArrayList<Usable>();
    }

    public Material getMaterial() {
        return material;
    }

    public Key getCorrectKey() {
        return correctKey;
    }

    public Boolean getLocked() {
        return isLocked;
    }

    public void unlockWith(Key key) {
        if (key == correctKey) {
            this.isLocked = false;
        }
    }

    public void addItem(Usable item) {
        this.contents.add(item);
    }

    public void removeItem(Usable item) {
        if (this.contents.contains(item)) {
            this.contents.remove(item);
        }
    }

    public int contentsCount() {
        return this.contents.size();
    }
}
