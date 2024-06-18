package homework5;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {

        List<Company> companies = new ArrayList<>();

        companies.add(new Company("Ленфильм", 1912, new ArrayList<String>(){{add("Боба и слон"); add("В черных песках"); add("Гонщики");}}));
        companies.add(new Company("Мосфильм", 1923, new ArrayList<String>(){{add("Зигзаг"); add("Кадриль"); add("Звезда");}}));
        companies.add(new Company("20th Century Studios", 1935, new ArrayList<String>(){{add("Чужой"); add("Ледниковый период"); add("Аватар");}}));


        for (Company ret: companies) {
            System.out.println(ret.getList());
        }
    }
}
