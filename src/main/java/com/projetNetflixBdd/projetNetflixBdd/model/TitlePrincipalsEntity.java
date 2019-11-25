package com.projetNetflixBdd.projetNetflixBdd.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "title_principals", schema = "imdb", catalog = "")
public class TitlePrincipalsEntity {
    private Integer id;
    private String tconst;
    private String ordering;
    private String nconst;
    private String category;
    private String job;
    private String characters;

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
    @Column(name = "ordering")
    public String getOrdering() {
        return ordering;
    }

    public void setOrdering(String ordering) {
        this.ordering = ordering;
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
    @Column(name = "category")
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Basic
    @Column(name = "job")
    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Basic
    @Column(name = "characters")
    public String getCharacters() {
        return characters;
    }

    public void setCharacters(String characters) {
        this.characters = characters;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TitlePrincipalsEntity that = (TitlePrincipalsEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(tconst, that.tconst) &&
                Objects.equals(ordering, that.ordering) &&
                Objects.equals(nconst, that.nconst) &&
                Objects.equals(category, that.category) &&
                Objects.equals(job, that.job) &&
                Objects.equals(characters, that.characters);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, tconst, ordering, nconst, category, job, characters);
    }
}
