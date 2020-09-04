import being.Human;
import being.Nature;
import item.Material;
import item.Weapon;
import item.WeaponType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HumanTest {

    Human human;
    Weapon weapon;
//    Dragon dragon;

    @Before
    public void before() {
        human = new Human("Brian", 50, Nature.GOOD);
        weapon = new Weapon(WeaponType.ARROW, Material.IRON);
//        dragon = new Dragon("Flamebreath", 100, 10, false);
    }

    @Test
    public void hasName() {
        assertEquals("Brian", human.getName());
    }

    @Test
    public void hasHealthPoints() {
        assertEquals(50, human.getHealthPoints());
    }

    @Test
    public void hasNature() {
        assertEquals(Nature.GOOD, human.getNature());
    }

    @Test
    public void inventoryStartsEmpty() {
        assertEquals(0, human.inventoryCount());
    }

    @Test
    public void knowledgeStartsEmpty() {
        assertEquals(0, human.getKnowledge().size());
    }

    @Test
    public void canTakeDamage() {
        human.takeDamage(5);
        assertEquals(45, human.getHealthPoints());
    }

    @Test
    public void canHealDamage() {
        human.takeDamage(5);
        human.healDamage(5);
        assertEquals(50, human.getHealthPoints());
    }

    @Test
    public void canPickUpItem() {
        human.pickUp(weapon);
        assertEquals(1, human.inventoryCount());
    }

    @Test
    public void canDropItem() {
        human.pickUp(weapon);
        human.drop(weapon);
        assertEquals(0, human.inventoryCount());
    }

    @Test
    public void canEquipItem() {
        human.pickUp(weapon);
        human.equip(weapon);
        assertEquals(weapon, human.getEquippedItem());
    }

//    @Test
//    public void canAttack() {
//        human.pickUp(weapon);
//        human.equip(weapon);
//        human.attack(dragon);
//        assertEquals(98, dragon.getHealthPoints());
//    }
}
