package com.example.Controlador;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/params")
public class RquestParamController {
    
    @GetMapping({"/index","/","","/home"})
    public String index(Map<String,Object> map){
        map.put("titulo","titulo desde el modelo");
        return "params/index";
    }

    @GetMapping("/string")
    public String ver(@RequestParam(name = "texto",required = false,defaultValue = "algun valor ...") String texto , Model model){
        model.addAttribute("titulo","Ejemplo de RequestParam");
        model.addAttribute("resultado", "El texto por parámetro es: "+texto);
        return "params/ver";
    }
}
