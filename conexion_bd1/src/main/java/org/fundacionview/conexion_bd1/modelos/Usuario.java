package org.fundacionview.conexion_bd1.modelos;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Usuario {
	

	public int getCc() {
		return cc;
	}


	public void setCc(int cc) {
		this.cc = cc;
	}
	
	@Id
	private int cc;
	private String nombre;
	private String apellidos;
	private int edad;
	
	public Usuario() {
		super();
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
	
	
	
	

}
