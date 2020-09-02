import equipment.Item;
import equipment.ItemType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ItemTest {

    Item item;

    @Before
    public void before() {
        item = new Item("Golden Necklace", ItemType.TREASURE);
    }

    @Test
    public void hasName() {
        assertEquals("Golden Necklace", item.getName());
    }

    @Test
    public void hasItemType() {
        assertEquals(ItemType.TREASURE, item.getItemType());
    }
}
