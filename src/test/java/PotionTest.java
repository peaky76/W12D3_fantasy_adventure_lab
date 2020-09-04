import being.Human;
import being.Nature;
import item.Effect;
import item.Potion;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PotionTest {

    Potion potion;
    Potion poison;
    Human player;

    @Before
    public void before() {
        potion = new Potion(Effect.HEALING, 5);
        poison = new Potion(Effect.ATTACKING, 55);
        player = new Human("Dave", 100, Nature.GOOD);
    }

    @Test
    public void hasCorrectNameWhenHealing() {
        assertEquals("MILD HEALING POTION", potion.getName());
    }

    @Test
    public void hasCorrectNameWhenPoison() {
        assertEquals("EPIC POISON", poison.getName());
    }

    @Test
    public void canHealCharacter() {
        player.takeDamage(10);
        potion.applyEffectTo(player);
        assertEquals(95, player.getHealthPoints());
    }

    @Test
    public void canPoisonCharacter() {
        poison.applyEffectTo(player);
        assertEquals(45, player.getHealthPoints());
    }

}
