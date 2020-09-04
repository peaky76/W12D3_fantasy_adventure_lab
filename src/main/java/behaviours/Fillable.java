package behaviours;

import java.util.ArrayList;

public interface Fillable {

    ArrayList<Possessable> getContents();

    void addItem(Possessable item);
    void removeItem(Possessable item);

    default int contentsCount() {
        return getContents().size();
    }

    default String listContents(){
        String contentsList = "";
        for (Possessable item: getContents()) {
            contentsList.concat(item.toString() + "\n");
        }
        return contentsList;
    }

}
