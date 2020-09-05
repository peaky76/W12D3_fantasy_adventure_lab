package item.storage;

import behaviours.Closeable;

public class Barrel extends Container implements Closeable {

    private Boolean isOpen;

    public Barrel() {
        this.isOpen = false;
    }

    @Override
    public Boolean getOpen() {
        return isOpen;
    }

    @Override
    public void setOpen(Boolean open) {
        isOpen = open;
    }
}
