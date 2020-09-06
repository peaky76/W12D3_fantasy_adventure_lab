package portal;

import behaviours.Closeable;
import behaviours.Lockable;
import behaviours.Passable;
import item.Key;
import item.Material;

import static helper.Helper.indefiniteArticle;

public class Door implements Closeable, Passable {

    private Material material;
    private Boolean isOpen;

    public Door(Material material) {
        this.material = material;
        this.isOpen = false;
    }

    public Material getMaterial() {
        return material;
    }

    public Boolean getOpen() {
        return isOpen;
    }

    public void setOpen(Boolean open) {
        isOpen = open;
    }

    public String getDescription() {
        return indefiniteArticle(material.name()) + " " + material.name() + " DOOR";
    }

}
