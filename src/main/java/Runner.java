import being.Human;
import being.Nature;
import room.Hall;

public class Runner {

    public static void main(String[] args) {

        Game game = new Game();
        Human character = new Human("Dave", 100, Nature.GOOD);
        Player player = new Player(character);
        Hall room1 = new Hall();

        game.addPlayer(player);
        game.addRoom(room1);


    }
}
