import interaction.Attack;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AttackTest {

    Attack attack;

    @Before
    public void before() {
        attack = new Attack("Claw", 3, 6);
    }

    @Test
    public void hasName() {
        assertEquals("Claw", attack.getName());
    }

    @Test
    public void canGetDamage() {
        Boolean isInRange = attack.getDamage() >= 3 && attack.getDamage() <= 6;
        assertEquals(true, isInRange);
    }

}
