package homework5;

import java.util.ArrayList;
import java.util.Objects;


public class Company {

    private String name;
    private int yearOfFoundation;
    private ArrayList<String> listFilms;

    public Company(String name, int yearOfFoundation, ArrayList<String> listFilms) {
        this.name = name;
        this.yearOfFoundation = yearOfFoundation;
        this.listFilms = listFilms;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return yearOfFoundation == company.yearOfFoundation && Objects.equals(name, company.name) && Objects.equals(listFilms, company.listFilms);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, yearOfFoundation, listFilms);
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", yearOfFoundation=" + yearOfFoundation +
                ", listFilms=" + listFilms +
                '}';
    }

    public String getList() {
        String films = listFilms.toString().replace("[", "").replace("]", "");
        return this.name + ": " + films;
    }
}
