package item.storage;

import behaviours.Lockable;
import item.Key;
import item.Material;

public class Chest extends Container implements Lockable {

    private Material material;
    private Key correctKey;
    private Boolean isLocked;

    public Chest(Material material) {
        this.material = material;

        this.correctKey = null;
        this.isLocked = false;
    }

    public Material getMaterial() {
        return material;
    }

    public Key getCorrectKey() {
        return correctKey;
    }

    public void setCorrectKey(Key correctKey) { this.correctKey = correctKey; }

    public Boolean getLockedStatus() {
        return isLocked;
    }

    public void setLockedStatus(Boolean locked) { isLocked = locked; }

}
