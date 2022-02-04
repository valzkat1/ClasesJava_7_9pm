package clases.hijos;

import clases.padre.Producto;

public class ProductosCongelados extends Producto{

	private double temperaturaMantenim;

	
	public ProductosCongelados() {
		super();
	}
	
	public ProductosCongelados(double temperaturaMantenim) {
		super();
		this.temperaturaMantenim = temperaturaMantenim;
	}

	public double getTemperaturaMantenim() {
		return temperaturaMantenim;
	}

	public void setTemperaturaMantenim(double temperaturaMantenim) {
		this.temperaturaMantenim = temperaturaMantenim;
	}
	


	
	
	
}
