package lesson13;

import java.util.*;

public class MovieCompareExample {
    public static void main(String[] args) {

        List<Movie> list = new ArrayList<>();
        list.add(new Movie("A film", 2.4));
        list.add(new Movie("B film", 2.1));
        list.add(new Movie("C film", 3.1));
        list.add(new Movie("D film", 5.1));
        list.add(new Movie("E film", 6.1));
        // list.add(.....)
        Collections.sort(list, new MovieTitlesComparator());
        System.out.println(list);

        Set<Movie> moviesSet = new TreeSet<>(); // TreeSet по умолчанию сортирует с помощью метода compareTo
        moviesSet.add(new Movie("Z film", 2.4));
        moviesSet.add(new Movie("B film", 2.1));
        System.out.println(moviesSet);


    }

    @Override
    public String toString() {
        return "MovieCompareExample{}";
    }




}
