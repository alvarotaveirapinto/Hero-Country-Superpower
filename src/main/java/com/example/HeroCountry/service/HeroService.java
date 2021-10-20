package com.example.HeroCountry.service;

import com.example.HeroCountry.model.Hero;
import com.example.HeroCountry.repository.HeroRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HeroService {
    private final HeroRepository heroRepo;


    public HeroService(HeroRepository heroRepo) {
        this.heroRepo = heroRepo;
    }

    public List<Hero> findAll() {
        return heroRepo.findAll();
    }
    public Hero findById(Long id) {
        Optional<Hero> hero = heroRepo.findById(id);
        if(hero.isPresent()) return hero.get();
        return null;
    }

    public Hero save(Hero hero) {
        return heroRepo.save(hero);
    }
}