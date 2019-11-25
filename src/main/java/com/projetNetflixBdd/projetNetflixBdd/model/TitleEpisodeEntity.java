package com.projetNetflixBdd.projetNetflixBdd.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "title_episode", schema = "imdb", catalog = "")
public class TitleEpisodeEntity {
    private Integer id;
    private String tconst;
    private String parentTconst;
    private String seasonNumber;
    private String episodeNumber;

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
    @Column(name = "parentTconst")
    public String getParentTconst() {
        return parentTconst;
    }

    public void setParentTconst(String parentTconst) {
        this.parentTconst = parentTconst;
    }

    @Basic
    @Column(name = "seasonNumber")
    public String getSeasonNumber() {
        return seasonNumber;
    }

    public void setSeasonNumber(String seasonNumber) {
        this.seasonNumber = seasonNumber;
    }

    @Basic
    @Column(name = "episodeNumber")
    public String getEpisodeNumber() {
        return episodeNumber;
    }

    public void setEpisodeNumber(String episodeNumber) {
        this.episodeNumber = episodeNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TitleEpisodeEntity that = (TitleEpisodeEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(tconst, that.tconst) &&
                Objects.equals(parentTconst, that.parentTconst) &&
                Objects.equals(seasonNumber, that.seasonNumber) &&
                Objects.equals(episodeNumber, that.episodeNumber);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, tconst, parentTconst, seasonNumber, episodeNumber);
    }
}
