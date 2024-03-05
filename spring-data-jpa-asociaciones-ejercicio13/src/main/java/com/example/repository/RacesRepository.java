package com.example.repository;

import com.example.model.Races;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RacesRepository extends JpaRepository <Races,Integer>{
}