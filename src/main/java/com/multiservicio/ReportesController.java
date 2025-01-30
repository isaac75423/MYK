package com.multiservicio;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ReportesController {

    @GetMapping("/reportes/principal")
    public String reportes(Model model) {
        model.addAttribute("titulo", "reportes");
        return "layout/reportes/principal"; 

}
}