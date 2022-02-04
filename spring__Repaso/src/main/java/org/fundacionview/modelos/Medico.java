package org.fundacionview.modelos;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Medico extends Persona{

	private int precioConsulta;
	private String especialidad;
	
	
	public Medico() {
		super();
	}
	
	
	public int getPrecioConsulta() {
		return precioConsulta;
	}
	public void setPrecioConsulta(int precioConsulta) {
		this.precioConsulta = precioConsulta;
	}
	public String getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	
	

	@Override
	public String toString() {
		return "Medico [precioConsulta=" + precioConsulta + ", especialidad=" + especialidad + ", nombre=" + nombre
				+ ", edad=" + edad + ", sexo=" + sexo + ", RUT=" + RUT + ", peso=" + peso + ", altura=" + altura
				+ ", getPrecioConsulta()=" + getPrecioConsulta() + ", getEspecialidad()=" + getEspecialidad()
				+ ", getNombre()=" + getNombre() + ", getEdad()=" + getEdad() + ", getSexo()=" + getSexo()
				+ ", getRUT()=" + getRUT() + ", getPeso()=" + getPeso() + ", getAltura()=" + getAltura()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	
	
	
}
