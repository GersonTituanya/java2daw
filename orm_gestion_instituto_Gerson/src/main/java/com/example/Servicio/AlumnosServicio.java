package com.example.Servicio;

import java.util.List;
import java.util.Optional;

import com.example.repositories.AlumnosRepository;

import org.springframework.stereotype.Service;

import com.example.repositories.AlumnosRepository;
import com.example.entities.Alumnos;
@Service
public class AlumnosServicio {

    private final AlumnosRepository alumnosRepository;

    public AlumnosServicio(AlumnosRepository alumnosRepository) {
        this.alumnosRepository = alumnosRepository;
    }

    public Optional<Alumnos> insertarAlumno(Alumnos alumno) {
        return Optional.of(alumnosRepository.save(alumno));
    }

    public Optional<Alumnos> actualizarAlumno(Alumnos alumno) {
        if (alumnosRepository.findAllById(alumno.getId())) {
            return Optional.of(alumnosRepository.save(alumno));
        }

        return null;
    }

    public List<Alumnos> listarAlumno() {
        return alumnosRepository.findAll();
    }

    void borrarAlumno(Alumnos alumno){
        alumnosRepository.delete(alumno);
    }
}