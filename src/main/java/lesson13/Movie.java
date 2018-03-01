package lesson13;

public class Movie implements Comparable<Movie> {

    public String title;
    public double score;
    public Movie(String title, double score){ //конструктор
        this.title = title;
        this.score = score;
    }

    @Override
    public int compareTo(Movie m) {
        return (score < m.score) ? -1 : ((score == m.score) ? 0 : 1);
    }
}
