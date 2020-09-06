package command;

public class Help extends Command {

    public Help(){}

    public void enact() {
        System.out.println(CommandDictionary.getInstance().getCommands());
    }
}
