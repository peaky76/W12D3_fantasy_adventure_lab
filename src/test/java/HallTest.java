import being.Dragon;
import item.Key;
import item.Material;
import item.valuable.Clarity;
import item.valuable.Gemstone;
import item.valuable.Treasure;
import map.Direction;
import map.Map;
import org.junit.Before;
import org.junit.Test;
import portal.Door;
import room.Cave;
import room.Forest;
import room.Hall;

import static org.junit.Assert.assertEquals;

public class HallTest {

    Hall hall;
    Cave cave;
    Forest forest;
    Dragon dragon;
    Treasure treasure;
    Key key;
    Door door;

    @Before
    public void before() {
        hall = new Hall(3,4);
        cave = new Cave(4,4);
        forest = new Forest(2, 3);
        dragon = new Dragon(100);
        treasure = new Treasure(Gemstone.RUBY, Clarity.NORMAL);
        key = new Key(Material.WOOD);
        door = new Door(Material.WOOD, key, true, false);
    }

    @Test
    public void hasMapPosition() {
        assertEquals(3, hall.getMapPosition().getXCoord());
        assertEquals(4, hall.getMapPosition().getYCoord());
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
    public void canAddExit() {
        hall.addExit(Direction.EAST, door);
        assertEquals(1, hall.getExits().size());
    }

    @Test
    public void canRemoveExit() {
        hall.addExit(Direction.EAST, door);
        hall.removeExit(Direction.EAST);
        assertEquals(0, hall.getExits().size());
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
    public void canCreateLinkToAnotherRoom() {
        Map.createLink(hall, cave, door);
        assertEquals(1, hall.getExits().size());
    }

    @Test
    public void canBeCleared() {
        dragon.takeDamage(100);
        assertEquals(true, hall.isCleared());
    }

}
