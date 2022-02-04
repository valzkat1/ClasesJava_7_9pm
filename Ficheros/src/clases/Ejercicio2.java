package clases;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/*
 * Crea un fichero de texto, en el Bloc de Notas, con el nombre y contenido
que tú quieras. Ahora crea una aplicación en JAVA que lea este fichero de
texto (¡OJO! Carácter a carácter, no línea a línea) y muestre su
contenido por pantalla sin espacios.
• Por ejemplo, si un fichero contiene el texto “Esto es una prueba”, deberá mostrar por
pantalla “Estoesunaprueba”.
 */


public class Ejercicio2 {


	public static void MostrarArchivo() {
		FileReader lector=null;
		try {
			File archivo=new File("archivo2.txt");
			lector=new FileReader(archivo);
			
			LeerPorLetra(lector);
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
	}
	
	
	public static void  LeerPorLetra(FileReader lect) throws IOException {
		
		int caracter;
		String letra;
		
		caracter=lect.read();
		
		while(caracter!=-1) {
			
			letra=  ((char)caracter)+"";
		
			
			System.out.print(letra.trim());
			
			caracter = lect.read();
			
		}
		
		
		
	} 
	
	
	
	public static void main(String[] args) {
		System.out.println("En ejecucion");
		MostrarArchivo();
		
	}
	
	
}
