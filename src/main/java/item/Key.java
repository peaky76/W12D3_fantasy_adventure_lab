package item;

public class Key {

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
}
