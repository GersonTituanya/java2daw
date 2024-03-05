package controllers;

import org.springframework.stereotype.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDateTime;

@Controller
public class MiPrimerControlador {
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("hora", LocalDateTime.now());
        return "index";
    }
}