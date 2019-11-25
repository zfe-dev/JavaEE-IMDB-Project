package com.projetNetflixBdd.projetNetflixBdd;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "title_crew", schema = "imdb", catalog = "")
public class TitleCrewEntity {
    private Integer id;
    private String tconst;
    private String directors;
    private String writers;

    @Id
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
    @Column(name = "directors")
    public String getDirectors() {
        return directors;
    }

    public void setDirectors(String directors) {
        this.directors = directors;
    }

    @Basic
    @Column(name = "writers")
    public String getWriters() {
        return writers;
    }

    public void setWriters(String writers) {
        this.writers = writers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TitleCrewEntity that = (TitleCrewEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(tconst, that.tconst) &&
                Objects.equals(directors, that.directors) &&
                Objects.equals(writers, that.writers);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, tconst, directors, writers);
    }
}
