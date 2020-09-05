import command.Look;
import org.junit.Before;
import org.junit.Test;
import room.Hall;

import static org.junit.Assert.assertEquals;

public class LookTest {

    Look command;
    Hall hall;

    @Before
    public void before() {
        hall = new Hall(0,0);
        command = new Look(hall);
    }

//    @Test
//    public void canBeEnacted() {
//        assertEquals("You are in a hall.", command.enact());
//    }

}
