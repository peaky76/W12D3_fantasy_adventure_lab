package item.storage;

import behaviours.Lockable;
import behaviours.Possessable;
import item.Key;
import item.Material;

import java.util.ArrayList;

public class Cupboard extends Container implements Lockable {

    private Key correctKey;
    private Boolean isLocked;

    public Cupboard() {
        this.correctKey = null;
        this.isLocked = false;
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
