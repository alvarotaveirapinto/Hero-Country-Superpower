package com.example.HeroCountry.controller;

import com.example.HeroCountry.model.Country;
import com.example.HeroCountry.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
@Validated
public class CountryController {
    @Autowired
    CountryService countryService;

    //Getting all countries in the list
    @GetMapping("/getCountries")
    public List<Country> getCountries() {
        return countryService.findAll();
    }

    //Getting a country by id
    @GetMapping("/getCountryById/{id}")
    public Optional<Country> getCountryById(@PathVariable(value = "id") Long id) {
        return countryService.findById(id);
    }

    //Creating a country
    @PostMapping(value = "/createCountry", consumes = "application/json", produces = "application/json")
    public Country createCountry(@RequestBody Country country) {
        Country newCountry = Country.builder().name(country.getName()).build();
        countryService.save(newCountry);
        return newCountry;
    }
    //Updating a country
    @PutMapping(value = "updateCountries/{id}", consumes = "application/json", produces = "application/json")
    public Country updateCountry(@PathVariable(value = "id") Long id, @RequestBody Country country) {
        Optional<Country> countryToBeUpdated = countryService.findById(id);
        if (countryToBeUpdated.isPresent()) {
            countryToBeUpdated.get().setName(country.getName());
            countryService.save(countryToBeUpdated.get());
            return countryToBeUpdated.get();
        } else {
            ResponseEntity.badRequest().body("Country not found");
            return null;
        }
    }
    //Deleting a country
    @DeleteMapping(value = "/deleteCountry/{id}")
    public void deleteCountry(@PathVariable(value = "id") Long id) {
        countryService.deleteById(id);
    }
}