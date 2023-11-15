package com.simplestexample.demosimplestweb.controller;

import com.simplestexample.demosimplestweb.model.Star;
import com.simplestexample.demosimplestweb.model.StarDB;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class WelcomeController {

    @GetMapping("/welcome")
    public List<Star> welcome(){
        List<Star> listOfStars = new ArrayList<>();
        for (Star star : StarDB.starDB) listOfStars.add(star);
        return listOfStars;
    }

    @PostMapping("/addstar")
    public void addStar(@RequestBody Star star){
        StarDB.starDB.add(star);
        System.out.println(star);
    }

}
