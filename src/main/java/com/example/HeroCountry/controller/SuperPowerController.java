package com.example.HeroCountry.controller;

import com.example.HeroCountry.model.SuperPower;
import com.example.HeroCountry.repository.SuperPowerRepository;
import com.example.HeroCountry.service.SuperPowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@Validated
public class SuperPowerController {
    @Autowired
    private SuperPowerService superPowerService;

    @GetMapping("/superpowers")
    public List<SuperPower> getSuperPowers() {
        return superPowerService.findAll();
    }
}
