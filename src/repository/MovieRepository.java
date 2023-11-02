package repository;

import models.entity.Movie;
import models.enums.Status;

import java.util.ArrayList;
import java.util.List;

public class MovieRepository {

    private List<Movie> db = new ArrayList<>();

    public void save(Movie movie) {
        db.add(movie);
    }

    public List<Movie> findAll() {
        List<Movie> activeMovies = new ArrayList<>();
        for (Movie movie : db) {
            if (movie.getStatus().equals(Status.ACTIVE)) {
                activeMovies.add(movie);
            }
        }
        return activeMovies;
    }
}
