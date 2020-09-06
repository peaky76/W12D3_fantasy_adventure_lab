package command;

import behaviours.Closeable;

public class Open extends Command {

    private Closeable closeable;

    public Open(Closeable closeable) {
        this.closeable = closeable;
    }

    public void enact() {

    }

}
