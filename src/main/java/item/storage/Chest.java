package item.storage;

import behaviours.Closeable;
import behaviours.Lockable;
import item.Key;
import item.Material;

public class Chest extends Container implements Closeable, Lockable {

    private Material material;
    private Key correctKey;
    private Boolean isOpen;
    private Boolean isLocked;

    public Chest(Material material) {
        this.material = material;
        this.correctKey = null;
        this.isOpen = false;
        this.isLocked = false;
    }

    public Material getMaterial() {
        return material;
    }

    public Key getCorrectKey() {
        return correctKey;
    }

    public void setCorrectKey(Key correctKey) { this.correctKey = correctKey; }

    @Override
    public Boolean getOpen() {
        return isOpen;
    }

    @Override
    public void setOpen(Boolean open) {
        isOpen = open;
    }

    @Override
    public Boolean getLocked() {
        return isLocked;
    }

    @Override
    public void setLocked(Boolean locked) { isLocked = locked; }

}
