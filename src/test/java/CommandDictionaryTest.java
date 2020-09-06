import command.CommandDictionary;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CommandDictionaryTest {

    CommandDictionary commandDictionary = CommandDictionary.getInstance();

    @Test
    public void canGetCommands() {
        assertEquals("ATTACK\nDROP\nGO\nHELP\nLOOK\nOPEN\nPICKUP\nUNLOCK\n", commandDictionary.getCommands());
    }
}
