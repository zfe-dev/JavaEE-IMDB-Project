package com.projetNetflixBdd.projetNetflixBdd.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "title_basics", schema = "imdb", catalog = "")
public class TitleBasicsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer _id;
    private String tconst;
    private String title_type;
    private String primary_title;
    private String original_title;
    private String is_adult;
    private String start_year;
    private String end_year;
    private String runtime_minutes;
    private String genres;

    public TitleBasicsEntity(String tconst, String title_type, String primary_title, String original_title, String is_adult, String start_year, String end_year, String runtime_minutes, String genres) {
        this.tconst = tconst;
        this.title_type = title_type;
        this.primary_title = primary_title;
        this.original_title = original_title;
        this.is_adult = is_adult;
        this.start_year = start_year;
        this.end_year = end_year;
        this.runtime_minutes = runtime_minutes;
        this.genres = genres;
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
    @Column(name = "title_type")
    public String getTitle_type() {
        return title_type;
    }

    public void setTitle_type(String title_type) {
        this.title_type = title_type;
    }

    @Basic
    @Column(name = "primary_title")
    public String getPrimary_title() {
        return primary_title;
    }

    public void setPrimary_title(String primary_title) {
        this.primary_title = primary_title;
    }

    @Basic
    @Column(name = "original_title")
    public String getOriginal_title() {
        return original_title;
    }

    public void setOriginal_title(String original_title) {
        this.original_title = original_title;
    }

    @Basic
    @Column(name = "is_adult")
    public String getIs_adult() {
        return is_adult;
    }

    public void setIs_adult(String is_adult) {
        this.is_adult = is_adult;
    }

    @Basic
    @Column(name = "start_year")
    public String getStart_year() {
        return start_year;
    }

    public void setStart_year(String start_year) {
        this.start_year = start_year;
    }

    @Basic
    @Column(name = "end_year")
    public String getEnd_year() {
        return end_year;
    }

    public void setEnd_year(String end_year) {
        this.end_year = end_year;
    }

    @Basic
    @Column(name = "runtime_minutes")
    public String getRuntime_minutes() {
        return runtime_minutes;
    }

    public void setRuntime_minutes(String runtime_minutes) {
        this.runtime_minutes = runtime_minutes;
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
        return Objects.equals(_id, that._id) &&
                Objects.equals(tconst, that.tconst) &&
                Objects.equals(title_type, that.title_type) &&
                Objects.equals(primary_title, that.primary_title) &&
                Objects.equals(original_title, that.original_title) &&
                Objects.equals(is_adult, that.is_adult) &&
                Objects.equals(start_year, that.start_year) &&
                Objects.equals(end_year, that.end_year) &&
                Objects.equals(runtime_minutes, that.runtime_minutes) &&
                Objects.equals(genres, that.genres);
    }

    @Override
    public int hashCode() {

        return Objects.hash(_id, tconst, title_type, primary_title, original_title, is_adult, start_year, end_year, runtime_minutes, genres);
    }
}
