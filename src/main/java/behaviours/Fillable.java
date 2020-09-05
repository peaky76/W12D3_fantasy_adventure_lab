package behaviours;

import java.util.ArrayList;
import java.util.stream.Stream;

public interface Fillable {

    ArrayList<Possessable> getContents();

    void addItem(Possessable item);
    void removeItem(Possessable item);

    default int contentsCount() {
        return getContents().size();
    }

    default String listContents(){
        String contentsList = "";
        for (Possessable item: this.getContents()) {
            contentsList += item.getName() + "\n";
        }
        return contentsList;
    }

}
