package org.fundacionview.modelos;

public class Operario extends Persona implements Acciones{

	@Override
	public String toString() {
		return "Operario [getNombre()=" + getNombre() + ", getApellidos()=" + getApellidos() + ", getEdad()="
				+ getEdad() + ", getEmail()=" + getEmail() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	@Override
	public String getHorario() {
		// TODO Auto-generated method stub
		return "De sol a sol**";
	}

	@Override
	public String getTipo() {
		// TODO Auto-generated method stub
		return "Operario";
	}

	@Override
	public String Tareas() {
		// TODO Auto-generated method stub
		return "Atencion al usuario y Oficios varios";
	}

	
	
	
}
