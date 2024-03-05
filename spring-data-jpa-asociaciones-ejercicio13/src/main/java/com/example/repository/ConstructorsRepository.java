package com.example.repository;

import com.example.model.Constructors;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConstructorsRepository extends JpaRepository <Constructors,Integer>{
}