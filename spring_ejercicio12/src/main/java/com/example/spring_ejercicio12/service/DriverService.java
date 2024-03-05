package com.example.spring_ejercicio12.service;

import com.example.spring_ejercicio12.model.Driver;
import java.util.List;
import java.util.Optional;

public interface DriverService {

    List<Driver> getAllDrivers();

    Optional<Driver> getDriverByCode(String code);

    Optional<Driver> saveDriver(Driver driver);


    void deleteDriverByCode(String code);
}
