package com.example.repositories;

import com.example.entities.Alumnos;
import com.example.entities.Direcciones;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface DireccionesRepository extends JpaRepository <Direcciones,Integer>{

    boolean findAllById(Integer id);
}