package org.fundacionview.controladores;

import org.fundacionview.modelos.Estudiante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControladorUno {
	
	@Autowired
	Estudiante es;
	
	@GetMapping("/")
	public String index(Model mod) {
		
		es.setNombre("Victor");
		es.setEdad(30);
		mod.addAttribute("estudiante",es);
		return "index";
	}
	
	
	@PostMapping("/procesarEstudiante")
	public String procesarEstudiante(Model mod,@RequestParam("nombre")String nombre,@RequestParam("apellidos")String apellidos,@RequestParam("edad")int edad) {
		
		es.setNombre(nombre);
		es.setApellidos(apellidos);
		es.setEdad(edad);
		
		mod.addAttribute("estudiante",es);
		return "resultado";
	}


}
