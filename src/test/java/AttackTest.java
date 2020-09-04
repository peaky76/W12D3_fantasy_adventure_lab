import action.Attack;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AttackTest {

    Attack attack;

    @Before
    public void before() {
        attack = new Attack(3, 6);
    }

//    @Test
//    public void hasName() {
//        assertEquals("Claw", attack.getName());
//    }

    @Test
    public void canGetDamage() {
        int damageDone = attack.getDamage();
        Boolean isInRange = damageDone >= 3 && damageDone <= 6;
        assertTrue(isInRange);
    }

}
