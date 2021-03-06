package item;

import behaviours.Lockable;
import behaviours.Possessable;
import behaviours.Victimable;

import static helper.Helper.indefiniteArticle;

public class Key implements Possessable {

    private String name;
    private Material material;

    public Key(Material material) {
        this.material = material;
        this.name = material.name() + " KEY";
    }

    public Material getMaterial() {
        return material;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void useOn(Lockable doorOrChest) {
        doorOrChest.unlockWith(this);
    }

    public String getDescription() {
        return indefiniteArticle(name) + " " + name;
    }

    @Override
    public String toString() { return getDescription(); }

}
