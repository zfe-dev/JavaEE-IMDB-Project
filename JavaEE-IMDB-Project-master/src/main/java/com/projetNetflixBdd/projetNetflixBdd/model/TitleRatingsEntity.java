package com.projetNetflixBdd.projetNetflixBdd.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "title_ratings", schema = "imdb", catalog = "")
public class TitleRatingsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer _id;

    private String tconst;
    private String averageRating;
    private String numVotes;

    public TitleRatingsEntity(String tconst, String averageRating, String numVotes) {
        this.tconst = tconst;
        this.averageRating = averageRating;
        this.numVotes = numVotes;
    }

    public TitleRatingsEntity() {
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
    @Column(name = "averageRating")
    public String getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(String averageRating) {
        this.averageRating = averageRating;
    }

    @Basic
    @Column(name = "numVotes")
    public String getNumVotes() {
        return numVotes;
    }

    public void setNumVotes(String numVotes) {
        this.numVotes = numVotes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TitleRatingsEntity that = (TitleRatingsEntity) o;
        return Objects.equals(_id, that._id) &&
                Objects.equals(tconst, that.tconst) &&
                Objects.equals(averageRating, that.averageRating) &&
                Objects.equals(numVotes, that.numVotes);
    }

    @Override
    public int hashCode() {

        return Objects.hash(_id, tconst, averageRating, numVotes);
    }
}
