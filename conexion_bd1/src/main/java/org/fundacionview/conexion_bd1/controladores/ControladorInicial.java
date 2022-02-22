package org.fundacionview.conexion_bd1.controladores;

import javax.validation.Valid;

import org.fundacionview.conexion_bd1.modelos.Usuario;
import org.fundacionview.conexion_bd1.repositorios.Repo_Usuarios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControladorInicial {

	@Autowired
	Repo_Usuarios misUsuarios;
	
	@GetMapping("/")
	public String index(Model mod) {
		mod.addAttribute("usuario",new Usuario());
		return "index";
	}
	
	
	@PostMapping("/validar")
	public String guardar(@Valid @ModelAttribute("usuario")Usuario u,Model mod,BindingResult rv) {
		if(rv.hasErrors()) {
			
			return "index";
		}else {
			
			misUsuarios.save(u);
			//Insert into usuario set nombre=,ape
		   return "redirect:/ok";
		}
	}
	
	@GetMapping("/ok")
	public String ok() {
		return "ok";
	}
	
	@GetMapping("/listar")
	public String listaU(Model mod) {
		
		mod.addAttribute("listaUser",misUsuarios.findAll());
		return "listar";
	}
	
	
	@GetMapping("/editar")
	public String editar(Model mod,@RequestParam("id")int id) {
		
		mod.addAttribute("usuario",misUsuarios.getById(id));
		
		return "editar";
	}
	
	@GetMapping("/eliminar")
	public String borrar(Model mod,@RequestParam("id")int id) {
		
		misUsuarios.deleteById(id);
		
		return "redirect:/listar";
	}
}
