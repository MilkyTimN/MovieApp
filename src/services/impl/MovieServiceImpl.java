package services.impl;

import models.dto.MainMovieDTO;
import models.entity.Movie;
import repository.MovieRepository;
import services.MovieService;

import java.util.ArrayList;
import java.util.List;

public class MovieServiceImpl implements MovieService {

    private MovieRepository repository = new MovieRepository();

    @Override
    public List<MainMovieDTO> getAllMainPage() {

        List<MainMovieDTO> response = new ArrayList<>();

        for (Movie movie : getAll()) {

            MainMovieDTO item = new MainMovieDTO();

            item.setId(movie.getId());
            item.setCoverUrl(movie.getCoverUrl());
            item.setRating(movie.getRating());
            item.setTitle(movie.getTitle());
            item.setReleaseDate(movie.getReleaseDate());

            response.add(item);
        }
        return response;
    }

    @Override
    public List<Movie> getAll() {
        return repository.findAll();
    }

    @Override
    public void save(Movie movie) {
        repository.save(movie);
    }
}
