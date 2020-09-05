import being.Human;
import being.Nature;
import room.Hall;

public class Runner {

    public static void main(String[] args) {

        Game game = new Game();
        GameplayManager gameplay = new GameplayManager();

        Human character = new Human("Dave", 100, Nature.GOOD);
        Player player = new Player(character);
        Hall room1 = new Hall(0,0);

        game.addPlayer(player);
        game.addRoom(room1);

//        gameplay.getCommand();

    }
}