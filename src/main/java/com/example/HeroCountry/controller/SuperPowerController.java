package com.example.HeroCountry.controller;

import com.example.HeroCountry.model.SuperPower;
import com.example.HeroCountry.service.SuperPowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class SuperPowerController {
    @Autowired
    private SuperPowerService superPowerService;

    @GetMapping("/superpowers")
    public List<SuperPower> getSuperPowers() {
        return superPowerService.findAll();
    }
}
