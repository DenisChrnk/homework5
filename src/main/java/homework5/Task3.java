package homework5;

import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {

        List<Movie> films = new ArrayList<>();

        films.add(new Movie("Индиана Джонс", 8.0, "Приключения", "США", true));
        films.add(new Movie("Евротур", 7.6, "Комедия", "США", false));
        films.add(new Movie("Властелин колец", 8.6, "Приключения", "Новая Зеландия", true));

        System.out.println(films.get(1));
    }
}
