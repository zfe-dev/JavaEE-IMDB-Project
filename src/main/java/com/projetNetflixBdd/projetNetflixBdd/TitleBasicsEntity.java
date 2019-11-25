package com.projetNetflixBdd.projetNetflixBdd;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "title_basics", schema = "imdb", catalog = "")
public class TitleBasicsEntity {
    private Integer id;
    private String tconst;
    private String titleType;
    private String primaryTitle;
    private String originalTitle;
    private String isAdult;
    private String startYear;
    private String endYear;
    private String runtimeMinutes;
    private String genres;

    @Id
    @GeneratedValue
    @Column(name = "_id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "tconst")
    public String getTconst() {
        return tconst;
    }

    public void setTconst(String tconst) {
        this.tconst = tconst;
    }

    @Basic
    @Column(name = "titleType")
    public String getTitleType() {
        return titleType;
    }

    public void setTitleType(String titleType) {
        this.titleType = titleType;
    }

    @Basic
    @Column(name = "primaryTitle")
    public String getPrimaryTitle() {
        return primaryTitle;
    }

    public void setPrimaryTitle(String primaryTitle) {
        this.primaryTitle = primaryTitle;
    }

    @Basic
    @Column(name = "originalTitle")
    public String getOriginalTitle() {
        return originalTitle;
    }

    public void setOriginalTitle(String originalTitle) {
        this.originalTitle = originalTitle;
    }

    @Basic
    @Column(name = "isAdult")
    public String getIsAdult() {
        return isAdult;
    }

    public void setIsAdult(String isAdult) {
        this.isAdult = isAdult;
    }

    @Basic
    @Column(name = "startYear")
    public String getStartYear() {
        return startYear;
    }

    public void setStartYear(String startYear) {
        this.startYear = startYear;
    }

    @Basic
    @Column(name = "endYear")
    public String getEndYear() {
        return endYear;
    }

    public void setEndYear(String endYear) {
        this.endYear = endYear;
    }

    @Basic
    @Column(name = "runtimeMinutes")
    public String getRuntimeMinutes() {
        return runtimeMinutes;
    }

    public void setRuntimeMinutes(String runtimeMinutes) {
        this.runtimeMinutes = runtimeMinutes;
    }

    @Basic
    @Column(name = "genres")
    public String getGenres() {
        return genres;
    }

    public void setGenres(String genres) {
        this.genres = genres;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TitleBasicsEntity that = (TitleBasicsEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(tconst, that.tconst) &&
                Objects.equals(titleType, that.titleType) &&
                Objects.equals(primaryTitle, that.primaryTitle) &&
                Objects.equals(originalTitle, that.originalTitle) &&
                Objects.equals(isAdult, that.isAdult) &&
                Objects.equals(startYear, that.startYear) &&
                Objects.equals(endYear, that.endYear) &&
                Objects.equals(runtimeMinutes, that.runtimeMinutes) &&
                Objects.equals(genres, that.genres);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, tconst, titleType, primaryTitle, originalTitle, isAdult, startYear, endYear, runtimeMinutes, genres);
    }
}
