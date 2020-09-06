package portal;

import behaviours.Closeable;
import behaviours.Lockable;
import behaviours.Passable;
import item.Key;
import item.Material;

import static helper.Helper.indefiniteArticle;

public class LockableDoor extends Door implements Lockable {

    private Key correctKey;
    private Boolean isLocked;

    public LockableDoor(Material material, Key correctKey, Boolean isLocked) {
        super(material);
        this.correctKey = correctKey;
        this.isLocked = isLocked;
    }

    public Key getCorrectKey() {
        return correctKey;
    }

    public Boolean getLocked() {
        return isLocked;
    }

    public void setLocked(Boolean locked) { isLocked = locked; }

}
