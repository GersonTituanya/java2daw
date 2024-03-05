package com.example.Servicio;

import java.util.List;
import java.util.Optional;

import com.example.entities.Modulos;
import com.example.repositories.AlumnosRepository;

import com.example.repositories.ModulosRepository;
import org.springframework.stereotype.Service;

import com.example.repositories.AlumnosRepository;
import com.example.entities.Alumnos;
@Service
public class ModuloServicio {

    private final ModulosRepository modulosRepository;

    public ModuloServicio(ModulosRepository modulosRepository) {
        this.modulosRepository = modulosRepository;
    }

    public Optional<Modulos> insertarModulo(Modulos modulo) {
        return Optional.of(modulosRepository.save(modulo));
    }

    public Optional<Modulos> actualizarModulo(Modulos modulo) {
        if (modulosRepository.findAllById(modulo.getId())) {
            return Optional.of(modulosRepository.save(modulo));
        }

        return null;
    }

    public List<Modulos> listarModulo() {
        return modulosRepository.findAll();
    }

    void borrarModulo(Modulos modulo){
        modulosRepository.delete(modulo);
    }
}
