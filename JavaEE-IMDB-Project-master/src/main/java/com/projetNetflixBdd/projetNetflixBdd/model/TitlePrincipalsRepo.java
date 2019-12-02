package com.projetNetflixBdd.projetNetflixBdd.model;

import org.springframework.data.repository.Repository;

public interface TitlePrincipalsRepo  extends Repository<NameBasicsEntity,Integer> {
    void save(TitlePrincipalsEntity titlePrincipalsEntity);
}
