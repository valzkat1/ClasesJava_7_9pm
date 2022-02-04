package org.fundacionview.controladores;

import org.fundacionview.modelos.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/apis")
public class ControladorDos {

	
	@Autowired
	//ApplicationContext miContexto;
	Admin miAd;
	
	
	
	@GetMapping("/home")
	public String index(Model mod) {
		
		//Admin miAd=(Admin) miContexto.getBean("miAdmin");
		mod.addAttribute("admin",miAd);
		
		return "indexApis";
	}
	
}
