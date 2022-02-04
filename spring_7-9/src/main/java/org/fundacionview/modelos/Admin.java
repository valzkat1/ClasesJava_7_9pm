package org.fundacionview.modelos;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class Admin extends Persona implements Acciones{

	@Override
	public String toString() {
		return "Admin [getNombre()=" + getNombre() + ", getApellidos()=" + getApellidos() + ", getEdad()=" + getEdad()
				+ ", getEmail()=" + getEmail() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	@Override
	public String getHorario() {
		// TODO Auto-generated method stub
		return "Horario de oficina**";
	}

	@Override
	public String getTipo() {
		// TODO Auto-generated method stub
		return "Admin";
	}

	@Override
	public String Tareas() {
		// TODO Auto-generated method stub
		return "Verificar estados de cuenta y supervisar funciones de operarios";
	}

	
	
	
}
