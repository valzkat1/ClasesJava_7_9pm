package clases.hijos;

import clases.padre.Producto;

public class ProductosRefrigerados extends Producto{

	private String codigoSupervisionAlim;
	private double temperaturaMantenim;
	
	public ProductosRefrigerados() {
		super();
	}
	
	public String getCodigoSupervisionAlim() {
		return codigoSupervisionAlim;
	}
	public void setCodigoSupervisionAlim(String codigoSupervisionAlim) {
		this.codigoSupervisionAlim = codigoSupervisionAlim;
	}
	public double getTemperaturaMantenim() {
		return temperaturaMantenim;
	}
	public void setTemperaturaMantenim(double temperaturaMantenim) {
		this.temperaturaMantenim = temperaturaMantenim;
	}
	
	
	
	
}
