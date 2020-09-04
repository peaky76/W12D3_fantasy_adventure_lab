import being.Dragon;
import equipment.Material;
import equipment.Weapon;
import equipment.WeaponType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class WeaponTest {
//
    Weapon weapon;
//    Dragon dragon;
//
    @Before
    public void before() {
        weapon = new Weapon(WeaponType.SWORD, Material.IRON);
//        dragon = new Dragon("Flamebreath", 100, 10, false);
    }

    @Test
    public void hasWeaponType() {
        assertEquals(WeaponType.SWORD, weapon.getWeaponType());
    }

    @Test
    public void hasMaterial() {
        assertEquals(Material.IRON, weapon.getMaterial());
    }

    @Test
    public void hasName() {
        assertEquals("IRON SWORD", weapon.getName());
    }

    @Test
    public void hasMonetaryValue() {
        assertEquals(25, weapon.getMonetaryValue());
    }

    @Test
    public void canGetDamage() {
        int damageDone = weapon.getDamage();
        Boolean isInRange = damageDone >= 6 && damageDone <= 8;
        assertTrue(isInRange);
    }

    @Test
    public void canSetName() {
        weapon.setName("SWORD OF DOOM");
        assertEquals("SWORD OF DOOM", weapon.getName());
    }
}
