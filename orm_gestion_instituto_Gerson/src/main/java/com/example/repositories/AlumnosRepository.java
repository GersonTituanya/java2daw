package com.example.repositories;

import com.example.entities.Alumnos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AlumnosRepository extends JpaRepository <Alumnos,Integer>{

    boolean findAllById(Integer id);
}
