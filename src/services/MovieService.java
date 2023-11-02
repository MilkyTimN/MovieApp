package services;

import models.dto.MainMovieDTO;
import models.entity.Movie;

import java.util.List;

public interface MovieService {

    List<MainMovieDTO> getAllMainPage();

    List<Movie> getAll();

    void save(Movie movie);


}
