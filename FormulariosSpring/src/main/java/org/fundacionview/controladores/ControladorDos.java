package org.fundacionview.controladores;

import org.fundacionview.modelos.Estudiante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControladorDos {

	
	@Autowired
	Estudiante es;
	
	@GetMapping("/home")
	public String home(Model mod) {
		
		mod.addAttribute("estudiante",es);
		return "resultado";
	}
	
}
