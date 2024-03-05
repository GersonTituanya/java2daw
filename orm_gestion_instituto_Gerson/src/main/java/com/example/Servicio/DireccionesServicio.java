package com.example.Servicio;

import java.util.List;
import java.util.Optional;

import com.example.entities.Direcciones;
import com.example.entities.Modulos;
import com.example.entities.Profesores;
import com.example.repositories.*;

import org.springframework.stereotype.Service;

import com.example.repositories.AlumnosRepository;
import com.example.entities.Alumnos;
@Service
public class DireccionesServicio {

    private final DireccionesRepository direccionesRepository;

    public DireccionesServicio(DireccionesRepository direccionesRepository) {
        this.direccionesRepository = direccionesRepository;
    }

    public Optional<Direcciones> insertarDireccion(Direcciones direccion) {
        return Optional.of(direccionesRepository.save(direccion));
    }

    public Optional<Direcciones> actualizarDireccion(Direcciones direccion) {
        if (direccionesRepository.findAllById(direccion.getId())) {
            return Optional.of(direccionesRepository.save(direccion));
        }

        return null;
    }

    public List<Direcciones> listarDireccion() {
        return direccionesRepository.findAll();
    }

    void borrarDireccion(Direcciones direccion){
        direccionesRepository.delete(direccion);
    }
}
