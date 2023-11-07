package services.impl;

import exceptions.EntityNotFoundException;
import models.dto.MainMovieDTO;
import models.entity.Movie;
import models.enums.GenreEnum;
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
            item.setGenres(movie.getGenres());

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

    @Override
    public Movie getById(Long id) {
        try {
            return repository.findById(id);
        } catch (EntityNotFoundException e) {
            System.out.println(e.getMessage());
        }

        return null;
    }

    @Override
    public List<MainMovieDTO> getMoviesByGenre(GenreEnum genre) {
        List<MainMovieDTO> listFromDB = getAllMainPage();

        List<MainMovieDTO> responseList = new ArrayList<>();

        for (MainMovieDTO item : listFromDB) {
            if (item.getGenres().contains(genre)) {
                responseList.add(item);
            }
        }
        return responseList;
    }
}
