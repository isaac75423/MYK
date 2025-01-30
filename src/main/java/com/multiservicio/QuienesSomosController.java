package com.multiservicio;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class QuienesSomosController {

    @GetMapping("/quienesSomos")
    public String quienesSomos(Model model) {
        model.addAttribute("titulo", "Quiénes Somos");
        return "layout/quienesSomos"; 

}
}