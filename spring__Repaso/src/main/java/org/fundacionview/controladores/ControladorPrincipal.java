package org.fundacionview.controladores;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.servlet.http.HttpServletRequest;

import org.fundacionview.modelos.Medico;
import org.fundacionview.modelos.Paciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControladorPrincipal {

	@Autowired
	Medico miMed;
	
	@PostConstruct
	public void PostConstruct() {
		System.out.println("Acaba de iniciar el Contenedor de Beans");
	}
	
	@PreDestroy
	public void PreDestroy() {
		System.out.println("Se esta apagando el Contenedor**** ");
	}
	
	
	@GetMapping("/")
	public ModelAndView index() {		
		ModelAndView mod=new ModelAndView("index");
		mod.addObject("dato", "Informacion desde el model and view");
		return mod;
	}
	
	
	public Paciente Llenar(HttpServletRequest solicitud) {
		Paciente p1=new Paciente();
		p1.setNombre(solicitud.getParameter("nombre"));
		p1.setEdad(convertirEntero(solicitud.getParameter("nombre")));
		p1.setSexo(solicitud.getParameter("sexo"));
		p1.setRUT(solicitud.getParameter("rut"));
		p1.setPeso(convertirEntero(solicitud.getParameter("peso")));
		p1.setFechaPrimerConsulta(solicitud.getParameter("fecha"));
		p1.setAltura(convertirReal(solicitud.getParameter("altura")));
		return p1;
	}
	
	@PostMapping("/formulario")
	public String formularioNutricion(Model mod,HttpServletRequest solicitud) {		
		
		Paciente p=Llenar(solicitud);		
		LlenarMedi(p, solicitud.getParameter("medico"));		
		mod.addAttribute("paciente",p);
		mod.addAttribute("medico", miMed);
		
		return "resultado";
	}
	
	
	
	public void LlenarMedi(Paciente p,String nombre) {
		miMed.setNombre(nombre);
		miMed.setEspecialidad("Nutricionista");
		miMed.setPrecioConsulta(120000);
		
		p.setMedicoTratante(miMed);
	}
	
	
	public static int convertirEntero(String numer) {
		int retorno=0;
		try {
			retorno=Integer.parseInt(numer);
		}catch (NumberFormatException e) {
			// TODO: handle exception
		}
		return retorno;
	}
	
	public static double convertirReal(String number) {
		double reto=0.0;
		try {
			reto=Double.parseDouble(number);
		}catch (NumberFormatException e) {
			// TODO: handle exception
		}
		return reto;
	}
	
}
