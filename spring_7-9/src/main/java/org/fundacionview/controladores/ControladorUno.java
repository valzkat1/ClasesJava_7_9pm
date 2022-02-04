package org.fundacionview.controladores;


import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.fundacionview.modelos.Admin;
import org.fundacionview.modelos.Operario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControladorUno {
	
	
	@PostConstruct
	public void PostConstruct() {
		
		System.out.println("En este momento acaba de iniciar el contenedor de Beans****");
		miAd.setNombre("Victor");
		miAd.setApellidos("Los apellidos");
		miAd.setEdad(45);
		miAd.setEmail("correoAdmin@gmail.com");
	}
	
	//@Autowired
	//ApplicationContext miContexto;
	
	@Autowired
	Admin miAd;
	
	
	@Autowired
	Operario miOp;
	
	
	@GetMapping("/")
	public String index(Model mod) {		
	
		//Admin miAd=(Admin) miContexto.getBean("admin");
		
		
	
		mod.addAttribute("admin",miAd);
		return "index";
	}
	
	@GetMapping("/operario")
	public String datosOpe(Model mod) {
		
		//Operario miOp=(Operario) miContexto.getBean("miOperario");
		miOp.setNombre("Pepe");
		mod.addAttribute("operario",miOp);
		return "operario";
	}
	
	@GetMapping("/datos")
	public String Horarios(Model mod,@RequestParam("tipo")String tipo) {
		
		if(tipo.equals("admin")) {
			//Admin miAd=(Admin) miContexto.getBean("admin");
			mod.addAttribute("user",miAd); 
		}else if(tipo.equals("operario")) {
			//Operario miOp=(Operario) miContexto.getBean("miOperario");
			mod.addAttribute("user",miOp); 
		}
		
		
		return "datos";
	}
	
	@PreDestroy
	public void PreDestroy() {
		System.out.println("En este momento se esta apagando el contenedor..**");
	}
	
	

}
