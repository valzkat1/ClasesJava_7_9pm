package org.fundacionview.form_mvc.controladores;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.fundacionview.form_mvc.modelos.InformacionBasica;
import org.fundacionview.form_mvc.modelos.InformacionLogin;
import org.fundacionview.form_mvc.modelos.Usuario;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControladorInicial {

	
ArrayList<Usuario> misUsuarios=new ArrayList<Usuario>();
	
	

@InitBinder
public void allowEmptyDateBinding( WebDataBinder binder )
	{
	    // Custom String Editor. tell spring to set empty values as null instead of empty string.
	    binder.registerCustomEditor( String.class, new StringTrimmerEditor( true ));
									
	    //Custom Date Editor
										
	    SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
	    simpleDateFormat.setLenient(false);
	    binder.registerCustomEditor( Date.class, new CustomDateEditor( simpleDateFormat,false));	   
	}


	
	
	@GetMapping("/")
	public String index(Model mod) {
		mod.addAttribute("usuario",new Usuario());
		return "index";
	}
	
	@PostMapping("/validar")
	public String validar(@Validated({InformacionBasica.class,InformacionLogin.class}) @ModelAttribute("usuario")Usuario us,BindingResult resultav,HttpServletRequest solicitud) {
		
		if(resultav.hasErrors()) {
			return "index";
		}else {
			HttpSession miSesion=solicitud.getSession();
			
			misUsuarios.add(us);
			miSesion.setAttribute("listaUsuarios", misUsuarios);
			
		return "redirect:/listar";
		}
	}
	
	@GetMapping("/listar")
	public String listarUser(Model mod,HttpServletRequest solicitud) {
		
		HttpSession miSesion=solicitud.getSession();
		
		List<Usuario> listaSession=(List<Usuario>) miSesion.getAttribute("listaUsuarios");
		mod.addAttribute("lista",listaSession);
		
		
		return "listar";
	}
	
	@GetMapping("/editar")
	public String editar(Model mod, @RequestParam("nomb")String nombre,@RequestParam("apellido")String apellidos,@RequestParam("edad")int edad,@RequestParam("telefono")String telefono,@RequestParam("direccion")String direccion) {
		
		Usuario u=new Usuario();
		u.setNombre(nombre);
		u.setApellidos(apellidos);
		u.setEdad(edad);
		u.setDireccion(direccion);
		u.setTelefono(telefono);	
		
		mod.addAttribute("usuario",u);
		
		return "editar";
	}
	
	
	@PostMapping("/validar2")
	public String validar2(@Validated({InformacionBasica.class}) @ModelAttribute("usuario")Usuario us,BindingResult resultav,HttpServletRequest solicitud) {
		
		if(resultav.hasErrors()) {
			return "editar";
		}else {
			HttpSession miSesion=solicitud.getSession();
			
			misUsuarios.add(us);
			miSesion.setAttribute("listaUsuarios", misUsuarios);
			
		return "redirect:/listar";
		}
	}
	
}
