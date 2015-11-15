package com.alonmack.controller;

import com.alonmack.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FirstController {

    private PersonService personService;

    @Autowired
    public FirstController(PersonService personService) {
        this.personService = personService;
    }

    @RequestMapping(value = {"/login", "/index"})
    public String home(@RequestParam(value = "name", required = false, defaultValue = "World") String name, Model model) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (auth != null && !(auth instanceof AnonymousAuthenticationToken)) {
            model.addAttribute("name", name);
            return "index";
        }
        return "login";
    }

    @RequestMapping(value = {"/users"})
    public String users(Model model) {
        model.addAttribute("person", personService.get(1));
        return "users";
    }
}