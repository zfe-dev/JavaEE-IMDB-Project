package com.projetNetflixBdd.projetNetflixBdd.Controllers;

import com.projetNetflixBdd.projetNetflixBdd.model.TitleRankingRepo;
import com.projetNetflixBdd.projetNetflixBdd.model.TitleRatingsEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class FormulaireTitleRanking {

    @RequestMapping(value="/formulairetitleranking",method = RequestMethod.GET )
    public String viewHome(){
        return "formulairetitleranking";
    }

    private final TitleRankingRepo myTitleRepo;


    public FormulaireTitleRanking(TitleRankingRepo myTitleRepo) {
        this.myTitleRepo = myTitleRepo;
    }


    @GetMapping("/AjouterInfotitlerating")
    public String Ajouter(@RequestParam(name = "tconst", required = true) String tconst,
                          @RequestParam(name = "averageRating", required = true) String averageRating,
                          @RequestParam(name = "numVotes", required = true) String numVotes,
                          Model model)
    {
        TitleRatingsEntity T = new TitleRatingsEntity(tconst,averageRating,numVotes);
        myTitleRepo.save(T);
        return "AjouterInfotitlerating";
    }


    @Query("select * FROM title_ratings t LIMIT 10")
    @GetMapping("/affichetitleranking")
    public String A(){
        TitleRatingsEntity T = new TitleRatingsEntity();
        return "affichetitleranking";
    };

}
