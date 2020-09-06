package behaviours;

import java.util.ArrayList;

import static helper.Helper.stringifyArrayList;

public interface Fillable {

    ArrayList<Possessable> getContents();

    void addItem(Possessable item);
    void removeItem(Possessable item);

    default int contentsCount() {
        return getContents().size();
    }

    default String listContents(){
        return "Function not implemented yet.";
//        return stringifyArrayList(getContents());
    }

}
