import item.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChestTest {

    Chest chest;
    Key correctKey;
    Key wrongKey;
    Weapon weapon;

    @Before
    public void before() {
        correctKey = new Key(Material.WOOD);
        wrongKey = new Key(Material.IRON);
        chest = new Chest(Material.WOOD, correctKey, true);
        weapon = new Weapon(WeaponType.ARROW, Material.IRON);
    }

    @Test
    public void hasMaterial() {
        assertEquals(Material.WOOD, chest.getMaterial());
    }

    @Test
    public void hasCorrectKey() {
        assertEquals(correctKey, chest.getCorrectKey());
    }

    @Test
    public void startsEmpty() {
        assertEquals(0, chest.contentsCount());
    }

    @Test
    public void canUnlockWithCorrectKey() {
        chest.unlockWith(correctKey);
        assertEquals(false, chest.getLocked());
    }

    @Test
    public void cannotUnlockWithWrongKey() {
        chest.unlockWith(wrongKey);
        assertEquals(true, chest.getLocked());
    }

    @Test
    public void canAddItem() {
        chest.addItem(weapon);
        assertEquals(1, chest.contentsCount());
    }

    @Test
    public void canRemoveItem() {
        chest.addItem(weapon);
        chest.removeItem(weapon);
        assertEquals(0, chest.contentsCount());
    }

}