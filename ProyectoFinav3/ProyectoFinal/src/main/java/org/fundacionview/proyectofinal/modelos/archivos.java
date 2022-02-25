package org.fundacionview.proyectofinal.modelos;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class archivos {

	@Id
	private int id;
	private String nombre;
	private String path;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	
	
	public archivos() {
		super();
	}
}
