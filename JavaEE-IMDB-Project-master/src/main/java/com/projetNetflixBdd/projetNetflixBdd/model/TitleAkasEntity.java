package com.projetNetflixBdd.projetNetflixBdd.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "title_akas", schema = "imdb", catalog = "")
public class TitleAkasEntity {
    private Integer id;
    private String titleId;
    private String ordering;
    private String title;
    private String region;
    private String language;
    private String types;
    private String attributes;
    private String isOriginalTitle;

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
    @Column(name = "titleId")
    public String getTitleId() {
        return titleId;
    }

    public void setTitleId(String titleId) {
        this.titleId = titleId;
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
    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "region")
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Basic
    @Column(name = "language")
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Basic
    @Column(name = "types")
    public String getTypes() {
        return types;
    }

    public void setTypes(String types) {
        this.types = types;
    }

    @Basic
    @Column(name = "attributes")
    public String getAttributes() {
        return attributes;
    }

    public void setAttributes(String attributes) {
        this.attributes = attributes;
    }

    @Basic
    @Column(name = "isOriginalTitle")
    public String getIsOriginalTitle() {
        return isOriginalTitle;
    }

    public void setIsOriginalTitle(String isOriginalTitle) {
        this.isOriginalTitle = isOriginalTitle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TitleAkasEntity that = (TitleAkasEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(titleId, that.titleId) &&
                Objects.equals(ordering, that.ordering) &&
                Objects.equals(title, that.title) &&
                Objects.equals(region, that.region) &&
                Objects.equals(language, that.language) &&
                Objects.equals(types, that.types) &&
                Objects.equals(attributes, that.attributes) &&
                Objects.equals(isOriginalTitle, that.isOriginalTitle);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, titleId, ordering, title, region, language, types, attributes, isOriginalTitle);
    }
}
