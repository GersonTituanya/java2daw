package com.example.spring_ejercicio11.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.spring_ejercicio11.model.Driver;

@Repository
public interface DriverRepository extends JpaRepository<Driver,Long> {
}
