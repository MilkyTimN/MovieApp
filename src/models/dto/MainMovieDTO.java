package models.dto;

import java.time.LocalDate;

public class MainMovieDTO {
    private Long id;
    private String coverUrl;
    private String title;
    private Double rating;
    private LocalDate releaseDate;

    public MainMovieDTO(Long id, String coverUrl, String title, Double rating, LocalDate releaseDate) {
        this.id = id;
        this.coverUrl = coverUrl;
        this.title = title;
        this.rating = rating;
        this.releaseDate = releaseDate;
    }

    public MainMovieDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCoverUrl() {
        return coverUrl;
    }

    public void setCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString() {
        return "MainMovieDto{" +
                "id=" + id +
                ", coverUrl='" + coverUrl + '\'' +
                ", title='" + title + '\'' +
                ", rating=" + rating +
                ", releaseDate=" + releaseDate +
                '}';
    }
}
