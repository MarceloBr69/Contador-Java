package com.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpSession;
@Controller
public class contador {
	@GetMapping("/")
	public String Home(HttpSession httpsession, Model model) {
		Integer contador = (Integer)httpsession.getAttribute("contador");
		if(contador == null) {
			contador = 0; 
		}
		else {
			contador++;
		}
		return "home.jsp"; 
	}
	@GetMapping("/opcional")
	public String Opcional(HttpSession httpsession, Model model) {
		Integer contador = (Integer) httpsession.getAttribute("contador");  
		if(contador == null) {
			contador = 0; 
		}
		else {
			contador=+2;
		}
		return "opcional.jsp"; 
	}
	@GetMapping("/page")
	public String Page(HttpSession httpsession) {
		return "page.jsp"; 
	}
	@GetMapping("/reset")
	public String Reset(HttpSession httpsession) {
		return "redirect:/Home"; 
	}
}
