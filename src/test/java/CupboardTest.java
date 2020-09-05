import item.Key;
import item.Material;
import item.Weapon;
import item.WeaponType;
import item.storage.Cupboard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CupboardTest {

    Cupboard cupboard;
    Key correctKey;
    Key wrongKey;
    Weapon weapon;

    @Before
    public void before() {
        correctKey = new Key(Material.IRON);
        wrongKey = new Key(Material.IRON);
        cupboard = new Cupboard();
        cupboard.setCorrectKey(correctKey);
        cupboard.setLocked(true);
        weapon = new Weapon(WeaponType.SWORD, Material.STEEL);
    }

    @Test
    public void hasCorrectKey() {
        assertEquals(correctKey, cupboard.getCorrectKey());
    }

    @Test
    public void startsEmpty() {
        assertEquals(0, cupboard.contentsCount());
    }

    @Test
    public void canUnlockWithCorrectKey() {
        cupboard.unlockWith(correctKey);
        assertEquals(false, cupboard.getLocked());
    }

    @Test
    public void cannotUnlockWithWrongKey() {
        cupboard.unlockWith(wrongKey);
        assertEquals(true, cupboard.getLocked());
    }

    @Test
    public void canAddItem() {
        cupboard.addItem(weapon);
        assertEquals(1, cupboard.contentsCount());
    }

    @Test
    public void canRemoveItem() {
        cupboard.addItem(weapon);
        cupboard.removeItem(weapon);
        assertEquals(0, cupboard.contentsCount());
    }

}
