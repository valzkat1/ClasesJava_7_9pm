package clases;

import clases.padre.Persona;

public class Paciente extends Persona{

	private String fechaPrimerConsulta;
	private Medico medicoTratante;
	
	
	public Paciente() {
		super();
	}
	
	
	
	public String getFechaPrimerConsulta() {
		return fechaPrimerConsulta;
	}
	public void setFechaPrimerConsulta(String fechaPrimerConsulta) {
		this.fechaPrimerConsulta = fechaPrimerConsulta;
	}
	public Medico getMedicoTratante() {
		return medicoTratante;
	}
	public void setMedicoTratante(Medico medicoTratante) {
		this.medicoTratante = medicoTratante;
	}
	
	
	public int calcularIMC() {
		int retorno;
		double pesoIdeal= peso/Math.pow(altura,2);
		System.out.println("PesoIdeal "+pesoIdeal);
		if(pesoIdeal<18.5) {
			retorno=-1;
		}else if(pesoIdeal>=18.5 && pesoIdeal<=24.9) {
			retorno=0;
		}else {
			retorno=1;
		}
		
		return retorno;
	}
	
	public boolean esMayorDeEdad() {
		if(edad>=18) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean comprobarSexo() {
		if(sexo.equalsIgnoreCase("h")|| sexo.equalsIgnoreCase("m")) {
			return true;
		}else {
			return false;
		}
		
	}



	@Override
	public String toString() {
		return "Paciente [fechaPrimerConsulta=" + fechaPrimerConsulta + ", medicoTratante=" + medicoTratante
				+ ", nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", RUT=" + RUT + ", peso=" + peso
				+ ", altura=" + altura + ", getFechaPrimerConsulta()=" + getFechaPrimerConsulta()
				+ ", getMedicoTratante()=" + getMedicoTratante() + ", calcularIMC()=" + calcularIMC()
				+ ", esMayorDeEdad()=" + esMayorDeEdad() + ", comprobarSexo()=" + comprobarSexo() + ", getNombre()="
				+ getNombre() + ", getEdad()=" + getEdad() + ", getSexo()=" + getSexo() + ", getRUT()=" + getRUT()
				+ ", getPeso()=" + getPeso() + ", getAltura()=" + getAltura() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
	
}
