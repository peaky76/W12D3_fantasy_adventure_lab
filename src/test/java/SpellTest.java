import equipment.Spell;
import equipment.SpellType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SpellTest {
    Spell spell;

    @Before
    public void before() {
        spell = new Spell("Fireball", SpellType.ATTACKING, 10);
    }

    @Test
    public void hasName() {
        assertEquals("Fireball", spell.getName());
    }

    @Test
    public void hasSpellType() {
        assertEquals(SpellType.ATTACKING, spell.getSpellType());
    }

    @Test
    public void hasStrength() {
        assertEquals(10, spell.getStrength());
    }
}
