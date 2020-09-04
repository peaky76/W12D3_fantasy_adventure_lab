package behaviours;

import item.Key;

public interface Lockable {

    public Key getCorrectKey();
    public Boolean getLockedStatus();
    public void setLockedStatus(Boolean status);

    default void unlockWith(Key key) {
        if (key == getCorrectKey()) setLockedStatus(false);
    }
}
