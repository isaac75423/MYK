package com.multiservicio;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AsociacionesController {

    @GetMapping("/asociaciones")
    public String quienesSomos(Model model) {
        model.addAttribute("titulo", "asociaciones");
        return "layout/asociaciones"; 

}
}