package item.storage;

import behaviours.Lockable;
import behaviours.Possessable;
import item.Key;
import item.Material;

import java.util.ArrayList;

public class Chest extends Container implements Lockable {

    private Material material;
    private Key correctKey;
    private Boolean isLocked;

    public Chest(Material material, Key correctKey, Boolean isLocked) {
        this.material = material;
        this.correctKey = correctKey;
        this.isLocked = isLocked;
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


}
