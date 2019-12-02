package com.projetNetflixBdd.projetNetflixBdd.Controllers;

import com.projetNetflixBdd.projetNetflixBdd.model.TitlePrincipalsEntity;
import com.projetNetflixBdd.projetNetflixBdd.model.TitlePrincipalsRepo;
import com.projetNetflixBdd.projetNetflixBdd.model.TitleRatingsEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormulaireTitlePrincipals {
    @RequestMapping(value="/formulairetitleprincipals",method = RequestMethod.GET)
    public String viewHome(){
        return "formulairetitleprincipals";
    }

    private final TitlePrincipalsRepo myPrincipalsRepo;

    public FormulaireTitlePrincipals(TitlePrincipalsRepo myPrincipalsRepo) {
        this.myPrincipalsRepo = myPrincipalsRepo;
    }

    @GetMapping("/AjouterInfotitleprincipals")
    public String Ajouter(@RequestParam(name = "tconst", required = true) String tconst,
                          @RequestParam(name = "ordering", required = true) String ordering,
                          @RequestParam(name = "nconst", required = true) String nconst,
                          @RequestParam(name = "category", required = true) String category,
                          @RequestParam(name = "job", required = true) String job,
                          @RequestParam(name = "characters", required = true) String characters,
                          Model model)
    {
        TitlePrincipalsEntity T = new TitlePrincipalsEntity(tconst,ordering,nconst,category,job,characters);
        myPrincipalsRepo.save(T);
        return "AjouterInfotitleprincipals";
    }
}
