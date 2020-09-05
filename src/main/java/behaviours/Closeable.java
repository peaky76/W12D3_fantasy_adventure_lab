package behaviours;

import item.Key;

public interface Closeable {

    Boolean getOpen();
    void setOpen(Boolean status);

    default void open() {
        setOpen(true);
    }
    default void close() { setOpen(false); }
}
