package com.projetNetflixBdd.projetNetflixBdd.Controllers;

import com.projetNetflixBdd.projetNetflixBdd.model.FilmRepo;
import com.projetNetflixBdd.projetNetflixBdd.model.NameBasicsEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class NameBasicsController {

    @RequestMapping(value="/formulairenamebasics",method = RequestMethod.GET)
    public String viewHome(){
        return "formulairenamebasics";
    }

    private final FilmRepo filmRepo;

    public NameBasicsController(FilmRepo film){
        this.filmRepo = film;
    }

    @GetMapping("/AjouterInfo")
    public String Ajouter(@RequestParam(name = "nconst") String nconst,
                          @RequestParam(name = "primary_name") String primary_name,
                          @RequestParam(name = "birth_year") String birth_year,
                          @RequestParam(name = "death_year") String death_year,
                          @RequestParam(name = "primary_profession") String primary_profession,
                          @RequestParam(name = "known_for_titles") String known_for_titles,
                          Model model)
    {
        NameBasicsEntity N = new NameBasicsEntity(nconst,primary_name,birth_year,death_year,primary_profession,known_for_titles);
        filmRepo.save(N);
        return "AjouterInfo";
    }

}
