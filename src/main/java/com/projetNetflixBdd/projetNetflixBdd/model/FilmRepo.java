package com.projetNetflixBdd.projetNetflixBdd.model;

import org.springframework.data.repository.Repository;

public interface FilmRepo extends Repository<NameBasicsEntity,Integer> {
    void save(NameBasicsEntity nameBasicsEntity);
}