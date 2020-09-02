import character.Dragon;
import equipment.Weapon;
import equipment.WeaponType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WeaponTest {

    Weapon weapon;
    Dragon dragon;

    @Before
    public void before() {
        weapon = new Weapon(WeaponType.SWORD);
        dragon = new Dragon("Flamebreath", 100, 10, false);
    }

    @Test
    public void hasDamage() {
        assertEquals(5, weapon.getDamage());
    }

    @Test
    public void canBeUsed() {
        weapon.applyTo(dragon);
        assertEquals(95, dragon.getHealthPoints());
    }
}
