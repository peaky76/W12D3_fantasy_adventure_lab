import being.Dragon;
import item.valuable.Clarity;
import item.valuable.Gemstone;
import item.valuable.Treasure;
import org.junit.Before;
import org.junit.Test;
import room.Hall;

import static org.junit.Assert.assertEquals;

public class HallTest {

    Hall hall;
    Dragon dragon;
    Treasure treasure;

    @Before
    public void before() {
        hall = new Hall(3,4);
        dragon = new Dragon(100);
        treasure = new Treasure(Gemstone.RUBY, Clarity.NORMAL);
    }

    @Test
    public void hasMapPosition() {
        assertEquals(3, hall.getMapPosition().getxCoord());
        assertEquals(4, hall.getMapPosition().getyCoord());
    }

    @Test
    public void newHallStartsWithNoInhabitants() {
        assertEquals(0, hall.getInhabitants().size());
    }

    @Test
    public void newHallStartsWithEmptyContainer() {
        assertEquals(0, hall.getContainer().contentsCount());
    }

    @Test
    public void canAddInhabitant() {
        hall.addInhabitant(dragon);
        assertEquals(1, hall.getInhabitants().size());
    }

    @Test
    public void canAddContent() {
        hall.getContainer().addItem(treasure);
        assertEquals(1, hall.getContainer().contentsCount());
    }

    @Test
    public void canBeCleared() {
        dragon.takeDamage(100);
        assertEquals(true, hall.isCleared());
    }

}
