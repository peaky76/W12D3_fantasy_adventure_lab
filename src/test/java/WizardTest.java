import character.Wizard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    Wizard wizard;

    @Before
    public void before() {
        wizard = new Wizard("Merlin", 30, 5, true);
    }

    @Test
    public void hasName() {
        assertEquals("Merlin", wizard.getName());
    }

    @Test
    public void hasHealthPoints() {
        assertEquals(30, wizard.getHealthPoints());
    }

    @Test
    public void hasArmourPoints() {
        assertEquals(5, wizard.getArmourPoints());
    }

    @Test
    public void isFriendly() {
        assertEquals(true, wizard.isFriendly());
    }

    @Test
    public void inventoryStartsEmpty() {
        assertEquals(0, wizard.getInventoryCount());
    }
}