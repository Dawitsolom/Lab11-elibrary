package edu.mum.cs.sc425.demowebapps.elibrary.elibrary.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class homePageController {

    @GetMapping(value = {"/", "/elibrary", "/elibrary/home" })
    public String displayHomePage(){
        return "home/index";
    }
}
