package com.projetNetflixBdd.projetNetflixBdd.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "name_basics", schema = "imdb", catalog = "")
public class NameBasicsEntity {
    private Integer id;
    private String nconst;
    private String primaryName;
    private String birthYear;
    private String deathYear;
    private String primaryProfession;
    private String knownForTitles;

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
    @Column(name = "nconst")
    public String getNconst() {
        return nconst;
    }

    public void setNconst(String nconst) {
        this.nconst = nconst;
    }

    @Basic
    @Column(name = "primaryName")
    public String getPrimaryName() {
        return primaryName;
    }

    public void setPrimaryName(String primaryName) {
        this.primaryName = primaryName;
    }

    @Basic
    @Column(name = "birthYear")
    public String getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(String birthYear) {
        this.birthYear = birthYear;
    }

    @Basic
    @Column(name = "deathYear")
    public String getDeathYear() {
        return deathYear;
    }

    public void setDeathYear(String deathYear) {
        this.deathYear = deathYear;
    }

    @Basic
    @Column(name = "primaryProfession")
    public String getPrimaryProfession() {
        return primaryProfession;
    }

    public void setPrimaryProfession(String primaryProfession) {
        this.primaryProfession = primaryProfession;
    }

    @Basic
    @Column(name = "knownForTitles")
    public String getKnownForTitles() {
        return knownForTitles;
    }

    public void setKnownForTitles(String knownForTitles) {
        this.knownForTitles = knownForTitles;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NameBasicsEntity that = (NameBasicsEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(nconst, that.nconst) &&
                Objects.equals(primaryName, that.primaryName) &&
                Objects.equals(birthYear, that.birthYear) &&
                Objects.equals(deathYear, that.deathYear) &&
                Objects.equals(primaryProfession, that.primaryProfession) &&
                Objects.equals(knownForTitles, that.knownForTitles);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, nconst, primaryName, birthYear, deathYear, primaryProfession, knownForTitles);
    }
}
