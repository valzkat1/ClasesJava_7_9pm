package org.fundacionview.proyectofinal.controladores;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.fundacionview.proyectofinal.modelos.InfoBasica;
import org.fundacionview.proyectofinal.modelos.InfoLogin;
import org.fundacionview.proyectofinal.modelos.Usuario;
import org.fundacionview.proyectofinal.repositorios.Repo_Usuarios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ControladorInicial {

	@Autowired
	Repo_Usuarios misUsuarios;
	
	
	@GetMapping("/")
	public String index(Model mod,HttpSession ses) {
		
		if(ses.getAttribute("USERNAME")!=null) {
			return "redirect:/menu";
		}else {
		mod.addAttribute("usuario",new Usuario());
		return "index";
		}
	}
	
	@PostMapping("/login")
	public String logeo(@Validated({InfoLogin.class}) @ModelAttribute("usuario")Usuario u,BindingResult rv,HttpSession ses) {
		if(rv.hasErrors()) {
			return "index";
		}else {
			
			Usuario uL=misUsuarios.getLogin(u.getUsername(), u.getClave());
			//if(u.getUsername().equals("admin")&& u.getClave().equals("123456")) {
			if(uL!=null)	{
				ses.setAttribute("USERNAME", u.getUsername());
				return "redirect:/menu";
			}else {
				return "index";
			}
			
		}
		
		
	}
	
	
	@GetMapping("/menu")
	public String menu(HttpSession ses) {
		if(ses.getAttribute("USERNAME")!=null) {
			return "menu";
		}else {
			return "redirect:/";
		}
		
	}
	
	@GetMapping("/crearU")
	public String crearU(HttpSession ses,Model mod) {
		if(ses.getAttribute("USERNAME")!=null) {
			
			mod.addAttribute("usuario",new Usuario());
		return "crearUser";
	}else {
		return "redirect:/";
	}
		}
	
	@PostMapping("/crearUser")
	public String guardarU(@Validated({InfoBasica.class,InfoLogin.class}) @ModelAttribute("usuario")Usuario u,BindingResult rv,Model mod,HttpSession ses) {
		if(ses.getAttribute("USERNAME")!=null) {
			if(rv.hasErrors()) {
				return "crearUser";
			}else {
				
				
				misUsuarios.save(u);
				return "redirect:/listar";
			}
			
			
		}else {
			return "redirect:/";
		}
		
		
	}
	
	@GetMapping("/listar")
	public String listar(Model mod,HttpSession ses) {
		if(ses.getAttribute("USERNAME")!=null) {
			mod.addAttribute("listaUser",misUsuarios.findAll());
			return "listar";
		}else {
			return "redirect:/";
		}
		
	}
	
}
