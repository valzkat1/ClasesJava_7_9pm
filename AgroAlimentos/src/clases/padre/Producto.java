package clases.padre;

import java.util.Date;

public class Producto {

	protected Date fechaCaducidad;
	protected String lote;
	protected Date fechaEnvasado;
	protected String paisOrigen;
	
	public Date getFechaEnvasado() {
		return fechaEnvasado;
	}


	public void setFechaEnvasado(Date fechaEnvasado) {
		this.fechaEnvasado = fechaEnvasado;
	}


	public String getPaisOrigen() {
		return paisOrigen;
	}


	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}


	public Producto() {
		super();
	}
	
	
	public Date getFechaCaducidad() {
		return fechaCaducidad;
	}
	public void setFechaCaducidad(Date fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}
	public String getLote() {
		return lote;
	}
	public void setLote(String lote) {
		this.lote = lote;
	}
	
	
	
}
