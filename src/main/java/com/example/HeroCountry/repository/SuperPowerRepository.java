package com.example.HeroCountry.repository;

import com.example.HeroCountry.model.SuperPower;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface SuperPowerRepository extends JpaRepository<SuperPower , Long> {


}
