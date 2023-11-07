package controllers;

import models.dto.MainMovieDTO;
import models.entity.Movie;
import models.enums.GenreEnum;
import services.MovieService;
import services.impl.MovieServiceImpl;

import java.util.List;

public class MovieController {

    private MovieService service = new MovieServiceImpl();

    public List<MainMovieDTO> getAllMainPage(){
        return service.getAllMainPage();
    }

    public List<Movie> getAll() {
        return service.getAll();
    }

    public void save(Movie movie){
        service.save(movie);
    }

    public Movie getById(Long id) {
        return service.getById(id);
    }

    public List<MainMovieDTO> getMoviesByGenre(GenreEnum genre){
        return service.getMoviesByGenre(genre);
    }



}

