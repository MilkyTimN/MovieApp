import models.entity.Movie;
import models.enums.CountryEnum;
import models.enums.GenreEnum;
import models.enums.Status;
import models.enums.VoiceActingEnum;
import services.MovieService;
import services.impl.MovieServiceImpl;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<CountryEnum> countryEnums = new ArrayList<>();
        countryEnums.add(CountryEnum.UK);
        countryEnums.add(CountryEnum.USA);

        List<GenreEnum> genres = new ArrayList<>();
        genres.add(GenreEnum.ACTION);

        List<VoiceActingEnum> voice = new ArrayList<>();
        voice.add(VoiceActingEnum.ORIGINAL);


        Movie movie = new Movie(
                0L,
                LocalDateTime.now(),
                LocalDateTime.now(),
                Status.ACTIVE,
                "Оппенгеймер",
                LocalDate.of(2023, 01, 01),
                countryEnums,
                genres,
                "3:00",
                voice,
                null,
                "desc",
                "about",
                8.0,
                "url"
        );

        Movie movie1 = new Movie(
                1L,
                LocalDateTime.now(),
                LocalDateTime.now(),
                Status.ACTIVE,
                "OOOOOOO",
                LocalDate.of(2023, 01, 01),
                countryEnums,
                genres,
                "3:00",
                voice,
                null,
                "desc",
                "about",
                7.0,
                "url"
        );

        MovieService service = new MovieServiceImpl();
        service.save(movie);
        service.save(movie1);

        System.out.println(service.getAll());

        System.out.println(service.getAllMainPage());


    }
}