package com.miempresa.controlador;

import org.springframework.core.io.ClassPathResource;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class Controlador {
	@GetMapping("/inicio")
    public String inicio(Model model) {
        ClassPathResource resource = new ClassPathResource("index.html");
        model.addAttribute("content", resource.toString());
        return "index";
    }
	@GetMapping("/descarga")
	public String descarga(Model model) {
		ClassPathResource resource =new ClassPathResource("src/main/resources/templates/App.html");
		model.addAttribute("content", resource.toString());
		return "App";
	}
    @GetMapping("/register")
    public String register(Model model) {
    	ClassPathResource resource = new ClassPathResource("Register.html");
    	model.addAttribute("content", resource.toString());
    	return "Register";
    }
    @GetMapping("/login")
    public String login (Model model) {
    	ClassPathResource resource = new ClassPathResource("Login.html");
    	model.addAttribute("content", resource.toString());
    	return "Login";
    }
    @GetMapping("/mapa")
    public String mapa(Model model) {
    	ClassPathResource resource = new ClassPathResource("Mapa.html");
    	model.addAttribute("content",resource.toString());
    	return "Mapa";
    }
    @GetMapping("/foro")
    public String foto(Model model) {
    	ClassPathResource resource = new ClassPathResource("Foro.html");
    	model.addAttribute("content",resource.toString());
    	return "Foro";
    }
}
