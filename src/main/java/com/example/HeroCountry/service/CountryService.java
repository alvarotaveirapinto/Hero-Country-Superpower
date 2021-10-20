package com.example.HeroCountry.service;

import com.example.HeroCountry.model.Country;
import com.example.HeroCountry.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CountryService implements CountryRepository {

    @Autowired
    CountryRepository countryRepo;

    @Override
    public List<Country> findAll() {
        return countryRepo.findAll();
    }

    @Override
    public List<Country> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Country> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Country> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public <S extends Country> S save(S entity) {
        return countryRepo.save(entity);
    }

    @Override
    public void deleteById(Long aLong) {
        countryRepo.deleteById(aLong);
    }

    @Override
    public void delete(Country entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Country> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Country> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Country> findById(Long aLong) {
        return countryRepo.findById(aLong);
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Country> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Country> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Country> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Country getOne(Long aLong) {
        return null;
    }

    @Override
    public Country getById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Country> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Country> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Country> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Country> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Country> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Country> boolean exists(Example<S> example) {
        return false;
    }
}