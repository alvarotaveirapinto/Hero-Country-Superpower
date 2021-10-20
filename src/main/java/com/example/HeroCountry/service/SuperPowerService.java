package com.example.HeroCountry.service;

import com.example.HeroCountry.model.SuperPower;
import com.example.HeroCountry.repository.SuperPowerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SuperPowerService {
    @Autowired
    private SuperPowerRepository superPowerRepository;

    public List<SuperPower> findAll() {
        return superPowerRepository.findAll();
    }


}
