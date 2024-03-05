package com.example.service;

import com.example.model.Manufacturer;

import java.util.List;
import java.util.Optional;

public interface ManufacturerService {

    // READ
    List<Manufacturer> findAll();
    List<Manufacturer> findAllByYear(Integer year);
    Optional<Manufacturer> findById(Long id);
    Optional<Manufacturer> findByName(String name);

    //CREATE / Update
    Manufacturer save(Manufacturer manufacturer);

    // DELETE

    void deleteById(Long id);
    void deleteALL();
}
