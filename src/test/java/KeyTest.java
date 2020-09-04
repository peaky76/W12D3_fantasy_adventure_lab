import item.Key;
import item.Material;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KeyTest {

    Key key;

    @Before
    public void before() {
        key = new Key(Material.WOOD);
    }

    @Test
    public void hasMaterial() {
        assertEquals(Material.WOOD, key.getMaterial());
    }

    @Test
    public void hasName() {
        assertEquals("WOOD KEY", key.getName());
    }

    @Test
    public void canSetName() {
        key.setName("MAGIC KEY");
        assertEquals("MAGIC KEY", key.getName());
    }

}
