package com.projetNetflixBdd.projetNetflixBdd.model;

import org.springframework.data.repository.Repository;

public interface TitleBasicsRepo  extends Repository<NameBasicsEntity,Integer> {
    void save(TitleBasicsEntity titleBasicsEntity);
}
