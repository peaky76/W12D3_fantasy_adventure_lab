package command;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import static helper.Helper.stringifyArrayList;

public class CommandDictionary {

    private static CommandDictionary instance = new CommandDictionary();

    private HashMap<String, Class> dictionary = new HashMap<String, Class>();

    private CommandDictionary() {
        dictionary.put("ATTACK", Attack.class);
        dictionary.put("DROP", Drop.class);
        dictionary.put("GO", Go.class);
        dictionary.put("HELP", Help.class);
        dictionary.put("LOOK", Look.class);
        dictionary.put("OPEN", Open.class);
        dictionary.put("PICKUP", PickUp.class);
        dictionary.put("UNLOCK", Unlock.class);
    }

    public static CommandDictionary getInstance(){
        return instance;
    }

    public String getCommands() {
        ArrayList<String> commands = new ArrayList<>(dictionary.keySet());
        Collections.sort(commands);
        return stringifyArrayList(commands);
    }

}
