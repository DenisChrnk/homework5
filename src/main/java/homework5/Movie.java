package homework5;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Movie {

    private String name;
    private double rating;
    private String genre;
    private String country;
    private boolean doesOscarHave;

    public Movie(String name, double rating, String genre, String country, boolean doesOscarHave) {
        this.name = name;
        this.rating = rating;
        this.genre = genre;
        this.country = country;
        this.doesOscarHave = doesOscarHave;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return Double.compare(rating, movie.rating) == 0 && doesOscarHave == movie.doesOscarHave && Objects.equals(name, movie.name) && Objects.equals(genre, movie.genre) && Objects.equals(country, movie.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, rating, genre, country, doesOscarHave);
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", rating=" + rating +
                ", genre='" + genre + '\'' +
                ", country='" + country + '\'' +
                ", doesOscarHave=" + doesOscarHave +
                '}';
    }
}

