package repository;

import exceptions.EntityNotFoundException;
import models.entity.Movie;
import models.enums.Status;

import java.sql.SQLOutput;
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

    public Movie findById(Long id) {
        try {
            if (db.get(Math.toIntExact(id)).getStatus().equals(Status.ACTIVE)) {
                return db.get(Math.toIntExact(id));
            } else {
                throw new EntityNotFoundException("Movie not found");
            }
        } catch (Exception e) {
            System.out.println("Illegal arguments");
        }

        return null;
    }
}
