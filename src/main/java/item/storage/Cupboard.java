package item.storage;

import behaviours.Closeable;
import behaviours.Lockable;
import behaviours.Possessable;
import item.Key;
import item.Material;

import java.util.ArrayList;

public class Cupboard extends Container implements Closeable, Lockable {

    private Key correctKey;
    private Boolean isOpen;
    private Boolean isLocked;

    public Cupboard() {
        this.correctKey = null;
        this.isOpen = false;
        this.isLocked = false;
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
