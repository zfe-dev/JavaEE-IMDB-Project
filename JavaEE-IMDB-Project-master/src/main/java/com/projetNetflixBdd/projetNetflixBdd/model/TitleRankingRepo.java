package com.projetNetflixBdd.projetNetflixBdd.model;
import org.springframework.data.repository.Repository;

public interface TitleRankingRepo extends Repository<NameBasicsEntity,Integer> {
    void save(TitleRatingsEntity titleRatingsEntity);
}
