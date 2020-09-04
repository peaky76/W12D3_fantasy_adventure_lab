package behaviours;

import item.Key;

public interface Lockable {

    Key getCorrectKey();
    Boolean getLockedStatus();
    void setLockedStatus(Boolean status);

    default void unlockWith(Key key) {
        if (key == getCorrectKey()) setLockedStatus(false);
    }
}
