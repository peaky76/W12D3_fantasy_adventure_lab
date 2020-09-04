import being.Dragon;
import being.Nature;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DragonTest {

    Dragon dragon;
//    Wizard wizard;
//    Spell superSpell;

    @Before
    public void before() {
        dragon = new Dragon(100);
    }

    @Test
    public void hasName() {
        assertEquals("A DRAGON", dragon.getName());
    }

    @Test
    public void hasHealthPoints() {
        assertEquals(100, dragon.getHealthPoints());
    }

    @Test
    public void hasAttacks() {
        assertEquals(2, dragon.meansOfAttackCount());
    }

}
