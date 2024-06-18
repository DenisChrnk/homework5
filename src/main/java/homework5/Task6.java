package homework5;

import java.util.*;

public class Task6 {

    static Map<Player, Integer> point = new HashMap<>();

    public static void addPoints(int id, Integer points) {
        Set<Player> keys = point.keySet();
        for (Player player : keys) {
            if (player.getId() == id) {
                point.put(player, points);
            }
        }
    }

    public static void main(String[] args) {


        point.put(new Player(1, "A", true), 0);
        point.put(new Player(2, "B", false), 0);
        point.put(new Player(3, "C", true), 0);
        point.put(new Player(4, "D", false), 0);
        point.put(new Player(5, "E", true), 0);
        point.put(new Player(6, "F", true), 0);
        point.put(new Player(7, "G", false), 0);
        point.put(new Player(8, "H", true), 0);
        point.put(new Player(9, "I", false), 0);
        point.put(new Player(10, "J", true), 0);

        addPoints(4, 10);
        addPoints(7, 12);
        addPoints(8, 11);
        addPoints(9, 13);
        addPoints(10, 5);

        printValues(point);

    }

    public static void printValues(Map<Player, Integer> map) {
        List<Map.Entry<Player, Integer>> topPlayers =
                map.entrySet().stream()
                        .sorted(Map.Entry.<Player, Integer>comparingByValue().reversed()).limit(3).toList();
        for (Map.Entry<Player, Integer> res : topPlayers) {
            System.out.println(res);
        }
    }
}
