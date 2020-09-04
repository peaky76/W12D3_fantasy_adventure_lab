import item.Clarity;
import item.Gemstone;
import item.Treasure;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TreasureTest {

    Treasure treasure;

    @Before
    public void before() {
        treasure = new Treasure(Gemstone.RUBY, Clarity.FLAWLESS);
    }

    @Test
    public void hasGemstone() {
        assertEquals(Gemstone.RUBY, treasure.getGemstone());
    }

    @Test
    public void hasClarity() {
        assertEquals(Clarity.FLAWLESS, treasure.getClarity());
    }

    @Test
    public void hasName() {
        assertEquals("FLAWLESS RUBY", treasure.getName());
    }

    @Test
    public void canGetMonetaryValue() {
        assertEquals(60, treasure.getMonetaryValue());
    }

}
