import being.Dragon;
import equipment.Spell;
import equipment.SpellType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SpellTest {

    Spell attackingSpell;
    Spell healingSpell;
    Dragon dragon;

    @Before
    public void before() {

        attackingSpell = new Spell("Fireball", SpellType.ATTACKING, 10);
        healingSpell = new Spell("Superhealing", SpellType.HEALING, 10);
        dragon = new Dragon("Flamebreath", 100, 10, false);
    }

    @Test
    public void hasName() {
        assertEquals("Fireball", attackingSpell.getName());
    }

    @Test
    public void hasSpellType() {
        assertEquals(SpellType.ATTACKING, attackingSpell.getSpellType());
    }

    @Test
    public void hasStrength() {
        assertEquals(10, attackingSpell.getStrength());
    }

    @Test
    public void canUseSpell() {
        dragon.takeDamage(10);
        healingSpell.applyTo(dragon);
        assertEquals(100, dragon.getHealthPoints());
    }
}
