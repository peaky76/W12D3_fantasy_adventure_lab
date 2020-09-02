import character.Dragon;
import character.Knight;
import equipment.Weapon;
import equipment.WeaponType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    Knight knight;
    Weapon weapon;
    Dragon dragon;

    @Before
    public void before() {
        knight = new Knight("Sir Lancelot", 50, 10, true);
        weapon = new Weapon(WeaponType.ARROW);
        dragon = new Dragon("Flamebreath", 100, 10, false);
    }

    @Test
    public void hasName() {
        assertEquals("Sir Lancelot", knight.getName());
    }

    @Test
    public void hasHealthPoints() {
        assertEquals(50, knight.getHealthPoints());
    }

    @Test
    public void hasArmourPoints() {
        assertEquals(10, knight.getArmourPoints());
    }

    @Test
    public void isFriendly() {
        assertEquals(true, knight.isFriendly());
    }

    @Test
    public void inventoryStartsEmpty() {
        assertEquals(0, knight.getInventoryCount());
    }

    @Test
    public void canTakeDamage() {
        knight.takeDamage(5);
        assertEquals(45, knight.getHealthPoints());
    }

    @Test
    public void canHealDamage() {
        knight.takeDamage(5);
        knight.healDamage(5);
        assertEquals(50, knight.getHealthPoints());
    }

    @Test
    public void canPickUpItem() {
        knight.pickUp(weapon);
        assertEquals(1, knight.getInventoryCount());
    }

    @Test
    public void canDropItem() {
        knight.pickUp(weapon);
        knight.drop(weapon);
        assertEquals(0, knight.getInventoryCount());
    }

    @Test
    public void canEquipItem() {
        knight.pickUp(weapon);
        knight.equip(weapon);
        assertEquals(weapon, knight.getEquippedItem());
    }

    @Test
    public void canAttack() {
        knight.pickUp(weapon);
        knight.equip(weapon);
        knight.attack(dragon);
        assertEquals(98, dragon.getHealthPoints());
    }
}
