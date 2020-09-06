import behaviours.Describeable;
import item.Key;
import item.Material;
import org.junit.Test;
import portal.Door;

import java.util.ArrayList;

import static helper.Helper.indefiniteArticle;
import static helper.Helper.stringifyArrayList;
import static org.junit.Assert.assertEquals;

public class HelperTest {

    @Test
    public void correctIndefiniteArticleBeforeConsonant() {
        assertEquals("a", indefiniteArticle("ball"));
    }

    @Test
    public void correctIndefiniteArticleBeforeVowel() {
        assertEquals("an", indefiniteArticle("apple"));
    }

    @Test
    public void canGetStringifiedArrayList() {

        // Arrange
        Key key = new Key(Material.STEEL);
        Door door = new Door(Material.WOOD);
        ArrayList<Describeable> describeables = new ArrayList<Describeable>();
        describeables.add(key);
        describeables.add(door);

        assertEquals("a STEEL KEY\na WOOD DOOR\n", stringifyArrayList(describeables));
    }

}
