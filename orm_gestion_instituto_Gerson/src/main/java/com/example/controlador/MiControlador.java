package com.example.controlador;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.entities.*;
import com.example.repositories.*;
import com.example.Servicio.*;



@Controller
@RequestMapping("/examen")
public class MiControlador {

    @Autowired
    private AlumnosServicio alumnosServicio;

    @Autowired
    private ProfesorServicio profesorServicio;

    @Autowired
    private ModuloServicio moduloServicio;

    @RequestMapping(value = "/index")
    public String index(Model model){
        model.addAttribute("titulo","GESTIÓN DE INSTITUTO");
        model.addAttribute("alumnos","Alumnos");
        model.addAttribute("profesorado","Profesorado");
        model.addAttribute("modulos","Modulos");
        return "index";
    }

    @RequestMapping(value = "/alumnado")
    public String apartadoAlumnado(Model model){
        List<Alumnos> alumnos = new ArrayList<>();
        alumnos.addAll(alumnosServicio.listarAlumno());
        model.addAttribute("titulo","Lista alumnos");
        model.addAttribute("alumnos",alumnos);
        return "alumnado";
    }

    @RequestMapping(value = "/profesorado")
    public String apartadoProfesorado(Model model){
        List<Profesores> profesores = new ArrayList<>();
        profesores.addAll(profesorServicio.listarProfesor());
        model.addAttribute("titulo","Lista profesores");
        model.addAttribute("profesores",profesores);
        return "profesorado";
    }

    @RequestMapping(value = "/modulos")
    public String apartadoModulos(Model model){
        List<Modulos> modulos = new ArrayList<>();
        modulos.addAll(moduloServicio.listarModulo());
        model.addAttribute("titulo","Lista Modulos");
        model.addAttribute("modulos",modulos);
        return "modulos";
    }
}
