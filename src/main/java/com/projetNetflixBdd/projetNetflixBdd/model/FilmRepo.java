package com.projetNetflixBdd.projetNetflixBdd.model;

import com.projetNetflixBdd.projetNetflixBdd.model.NameBasicsEntity;
import org.springframework.data.repository.Repository;

public interface FilmRepo extends Repository<NameBasicsEntity,Integer> {
    void save(NameBasicsEntity nameBasicsEntity);
}