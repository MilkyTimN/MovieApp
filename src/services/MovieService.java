package services;

import models.dto.MainMovieDTO;
import models.entity.Movie;
import models.enums.GenreEnum;

import java.util.List;

public interface MovieService {

    List<MainMovieDTO> getAllMainPage();

    List<Movie> getAll();

    void save(Movie movie);

    Movie getById(Long id);

    List<MainMovieDTO> getMoviesByGenre(GenreEnum genre);


}
