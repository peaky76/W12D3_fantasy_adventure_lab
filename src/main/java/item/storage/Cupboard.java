package item.storage;

import behaviours.Lockable;
import behaviours.Possessable;
import item.Key;
import item.Material;

import java.util.ArrayList;

public class Cupboard extends Container implements Lockable {

    private Key correctKey;
    private Boolean isLocked;

    public Cupboard(Key correctKey, Boolean isLocked) {
        this.correctKey = correctKey;
        this.isLocked = isLocked;
    }

    public Key getCorrectKey() {
        return correctKey;
    }

    public Boolean getLockedStatus() {
        return isLocked;
    }

    public void setLockedStatus(Boolean locked) { isLocked = locked; }

}
