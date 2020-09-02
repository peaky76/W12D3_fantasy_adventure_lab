import character.Dragon;
import character.Wizard;
import equipment.Item;
import equipment.ItemType;
import equipment.Spell;
import equipment.SpellType;
import org.junit.Before;
import org.junit.Test;
import room.Room;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    Room room;
    Dragon dragon;
    Item treasure;
    Wizard wizard;
    Spell superSpell;

    @Before
    public void before() {
        room = new Room();
        dragon = new Dragon("Flamebreath", 100, 10, false);
        treasure = new Item("Golden Amulet", ItemType.TREASURE);
        wizard = new Wizard("Merlin", 50, 10, true);
        superSpell = new Spell("Exterminate", SpellType.ATTACKING, 100);
    }

    @Test
    public void newRoomStartsWithNoInhabitants() {
        assertEquals(0, room.getInhabitants().size());
    }

    @Test
    public void newRoomStartsWithNoContents() {
        assertEquals(0, room.getContents().size());
    }

    @Test
    public void canAddInhabitant() {
        room.addInhabitant(dragon);
        assertEquals(1, room.getInhabitants().size());
    }

    @Test
    public void canAddContent() {
        room.addContent(treasure);
        assertEquals(1, room.getContents().size());
    }

    @Test
    public void canBeCleared() {
        room.addInhabitant(dragon);
        wizard.pickUp(superSpell);
        wizard.equip(superSpell);
        wizard.castSpell(dragon);
        assertEquals(true, room.isCleared());
    }

}
