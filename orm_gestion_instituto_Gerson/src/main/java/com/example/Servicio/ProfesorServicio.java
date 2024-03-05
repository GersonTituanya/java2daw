package com.example.Servicio;

import java.util.List;
import java.util.Optional;

import com.example.entities.Modulos;
import com.example.entities.Profesores;
import com.example.repositories.AlumnosRepository;

import com.example.repositories.ModulosRepository;
import com.example.repositories.ProfesoresRepository;
import org.springframework.stereotype.Service;

import com.example.repositories.AlumnosRepository;
import com.example.entities.Alumnos;
@Service
public class ProfesorServicio {

    private final ProfesoresRepository profesoresRepository;

    public ProfesorServicio(ProfesoresRepository profesoresRepository) {
        this.profesoresRepository = profesoresRepository;
    }

    public Optional<Profesores> insertarProfesor(Profesores profesor) {
        return Optional.of(profesoresRepository.save(profesor));
    }

    public Optional<Profesores> actualizarProfesor(Profesores profesor) {
        if (profesoresRepository.findAllById(profesor.getId())) {
            return Optional.of(profesoresRepository.save(profesor));
        }

        return null;
    }

    public List<Profesores> listarProfesor() {
        return profesoresRepository.findAll();
    }

    void borrarProfesor(Profesores profesor){
        profesoresRepository.delete(profesor);
    }
}
