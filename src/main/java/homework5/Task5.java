package homework5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {

    static List<Player> playersStorage = new ArrayList<>();

    public static void addToStorage(Player player) {
        if (!playersStorage.contains(player)) {
            playersStorage.add(player);
        }
    }

    public static void main(String[] args) {

        addToStorage(new Player(1, "A", true));
        addToStorage(new Player(2, "B", false));
        addToStorage(new Player(3, "C", false));
        addToStorage(new Player(4, "D", true));
        addToStorage(new Player(5, "E", true));
        addToStorage(new Player(6, "F", false));
        addToStorage(new Player(7, "G", true));
        addToStorage(new Player(8, "H", true));
        addToStorage(new Player(9, "I", false));
        addToStorage(new Player(10, "J", true));
        addToStorage(new Player(10, "J", true));


        System.out.println(playersStorage);
    }

}
