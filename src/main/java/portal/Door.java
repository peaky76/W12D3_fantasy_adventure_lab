package portal;

import behaviours.Closeable;
import behaviours.Lockable;
import behaviours.Passable;
import item.Key;
import item.Material;

public class Door implements Closeable, Lockable, Passable {

    private Material material;
    private Key correctKey;
    private Boolean isOpen;
    private Boolean isLocked;

    public Door(Material material, Key correctKey, Boolean isOpen, Boolean isLocked) {
        this.material = material;
        this.correctKey = correctKey;
        this.isOpen = isOpen;
        this.isLocked = isLocked;
    }

    public Material getMaterial() {
        return material;
    }

    public Key getCorrectKey() {
        return correctKey;
    }

    public Boolean getOpen() {
        return isOpen;
    }

    public void setOpen(Boolean open) {
        isOpen = open;
    }

    public Boolean getLocked() {
        return isLocked;
    }

    public void setLocked(Boolean locked) { isLocked = locked; }

    public String getDescription() {
        return "a " + material + " door";
    }

}
