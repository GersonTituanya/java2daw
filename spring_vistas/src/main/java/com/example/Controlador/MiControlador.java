package com.example.Controlador;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.Modelos.Usuario;


@Controller
@RequestMapping("/app")
public class MiControlador {

    @Value("${texto.indexcontroller.index.titulo}")
    private String textoIndex;

    @Value("${texto.indexcontroller.perfil.titulo}")
    private String textoPerfil;

    @Value("${texto.indexcontroller.listar.titulo}")
    private String textoListar;

   @GetMapping("/index")
    public String index(Model model){
        model.addAttribute("titulo",textoIndex);
        return "index";
    }

    @RequestMapping("/perfil")
    public String perfil(Model model){
        Usuario usuario = new Usuario("Fran", "Garcia", "fran@iessanvicente.com");
        model.addAttribute("usuario", usuario);
        model.addAttribute("titulo",textoPerfil.concat(usuario.getNombre()));
        return "perfil";
    }

    @RequestMapping(value = "/listar")
    public String listar(Model model){
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("Fran", "Garcia", "fran@fran.com"));
        usuarios.add(new Usuario("Dani", "Garcia", "dani@dani.com"));
        usuarios.add(new Usuario("Consuelo", "López", "consu@consu.com"));
        model.addAttribute("titulo",textoListar);
        model.addAttribute("usuarios",usuarios);
        return "listar";
    }
}

