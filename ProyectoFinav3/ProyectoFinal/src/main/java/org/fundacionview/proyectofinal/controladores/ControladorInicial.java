package org.fundacionview.proyectofinal.controladores;

import java.io.File;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.fundacionview.proyectofinal.modelos.InfoBasica;
import org.fundacionview.proyectofinal.modelos.InfoLogin;
import org.fundacionview.proyectofinal.modelos.Usuario;
import org.fundacionview.proyectofinal.modelos.archivos;
import org.fundacionview.proyectofinal.repositorios.Repo_Usuarios;
import org.fundacionview.proyectofinal.repositorios.Repo_archivos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class ControladorInicial {

	@Autowired
	Repo_Usuarios misUsuarios;
	
	@Autowired
	MessageSource misMensajes;
	
	@Autowired
	Repo_archivos misArchivos;
	
	
	
	@GetMapping("/")
	public String index(Model mod,HttpSession ses) {
		
		if(ses.getAttribute("USERNAME")!=null) {
			return "redirect:/menu";
		}else {
			
		Locale Usa=new Locale("en","US");	
			
		String txtUsuario=misMensajes.getMessage("usuarios.lblnombre", null,Usa);	
		String txtClave=misMensajes.getMessage("usuarios.lblclave", null,Usa);	
		String txtEnviar=misMensajes.getMessage("usuarios.lblenviar", null,Usa);	
	
		mod.addAttribute("txtUsuario",txtUsuario);
		mod.addAttribute("txtClave",txtClave);
		mod.addAttribute("txtEnviar",txtEnviar);
		
		
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

	@GetMapping("/editar")
	public String editarU(HttpSession ses,Model mod,@RequestParam("id")int id) {
		if(ses.getAttribute("USERNAME")!=null) {
			Usuario u=misUsuarios.getById(id);
			String tituloEdit=misMensajes.getMessage("usuarios.tituloeditar",new String[] {u.getNombre()},new Locale("en","US"));
			mod.addAttribute("tituloEdit",tituloEdit);
			mod.addAttribute("usuario",u);
			return "editarU";
		}else {
			return "redirect:/";
		}
	}
	
	@GetMapping("/archivos")
	public String creaArchivo(HttpSession ses,Model mod) {
		if(ses.getAttribute("USERNAME")!=null) {
			mod.addAttribute("archivo",new archivos());
			return "archivos";
		}else {
			return "redirect:/";
		}
	}
	
	@PostMapping("/guardarArchivo")
	public String guardarArchivo(@ModelAttribute("archivo")archivos a,BindingResult rv,Model mod,HttpSession ses,@RequestParam("path")MultipartFile archivo) {
		if(ses.getAttribute("USERNAME")!=null) {
			
			String nombAr=archivo.getOriginalFilename();
			
			try {
				archivo.transferTo(new File("/home/master/Documents/Workspace-7_9pm/ProyectoFinal/"+nombAr));
			}catch (Exception e) {
				// TODO: handle exception
			}
			
			a.setPath(nombAr);
			misArchivos.save(a);
			
			return "redirect:/listarA";
		}else {
			return "redirect:/";
		}
	}
	
	@GetMapping("/listarA")
	public String listarA(HttpSession ses,Model mod) {
		if(ses.getAttribute("USERNAME")!=null) {
			
		mod.addAttribute("listaArchivos",misArchivos.findAll());
			
			return "listarA";
		}else {
			return "redirect:/";
		}
	}
	
}
