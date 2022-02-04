package clases;

import java.io.File;
import java.io.FileReader;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Ejercicio1 {


	public static void MostrarArchivo() {
		FileReader lector=null;
		try {
			File archivo=new File("archivo2.txt");
			lector=new FileReader(archivo);
			
			LeerJson(lector);
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
	}
	
	public static void LeerJson(FileReader lector) {
		
		JSONParser parser=new JSONParser();
		
		try {
			Object objArch= parser.parse(lector);
			
			JSONObject jso= (JSONObject)objArch;
			
			String depar= (String)jso.get("departamento");
			String nombDe= (String)jso.get("nombredepto");
			String Derect= (String)jso.get("director");
			
			System.out.println("Departamento: "+depar);
			System.out.println("Nombre Departamento: "+nombDe);
			 
			
			JSONArray empleados= (JSONArray) jso.get("empleados");
			
		
			Iterator<JSONObject> iterable = empleados.iterator();
			
			while(iterable.hasNext()) {
				System.out.println(iterable.next());
			}
			
			
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("Ejecutando***");
		MostrarArchivo();
		
	}
	
	
}
