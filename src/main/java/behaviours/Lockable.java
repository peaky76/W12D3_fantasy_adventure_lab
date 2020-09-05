package behaviours;

import item.Key;

public interface Lockable {

    Key getCorrectKey();
    Boolean getLocked();
    void setLocked(Boolean status);

    default void unlockWith(Key key) {
        if (key == getCorrectKey()) setLocked(false);
    }
}
