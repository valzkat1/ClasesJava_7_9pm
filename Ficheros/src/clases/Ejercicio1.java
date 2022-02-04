package clases;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JOptionPane;

/*Realiza un programa en JAVA en el que muestres un menu que te permita 3
opciones:
1. Creacion de un fichero de texto (con el nombre que tu quieras) en el que indiques en
cada linea:
Tu Nombre.
Tus Apellidos.
Tu Ciudad de Nacimiento.
2. Mostrar por pantalla el contenido del fichero de texto creado.
3. Salir del Programa.*/


public class Ejercicio1 {

	
	static String nombreArchivo;
	
	public static void CrearArchivo(String nombre) {
		nombreArchivo=nombre;
		FileWriter escritor=null;
		try {
			 escritor=new FileWriter(nombre+".txt");
			 PrintWriter pw=new PrintWriter(escritor);
			 EscribirArchivo(pw);
			 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
			try {
				
				if(escritor!=null) {
					escritor.close();
				}
				
			}catch (Exception e) {
				// TODO: handle exception
			}
			
		}
		
		
		
	}
	public static void EscribirArchivo(PrintWriter pw) {
		Scanner teclado= new Scanner(System.in);
		
		String nombre,apellido,cuidad;
		System.out.println("Por favor digita el nombre");
		nombre=teclado.nextLine();
		pw.println(nombre);
		
		System.out.println("Por favor digita el apellido");
		apellido=teclado.nextLine();
		pw.println(apellido);
		
		System.out.println("Por favor digita la ciudad");
		cuidad=teclado.nextLine();
		pw.println(cuidad);
		
	}
	
	
	public static void MostrarArchivo() {
		FileReader lector=null;
		try {
			File archivo=new File(nombreArchivo+".txt");
			lector=new FileReader(archivo);
			BufferedReader buffer=new BufferedReader(lector);
			LeerArchivo(buffer);
		}catch (IOException e) {
			// TODO: handle exception
		}
		
		
	}
	
	
	public static void LeerArchivo(BufferedReader bufRead) {
		String linea=null;
		try {
			 linea=bufRead.readLine();
			 while(linea!=null) {
				 System.out.println(linea);
				 linea= bufRead.readLine();
				 
			 }
			 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public static void main(String[] args) {
		
		MostrarMenu();
		
	}
	
	
	public static void MostrarMenu() {
		
		int opcion=0;
		
		do {
			
			opcion= SolicitarCapoEntero("Por favor seleccione una opcion: \n"+
										"1. Crear Archivo \n"+
										"2. Mostrar contenido \n"+
										"3. Salir");
			
			switch (opcion) {
			case 1: {
				CrearArchivo("archivo2");
				break;
			}
			case 2: {
				MostrarArchivo();
				break;
			}
			case 3:{
				
			break;	
			}
			default:{
				break;
			}
			}
			
			
			
		}while(opcion!=3);
		
		
		
	}
	
	public static int SolicitarCapoEntero(String mensaje) {
		int retorno=0;
		while(retorno<1) {
			retorno=convertirEntero(JOptionPane.showInputDialog(mensaje));
		}
		return retorno;
	}	
		
		
	public static int convertirEntero(String numer) {
		int retorno=0;
		try {
			retorno=Integer.parseInt(numer);
		}catch (NumberFormatException e) {
			// TODO: handle exception
		}
		return retorno;
	}
}
