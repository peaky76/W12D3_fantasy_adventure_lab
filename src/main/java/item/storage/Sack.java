package item.storage;

import behaviours.Closeable;

public class Sack extends Container implements Closeable {

    private Boolean isOpen;

    public Sack() {
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