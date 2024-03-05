package com.example.controller;


import com.example.model.Manufacturer;
import com.example.service.ManufacturerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ManufacturerController {

    public ManufacturerController(ManufacturerService service) {
        this.service = service;
    }

    private ManufacturerService service;

    // GET http://localhost:8080/api/manufacturers

    @GetMapping("/manufacturers")
    public ResponseEntity<List<Manufacturer>> findAll(){

        List<Manufacturer> manufacturers = this.service.findAll();
        if (manufacturers.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(manufacturers);
    }


    @GetMapping("/manufacturers/year/{year}")
    public ResponseEntity<List<Manufacturer>> findAllByYear(@PathVariable Integer year){

        List<Manufacturer> manufacturers = this.service.findAllByYear(year);
        if (manufacturers.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(manufacturers);
    }

    @GetMapping("/manufacturers/{id}")
    public ResponseEntity<Manufacturer> findAllById(@PathVariable Long id){

        return this.service.findById(id).map(ResponseEntity::ok).orElseGet(() ->ResponseEntity.notFound().build());
    }

    @PostMapping("/manufacturers")
    public ResponseEntity<Manufacturer> create(@RequestBody Manufacturer manufacturer){
        this.service.save(manufacturer);
        return ResponseEntity.ok(manufacturer);
    }

    @PutMapping("/manufacturers")
    public ResponseEntity<Manufacturer> update(@RequestBody Manufacturer manufacturer){
        this.service.save(manufacturer);
        return ResponseEntity.ok(manufacturer);
    }

    @DeleteMapping("/manufacturers/{identifier}")
    public ResponseEntity<Manufacturer> deleteById(@PathVariable("identifier") Long id){
        this.service.deleteById(id);
        return ResponseEntity.noContent().build();
    }

}
