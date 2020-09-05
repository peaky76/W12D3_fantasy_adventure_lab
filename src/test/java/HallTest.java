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

    Forest forest1;
    Forest forest2;
    Forest forest3;

    Key key1;
    Key key2;
    Key key3;

    Door door1;
    Door door2;
    Door door3;

    Dragon dragon;
    Treasure treasure;

    @Before
    public void before() {
        hall = new Hall(3,4);
        forest1 = new Forest(3, 5);
        forest2 = new Forest(4, 5);
        forest3 = new Forest(2, 3);

        key1 = new Key(Material.WOOD);
        key2 = new Key(Material.IRON);
        key3 = new Key(Material.STEEL);

        door1 = new Door(Material.WOOD, key1, false, false);
        door2 = new Door(Material.WOOD, key2, false, false);
        door3 = new Door(Material.WOOD, key3, false, false);

        dragon = new Dragon(100);
        treasure = new Treasure(Gemstone.RUBY, Clarity.NORMAL);
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
        hall.addExit(Direction.EAST, door1);
        assertEquals(1, hall.getExits().size());
    }

    @Test
    public void canRemoveExit() {
        hall.addExit(Direction.EAST, door1);
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
        Map.createLink(hall, forest1, door1);
        assertEquals(1, hall.getExits().size());
    }

    @Test
    public void canBreakLinkToAnotherRoom() {
        Map.createLink(hall, forest1, door1);
        Map.breakLink(hall, forest1);
        assertEquals(0, hall.getExits().size());
    }

    @Test
    public void canBeCleared() {
        dragon.takeDamage(100);
        assertEquals(true, hall.isCleared());
    }

}
