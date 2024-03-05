package com.example.spring_ejercicio11.service;

import com.example.spring_ejercicio11.repository.DriverRepository;
import org.springframework.stereotype.Service;

import com.example.spring_ejercicio11.model.Driver;
import java.util.List;

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

}
