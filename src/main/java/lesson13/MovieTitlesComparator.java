package lesson13;

import java.util.Comparator;

public class MovieTitlesComparator implements Comparator<Movie> {
    @Override
    public int compare(Movie m1, Movie m2) {
        return m1.title.compareTo(m2.title);
    }
}

