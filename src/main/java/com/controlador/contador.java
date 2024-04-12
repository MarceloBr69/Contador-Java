package com.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class contador {

    @GetMapping("/")
    public String home(HttpSession httpsession, Model model) {
        Integer contador = (Integer) httpsession.getAttribute("contador");
        if (contador == null) {
            contador = 0;
        } else {
            contador++;
        }
        httpsession.setAttribute("contador", contador);
        return "home.jsp"; 
    }

    @GetMapping("/opcional")
    public String opcional(HttpSession httpsession, Model model) {
        Integer contador = (Integer) httpsession.getAttribute("contador");
        if (contador == null) {
            contador = 0;
        } else {
            contador += 2;
        }
        httpsession.setAttribute("contador", contador);//ASIGNAR EL VALOR PARA PODER ENVIARLO
        return "opcional.jsp"; 
    }

    @GetMapping("/page")
    public String page(HttpSession httpsession) {
        return "page.jsp"; 
    }

    @GetMapping("/reset")
    public String reset(HttpSession httpsession) {
        httpsession.removeAttribute("contador");
        return "redirect:/"; 
    }
}

