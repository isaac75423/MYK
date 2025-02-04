package com.multiservicio;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductosController{

    @GetMapping("/producto")
    public String Productos(Model model) {
        model.addAttribute("titulo", "producto");
        return "layout/producto"; 

}
}
