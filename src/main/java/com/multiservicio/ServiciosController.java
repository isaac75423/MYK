package com.multiservicio;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ServiciosController {

    @GetMapping("/servicios")
    public String quienesSomos(Model model) {
        model.addAttribute("titulo", "servicios");
        return "layout/servicios"; 

}
}