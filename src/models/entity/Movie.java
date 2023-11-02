package models.entity;

import models.enums.CountryEnum;
import models.enums.GenreEnum;
import models.enums.Status;
import models.enums.VoiceActingEnum;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

public class Movie extends BaseEntity{

    private String title;
    private LocalDate releaseDate;
    private List<CountryEnum> country;
    private List<GenreEnum> genres;
    private String duration;
    private List<VoiceActingEnum> voiceActing;
    private List<Actor> actors;
    private String description;
    private String about;
    private Double rating;
    private String coverUrl;

    public Movie(Long id, LocalDateTime createdDate, LocalDateTime updatedDate, Status status, String title, LocalDate releaseDate, List<CountryEnum> country, List<GenreEnum> genres, String duration, List<VoiceActingEnum> voiceActing, List<Actor> actors, String description, String about, Double rating, String coverUrl) {
        super(id, createdDate, updatedDate, status);
        this.title = title;
        this.releaseDate = releaseDate;
        this.country = country;
        this.genres = genres;
        this.duration = duration;
        this.voiceActing = voiceActing;
        this.actors = actors;
        this.description = description;
        this.about = about;
        this.rating = rating;
        this.coverUrl = coverUrl;
    }

    public Movie() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public List<CountryEnum> getCountry() {
        return country;
    }

    public void setCountry(List<CountryEnum> country) {
        this.country = country;
    }

    public List<GenreEnum> getGenres() {
        return genres;
    }

    public void setGenres(List<GenreEnum> genres) {
        this.genres = genres;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public List<VoiceActingEnum> getVoiceActing() {
        return voiceActing;
    }

    public void setVoiceActing(List<VoiceActingEnum> voiceActing) {
        this.voiceActing = voiceActing;
    }

    public List<Actor> getActors() {
        return actors;
    }

    public void setActors(List<Actor> actors) {
        this.actors = actors;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public String getCoverUrl() {
        return coverUrl;
    }

    public void setCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", releaseDate=" + releaseDate +
                ", country=" + country +
                ", genres=" + genres +
                ", duration='" + duration + '\'' +
                ", voiceActing=" + voiceActing +
                ", actors=" + actors +
                ", description='" + description + '\'' +
                ", about='" + about + '\'' +
                ", rating=" + rating +
                ", coverUrl='" + coverUrl + '\'' +
                '}';
    }
}
