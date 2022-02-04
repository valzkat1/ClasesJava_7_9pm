package clases;

import javax.swing.JOptionPane;

public class Principal {


	public static void main(String[] args) {
		
		Medico medi=new Medico();
		
		medi.setNombre("Dr. Chapatin");
		medi.setEdad(60);
		medi.setEspecialidad("Nutricionista");
		medi.setPrecioConsulta(150000);
		medi.setRUT("102391283000");
		medi.setSexo("H");
		medi.setAltura(1.75);
		medi.setPeso(80);
		
		Paciente paci=new Paciente();
		paci.setNombre(JOptionPane.showInputDialog("Por favor ingrese el nombre del paciente"));
		paci.setRUT(JOptionPane.showInputDialog("Por favor ingrese el RUT del paciente"));
		paci.setEdad(SolicitarCapoEntero("Por favor ingrese la edad del paciente"));
		paci.setSexo(JOptionPane.showInputDialog("Por favor ingrese la orientacion sexual (M=Mujer  H=Hombre)"));
		paci.setPeso(SolicitarCapoEntero("Por favor ingrese el peso del paciente"));
		paci.setAltura(SolicitarCampoReal("Por favor ingrese la altura del paciente"));
		paci.setFechaPrimerConsulta(JOptionPane.showInputDialog("Por favor ingrese la fecha de la primera consulta"));
		paci.setMedicoTratante(medi);
		
		String mensaje="";
		if(paci.calcularIMC()==-1) {
			mensaje="Esta por debajo del peso ideal";
		}else if(paci.calcularIMC()==0) {
			mensaje="Esta en el peso ideal";
		}else {
			mensaje="Tiene sobrepeso";
		}
		JOptionPane.showMessageDialog(null, mensaje);
	
		if(paci.esMayorDeEdad()) {
			JOptionPane.showMessageDialog(null, "El paciente "+paci.getNombre()+"  es mayor de edad");
		}else {
			JOptionPane.showMessageDialog(null, "El paciente "+paci.getNombre()+"  es menor de edad");

		}
		System.out.println(paci.toString());
	}
	
public static double SolicitarCampoReal(String mensaje) {
	double reto=0.0;
	
	while(reto<1) {
		reto=convertirReal(JOptionPane.showInputDialog(mensaje));
	}
	return reto;
}	
	
public static double convertirReal(String number) {
	double reto=0.0;
	try {
		reto=Double.parseDouble(number);
	}catch (NumberFormatException e) {
		// TODO: handle exception
	}
	return reto;
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
