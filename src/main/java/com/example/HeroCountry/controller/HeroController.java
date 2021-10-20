package com.example.HeroCountry.controller;

import com.example.HeroCountry.model.Hero;
import com.example.HeroCountry.service.HeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
@Validated
public class HeroController {
    @Autowired
    HeroService heroServ;

    @GetMapping("/heroes")
    public List<Hero> getHeroes() {
        return heroServ.findAll();
    }
    @GetMapping("/heroes/{id}")
    public Hero getHeroById(@PathVariable(name = "id") Long id) {
        return heroServ.findById(id);
    }
    @PostMapping("/heroes")
    public Hero addHero(@RequestBody @Valid Hero hero){
        return heroServ.save(hero);
    }
}