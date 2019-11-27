package com.projetNetflixBdd.projetNetflixBdd.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FormulaireTitlePrincipals {
    @RequestMapping(value="/formulairetitleprincipals",method = RequestMethod.GET)
    public String viewHome(){
        return "formulairetitleprincipals";
    }
}
