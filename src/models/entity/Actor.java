package models.entity;

import models.enums.CountryEnum;
import models.enums.Status;
import models.enums.ZodiacSignEnum;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class Actor extends BaseEntity{
    private String name;
    private String lastName;
    private LocalDate birthDate;
    private ZodiacSignEnum zodiac;
    private CountryEnum nationality;
    private List<Movie> movies;
    private String bio;

    public Actor(Long id, LocalDateTime createdDate, LocalDateTime updatedDate, Status status, String name, String lastName, LocalDate birthDate, ZodiacSignEnum zodiac, CountryEnum nationality, List<Movie> movies, String bio) {
        super(id, createdDate, updatedDate, status);
        this.name = name;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.zodiac = zodiac;
        this.nationality = nationality;
        this.movies = movies;
        this.bio = bio;
    }

    public Actor() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public ZodiacSignEnum getZodiac() {
        return zodiac;
    }

    public void setZodiac(ZodiacSignEnum zodiac) {
        this.zodiac = zodiac;
    }

    public CountryEnum getNationality() {
        return nationality;
    }

    public void setNationality(CountryEnum nationality) {
        this.nationality = nationality;
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate=" + birthDate +
                ", zodiac=" + zodiac +
                ", nationality=" + nationality +
                ", movies=" + movies +
                ", bio='" + bio + '\'' +
                '}';
    }
}
