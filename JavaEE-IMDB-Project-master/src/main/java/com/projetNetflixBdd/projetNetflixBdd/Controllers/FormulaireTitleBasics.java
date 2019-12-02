package com.projetNetflixBdd.projetNetflixBdd.Controllers;

import com.projetNetflixBdd.projetNetflixBdd.model.TitleBasicsEntity;
import com.projetNetflixBdd.projetNetflixBdd.model.TitleBasicsRepo;
import com.projetNetflixBdd.projetNetflixBdd.model.TitleRatingsEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormulaireTitleBasics {
    @RequestMapping(value="/formulairetitlebasics",method = RequestMethod.GET)
    public String viewHome(){
        return "formulairetitlebasics";
    }


    private final TitleBasicsRepo titleBasicsRepo;

    public FormulaireTitleBasics(TitleBasicsRepo titleBasicsRepo) {
        this.titleBasicsRepo = titleBasicsRepo;
    }


    @GetMapping("/AjouterInfoTitlesBasics")
    public String Ajouter(@RequestParam(name = "tconst") String tconst,
                          @RequestParam(name = "title_type") String title_type,
                          @RequestParam(name = "primary_title") String primary_title,
                          @RequestParam(name = "original_title") String original_title,
                          @RequestParam(name = "is_adult") String is_adult,
                          @RequestParam(name = "start_year") String start_year,
                          @RequestParam(name = "end_year") String end_year,
                          @RequestParam(name = "runtime_minutes") String runtime_minutes,
                          @RequestParam(name = "genres") String genres,
                          Model model)
    {
        TitleBasicsEntity T = new TitleBasicsEntity(tconst,title_type,primary_title,original_title,is_adult,start_year,end_year,runtime_minutes,genres);
        titleBasicsRepo.save(T);
        return "AjouterInfoTitlesBasics";
    }


}
