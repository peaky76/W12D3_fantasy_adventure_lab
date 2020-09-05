package command;

import behaviours.Actionable;

public class Open implements Actionable {

    private Closeable closeable;

    public Open(Closeable closeable) {
        this.closeable = closeable;
    }

    public void enact() {

    }

}
