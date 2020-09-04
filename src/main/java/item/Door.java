package item;

import behaviours.Lockable;

public class Door implements Lockable {

    private Material material;
    private Key correctKey;
    private Boolean isLocked;

    public Door(Material material, Key correctKey, Boolean isLocked) {
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

    public Boolean getLocked() {
        return isLocked;
    }

    public void unlockWith(Key key) {
        if (key == correctKey) {
            this.isLocked = false;
        }
    }
}
