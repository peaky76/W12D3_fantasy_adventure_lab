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

    @Before
    public void hasWeaponType() {
        assertEquals(WeaponType.SWORD, weapon.getWeaponType());
    }

    @Before
    public void hasMaterial() {
        assertEquals(Material.IRON, weapon.getMaterial());
    }

    @Before
    public void canGetDamage() {
        int damageDone = weapon.getDamage();
        Boolean isInRange = damageDone >= 6 && damageDone <= 8;
        assertTrue(isInRange);
    }

}
