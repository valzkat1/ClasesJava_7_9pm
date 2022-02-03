package org.fundacionview.modelos;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Estudiante {
	
	
	@PostConstruct
	public void PostConstruct() {
		System.out.println("Acaba de inicializar el contenedor de beans (Estudiante)");
	}
	
	
	@PreDestroy
	public void PreDestroy() {
		
		System.out.println("Se esta apagando el contenedor (Estudiante)");
	}
	
	private String nombre;
	private String apellidos;
	private int edad;
	
	public Estudiante() {
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


	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", getNombre()="
				+ getNombre() + ", getApellidos()=" + getApellidos() + ", getEdad()=" + getEdad() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	

}
