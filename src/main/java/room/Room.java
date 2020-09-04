package room;

import being.Being;
import item.storage.Container;

import java.util.ArrayList;

public abstract class Room {

    private Container container;
    private ArrayList<Being> inhabitants;

    public Room() {
        this.container = createContainer();
        this.inhabitants = new ArrayList<Being>();
    }

    public Container getContainer() {
        return container;
    }

    public ArrayList<Being> getInhabitants() {
        return inhabitants;
    }

    public void addInhabitant(Being being) {
        inhabitants.add(being);
    }

    public Boolean isCleared() {
        for (Being enemy: inhabitants) {
            if (!enemy.isDead()) {
                return false;
            }
        }
        return true;
    }

    protected abstract Container createContainer();
    
}
