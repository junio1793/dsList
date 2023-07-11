package com.intensivoJava.dslist.DTO;

import com.intensivoJava.dslist.entities.Game;
import jakarta.persistence.Column;

public class GameMinDTO {


    private Long id;
    private String title;

    private Integer year;
    private String genre;
    private Double score;

    private String shortDescription;

    public GameMinDTO(Game entity) {
        id = entity.getId();
        title = entity.getTitle();
        year = entity.getYear();
        genre = entity.getGenre();
        score = entity.getScore();
        shortDescription = entity.getShortDescription();
    }
    public GameMinDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }
}
