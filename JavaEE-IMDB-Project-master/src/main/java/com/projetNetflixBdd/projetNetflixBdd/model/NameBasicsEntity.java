package com.projetNetflixBdd.projetNetflixBdd.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "name_basics", schema = "imdb", catalog = "")
public class NameBasicsEntity {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer _id;

    private String nconst;
    private String primary_name;
    private String birth_year;
    private String death_year;
    private String primary_profession;
    private String known_for_titles;

    public NameBasicsEntity(String nconst, String primary_name, String birth_year, String death_year, String primary_profession, String known_for_titles) {
        this.nconst = nconst;
        this.primary_name = primary_name;
        this.birth_year = birth_year;
        this.death_year = death_year;
        this.primary_profession = primary_profession;
        this.known_for_titles = known_for_titles;
    }

    public NameBasicsEntity() {
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
    @Column(name = "primary_name")
    public String getPrimary_name() {
        return primary_name;
    }

    public void setPrimary_name(String primary_name) {
        this.primary_name = primary_name;
    }

    @Basic
    @Column(name = "birth_year")
    public String getBirth_year() {
        return birth_year;
    }

    public void setBirth_year(String birth_year) {
        this.birth_year = birth_year;
    }

    @Basic
    @Column(name = "death_year")
    public String getDeath_year() {
        return death_year;
    }

    public void setDeathYear(String death_year) {
        this.death_year = death_year;
    }

    @Basic
    @Column(name = "primary_profession")
    public String getPrimary_profession() {
        return primary_profession;
    }

    public void setPrimary_profession(String primary_profession) {
        this.primary_profession = primary_profession;
    }

    @Basic
    @Column(name = "known_for_titles")
    public String getKnown_for_titles() {
        return known_for_titles;
    }

    public void setKnown_for_titles(String known_for_titles) {
        this.known_for_titles = known_for_titles;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NameBasicsEntity that = (NameBasicsEntity) o;
        return Objects.equals(_id, that._id) &&
                Objects.equals(nconst, that.nconst) &&
                Objects.equals(primary_name, that.primary_name) &&
                Objects.equals(birth_year, that.birth_year) &&
                Objects.equals(death_year, that.death_year) &&
                Objects.equals(primary_profession, that.primary_profession) &&
                Objects.equals(known_for_titles, that.known_for_titles);
    }

    @Override
    public int hashCode() {

        return Objects.hash(_id, nconst, primary_name, birth_year, death_year, primary_profession, known_for_titles);
    }
}
