import being.Human;
import being.Nature;
import item.Key;
import item.Material;
import map.Map;
import portal.Door;
import room.Forest;
import room.Hall;
import room.Room;

public class Runner {

    public static void main(String[] args) {

        Game game = new Game();
        GameplayManager gameplay = new GameplayManager();

        Human character = new Human("Dave", 100, Nature.GOOD);
        Player player = new Player(character);

        Hall room1 = new Hall(0,0);
        Forest forest1 = new Forest(0, 1);
        Forest forest2 = new Forest(1,0);

        Key key1 = new Key(Material.IRON);
        Key key2 = new Key(Material.IRON);

        Door door1 = new Door(Material.WOOD);
        Door door2 = new Door(Material.WOOD);

        Room[] rooms = {room1, forest1, forest2};

        game.addPlayer(player);
        for (Room r: rooms) {
            game.addRoom(r);
        }
        Map.createLink(room1, forest1, door1);
        Map.createLink(room1, forest2, door2);

        System.out.println(room1.getDescription());

    }
}
