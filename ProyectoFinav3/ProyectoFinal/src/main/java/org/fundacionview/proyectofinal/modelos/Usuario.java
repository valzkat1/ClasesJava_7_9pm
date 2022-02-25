package org.fundacionview.proyectofinal.modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;


@Entity
public class Usuario {

	@Id
	private int cc;
	@Size(min=2,message="Campo requerido",groups = {InfoBasica.class})
	private String nombre;
	@Size(min=2,groups = {InfoBasica.class})
	private String apellidos;
	@Min(value = 18,groups= {InfoBasica.class})
	private int edad;
	
	
	@NotBlank(message = "Campo requerido",groups = {InfoLogin.class})
	private String username;
	@NotBlank(message = "Campo requerido",groups = {InfoLogin.class})
	private String clave;
	
	
	public int getCc() {
		return cc;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	
	
	
	public Usuario() {
		super();
	}
	
}
