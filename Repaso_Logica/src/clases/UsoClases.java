package clases;
import java.lang.Math;

import javax.swing.JOptionPane;


public class UsoClases {

	public static int LanzarDado() {
		
		int valorDado= (int) (Math.random()*6+1);
		return valorDado;
	}
	
	
	public static void main(String[] args) {
		
		int dado1=LanzarDado();
		int dado2=LanzarDado();
		
		if(dado1>dado2) {
			System.out.println("Dado1: "+dado1);
			System.out.println("Dado2: "+dado2);
			System.out.println("El ganador es Dado1");
		}else if(dado2>dado1) {
			System.out.println("Dado1: "+dado1);
			System.out.println("Dado2: "+dado2);
			System.out.println("El ganador es Dado2");
		}else {
			System.out.println("Dado1: "+dado1);
			System.out.println("Dado2: "+dado2);
			System.out.println("Empate");
		}
		
		
		System.out.println("El resultado de evaluar la funcion en x=0 es: "+evaluarFuncion(0));
		
		System.out.println("Comparacion sin caseSensitive entre TeXt1 y text1 "+compararCadenas("TeXt1", "text1") );
		
		//String cadena=JOptionPane.showInputDialog("Por favor ingrese el texto");
		
		//JOptionPane.showMessageDialog(null,"La cadena sin espacios es: " +eliminarEspacios(cadena) );
		
		System.out.println("Metodo repleace String--  original='Cuaquier cosa que se nos ocurra con otra cosa' ,Modificar: 'cosa'  , NuevoText: 'Elemento' "+reeplazarCadenas("Cuaquier cosa que se nos ocurra con otra cosa", "cosa", "Elemento"));
		
	}
	
	
	public static double evaluarFuncion(int x) {
		
		double resultado= Math.sqrt( Math.sin( Math.pow(x, 3) + 2*x/9  ) + Math.cos( 6*Math.PI + Math.tan(Math.pow(Math.E , Math.pow(x, 3)  )  ) ));
		
		double fraccion         = 2*x/9;
		double potenciax3       = Math.pow(x, 3);
		double seisPi           = 6*Math.PI;
		double eulerPotenciaX3  = Math.pow(Math.E, potenciax3); 
		double tangEulerPotenc  = Math.tan(eulerPotenciaX3);
		double coseno 			= Math.cos(seisPi  + tangEulerPotenc);
		double seno				= Math.sin(potenciax3 + fraccion);
		double resultado2 		= Math.sqrt(seno + coseno);
		
		System.out.println("Resultado2 "+resultado2);
		return resultado;
	}
	

	
	
	public static String compararCadenas(String cadena1,String cadena2) {
		String retorno="";
		if(cadena1.equalsIgnoreCase(cadena2)){
			retorno="Los Textos coinciden";
		}else {
			retorno="Los Textos son diferentes";
			
		}
		
		return retorno;
	}
	
	public static String eliminarEspacios(String cadena) {
		

		
		return cadena.trim();
		
	}
	
	public static String reeplazarCadenas(String original,String modificar,String nuevoText) {
		
		return original.replace(modificar, nuevoText); 
		
	}
	
	 
	
	
	
	
}
