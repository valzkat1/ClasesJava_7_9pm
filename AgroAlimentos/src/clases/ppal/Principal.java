package clases.ppal;

import java.util.Date;

import clases.hijos.CongeladosAire;
import clases.hijos.ProductosCongelados;
import clases.hijos.ProductosFrescos;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductosFrescos f1=new ProductosFrescos();
		f1.setLote("123454");
		f1.setFechaCaducidad(new Date(2024,12,31));
		f1.setFechaEnvasado(new Date(2021,12,31));
		f1.setPaisOrigen("Colombia");
		
		ProductosFrescos f2=new ProductosFrescos();
		f2.setLote("123455");
		f2.setFechaCaducidad(new Date(2024,12,15));
		f2.setFechaEnvasado(new Date(2021,12,15));
		f2.setPaisOrigen("Colombia");
		
		
		CongeladosAire a1=new CongeladosAire();
		a1.setDioxidoC(20);
		a1.setNitrogeno(30);
		a1.setOxigeno(40);
		a1.setVapor(10);
		
		a1.setFechaCaducidad(new Date(2024,12,31));
		a1.setFechaEnvasado(new Date(2024,12,31));
		a1.setLote("312312312");
		a1.setPaisOrigen("Chile");
		
		
		
	}

}
