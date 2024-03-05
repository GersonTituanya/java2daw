package com.example.repository;

import com.example.model.Circuits;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CircuitsRepository extends JpaRepository <Circuits,Integer>{
}
