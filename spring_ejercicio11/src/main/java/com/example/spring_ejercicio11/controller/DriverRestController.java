package com.example.spring_ejercicio11.controller;

import com.example.spring_ejercicio11.model.Driver;
import com.example.spring_ejercicio11.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DriverRestController {

    private final DriverService driverService;

    @Autowired
    public DriverRestController(DriverService service){
        this.driverService = service;
    }

    @GetMapping("/drivers")
    public ResponseEntity<List<Driver>> getAll(){

        return ResponseEntity.ok(driverService.getAllDrivers());
    }
}
