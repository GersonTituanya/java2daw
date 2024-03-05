package com.example.spring_ejercicio12.service;

import com.example.spring_ejercicio12.repository.DriverRepository;
import org.springframework.stereotype.Service;

import com.example.spring_ejercicio12.model.Driver;
import java.util.List;
import java.util.Optional;

@Service
public class DriverServiceImpl implements DriverService {

    private final DriverRepository repository ;

    public DriverServiceImpl(DriverRepository repository){
        this.repository=repository;
    }

    @Override
    public List<Driver> getAllDrivers() {
        return repository.findAll();
    }

    @Override
    public Optional<Driver> getDriverByCode(String code) {
        return repository.findByCodeIgnoreCase(code);
    }

    @Override
    public Optional<Driver> saveDriver(Driver driver) {
        return Optional.of(repository.save(driver));
    }


    @Override
    public void deleteDriverByCode(String code) {
        return ;
    }
}
