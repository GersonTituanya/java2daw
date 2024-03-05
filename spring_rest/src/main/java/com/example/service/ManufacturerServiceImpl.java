package com.example.service;

import com.example.model.Manufacturer;
import com.example.model.ManufacturerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
@Service
public class ManufacturerServiceImpl implements ManufacturerService {

    public ManufacturerServiceImpl(ManufacturerRepository repository) {
        this.repository = repository;
    }

    private ManufacturerRepository repository;


    @Override
    public List<Manufacturer> findAll() {
        return this.repository.findAll();
    }

    @Override
    public List<Manufacturer> findAllByYear(Integer year) {
        Objects.requireNonNull(year);
        return this.repository.findAllByYear(year);
    }

    @Override
    public Optional<Manufacturer> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Optional<Manufacturer> findByName(String name) {
        return Optional.empty();
    }

    @Override
    public Manufacturer save(Manufacturer manufacturer) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public void deleteALL() {

    }
}
