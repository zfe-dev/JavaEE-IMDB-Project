package com.projetNetflixBdd.projetNetflixBdd.Controllers;

import com.projetNetflixBdd.projetNetflixBdd.model.FilmRepo;
import com.projetNetflixBdd.projetNetflixBdd.model.NameBasicsEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class NameBasicsController {

    private final FilmRepo filmRepo;

    public NameBasicsController(FilmRepo film){
        this.filmRepo = film;
    }

    @GetMapping("/AjouterInfo")
    public String Ajouter(@RequestParam(name = "name", required = false, defaultValue = "world") String name,Model model){

        model.addAttribute("name", name);
        NameBasicsEntity N = new NameBasicsEntity("tutu",name,"123","56","lkl","kk");
        N.setPrimaryName(name);
        filmRepo.save(N);

        return "AjouterInfo";
    }

}
