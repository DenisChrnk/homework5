package homework5;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {

        List<String> toDoList = new ArrayList<>();

        toDoList.add("Погулять с собакой");
        toDoList.add("Сходить в магазин");
        toDoList.add("Приготовить обед");
        toDoList.add("Почитать книгу");
        toDoList.add("Убраться в квартире");


        for (int i = 0; i < toDoList.size(); i++) {
            System.out.println("Задача " + (i + 1) + ": " + toDoList.get(i));
        }
    }
}
